package Tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Classes.a.Astericks;
public class Rectangle {
public static void main(String[] args)
        throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the number(Width):");
    int width = Integer.parseInt(reader.readLine());
    System.out.print("Enter the number(Length):");
    int length = Integer.parseInt(reader.readLine());
    System.out.println(Astericks(width,length));
}
}
