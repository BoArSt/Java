import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Range {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number:");
        int number = Integer.parseInt(reader.readLine());
        if (number >= 0 && number <= 14) {
            System.out.println("Your number is in the range [0-14]");
        } else if (number >= 15 && number <= 35) {
            System.out.println("Your number is in the range [15-35]");
        } else if (number >= 36 && number <= 50) {
            System.out.println("Your number is in the range [36-50]");
        } else if (number >= 51 && number <= 100) {
            System.out.println("Your number is in the range [51-100]");
        }else System.out.println("Your number is not in any rage.");
    }
}