package figure;

import java.util.List;

public class Shape {
    private List<Point> points;

    public Shape(List<Point> points) {
        this.points = points;
    }

    public double perimcalc() {
        double perimeter = 0.0;
        Point prepoint = null;

        for (Point currentPoint : points) {
            if (prepoint != null) {
                perimeter += prepoint.distance(currentPoint);
            }
            prepoint = currentPoint;
        }

        if (!points.isEmpty()) {
            perimeter += points.get(points.size() - 1).distance(points.get(0));
        }

        return perimeter;
    }

    public double LongestSide() {
        double longest = 0.0;

        for (int i = 0; i < points.size(); i++) {
            Point curPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            double distance = curPoint.distance(nextPoint);
            longest = Math.max(longest, distance);
        }

        return longest;
    }

    public double AverageSide() {
        double length = 0.0;

        for (Point curPoint : points) {
            int curInd = points.indexOf(curPoint);
            Point nextPoint = points.get((curInd + 1) % points.size());
            length += curPoint.distance(nextPoint);
        }

        return length / points.size();
    }
}
