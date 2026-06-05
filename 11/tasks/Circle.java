package tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static classes.MyArea.AreaOfCircle;
public class Circle {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the radius:");
        double radius = Double.parseDouble(reader.readLine());
        double area=0;
        System.out.println(AreaOfCircle(radius,area));
    }
}
