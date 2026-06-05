package tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static classes.a.IsPowerOfTwo;
public class PowerOfTwo {
    public static void main(String[] args)
            throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number:");
        int number = Integer.parseInt(reader.readLine());
        System.out.println(IsPowerOfTwo(number));
        }
}

