package figure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Users\\user\\IdeaProjects\\Assignment1\\src\\figure\\source";
        File file = new File(filePath);

        Scanner sc = new Scanner(file);
        List<Point> points = new ArrayList<>();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            points.add(point);
        }

        Shape shape = new Shape(points);

        System.out.println("Perimeter: " + shape.perimcalc());
        System.out.println("Longest Side: " + shape.LongestSide());
        System.out.println("Average Side: " + shape.AverageSide());
    }
}