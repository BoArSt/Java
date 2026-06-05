package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Classes.a.*;

public class NumberCheck {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number:");
        int a = Integer.parseInt(reader.readLine());
        Positive(a);
        Prime(a);
        Division(a);
    }
}
