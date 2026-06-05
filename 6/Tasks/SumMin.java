package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Classes.a.Odd;
import static Classes.a.Sum;

public class SumMin {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number A:");
        int a = Integer.parseInt(reader.readLine()),sum = 0;
        System.out.print("Enter the number B:");
        int b = Integer.parseInt(reader.readLine());
        System.out.println(Sum(a,b,sum));
        System.out.println(Odd(a,b));
    }
}
