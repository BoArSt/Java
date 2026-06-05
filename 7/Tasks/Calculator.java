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
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Enter the number:");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Enter the number:");
        int c = Integer.parseInt(reader.readLine());
        double av = 0;
        System.out.println(Calculate(a,b,c,av));
    }
}
