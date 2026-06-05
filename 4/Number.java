import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Number {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number:");
        int number = Integer.parseInt(reader.readLine()),ld=0;
        ld = Math.abs(number%10);
        if (ld==7) {
            System.out.println("Congratulations! The last digit is 7!");
        }else System.out.println("Oops. The last digit isn't 7. It is " + ld);
    }
}
