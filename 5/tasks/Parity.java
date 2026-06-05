package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static classes.a.IsEven1;
import static classes.a.IsEven2;

public class Parity {
public static void main(String[] args)
        throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the number:");
    int number1 = Integer.parseInt(reader.readLine());
    System.out.println(IsEven1(number1));
    System.out.print("Enter the number:");
    int number2 = Integer.parseInt(reader.readLine());
    System.out.println(IsEven2(number2));
}
}
