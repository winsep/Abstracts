package advance.dev;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
    	Shape[] shapes = new Shape[10];
    	input(shapes);
    	print(shapes);
    	findLargestArea(shapes);
        findLargestAreaForEachShape(shapes);
    }
    public static void input(Shape[] shapes) {
    	shapes[0] = new Circle(2);
    	shapes[1] = new Circle(3);
        shapes[2] = new Circle(7);
        shapes[3] = new Rectangle(4, 6);
        shapes[4] = new Rectangle(3, 5);
        shapes[5] = new Rectangle(2, 8);
        shapes[6] = new Triangle(3, 4, 5);
        shapes[7] = new Triangle(6, 8, 10);
        shapes[8] = new Triangle(5, 12, 13);
        shapes[9] = new Triangle(7, 24, 25);
    }
    public static void print(Shape[] shapes) {
        for (Shape shape : shapes) {
            if (shape != null) {
                System.out.println("Chu vi: " + shape.chuvi());
                System.out.println("Diện tích: " + shape.dientich());
                System.out.println();
            }
        }
    }
    public static void findLargestArea(Shape[] shapes) {
        double maxArea = 0;
        Shape maxAreaShape = null;
        for (Shape shape : shapes) {
            if (shape != null && shape.dientich() > maxArea) {
                maxArea = shape.dientich();
                maxAreaShape = shape;
            }
        }
        System.out.println("Hình có diện tích lớn nhất:");
        System.out.println("Chu vi: " + maxAreaShape.chuvi());
        System.out.println("Diện tích: " + maxAreaShape.dientich());
        System.out.println();
    }
    public static void findLargestAreaForEachShape(Shape[] shapes) {
        System.out.println("Diện tích lớn nhất của mỗi hình:");
        for (Shape shape : shapes) {
            if (shape != null) {
                System.out.println("Diện tích lớn nhất của hình:");
                System.out.println("Diện tích: " + shape.dientich());
                System.out.println();
            }
        }
    }
    
        
}
