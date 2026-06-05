package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Classes.b.Display;

public class Bank {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int totalPaid = 0;
        System.out.println("Enter the payment amounts:");
        int a = Integer.parseInt(reader.readLine());
        Display(a);
    }
}
