package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Classes.a.Calculate;

public class Calculator {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number:");
        double a = Double.parseDouble(reader.readLine());
        System.out.print("Enter the number:");
        double b = Double.parseDouble(reader.readLine());
        System.out.print("Enter the number:");
        double c = Double.parseDouble(reader.readLine());
        System.out.println(Calculate(a,b,c));
    }
}
