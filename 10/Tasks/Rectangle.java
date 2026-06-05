package Tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Rectangle {
        private double side1;
        private double side2;
        public Rectangle(double side1, double side2) {
            this.side1 = side1;
            this.side2 = side2;
        }
        public double areaCalculator() {
            return side1 * side2;
        }
        public double perimeterCalculator() {
            return 2 * (side1 + side2);
        }
        public static void main(String[] args)
                throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the length of the first side: ");
            double side1 = Double.parseDouble(reader.readLine());
            System.out.print("Enter the length of the second side: ");
            double side2 = Double.parseDouble(reader.readLine());
            Rectangle rectangle = new Rectangle(side1, side2);
            double area = rectangle.areaCalculator();
            double perimeter = rectangle.perimeterCalculator();
            System.out.println("Area of the rectangle: " + area);
            System.out.println("Perimeter of the rectangle: " + perimeter);
        }
    }
