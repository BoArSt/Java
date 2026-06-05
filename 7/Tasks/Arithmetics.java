package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Classes.a.*;

public class Arithmetics {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number:");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Enter the number:");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Enter the sign of an arithmetic operation:");
        String sign = reader.readLine();
        switch (sign){
            case "+":
                add(a,b);
                break;
            case "-":
                sub(a,b);
                break;
            case "*":
                mult(a,b);
                break;
            case "/":
                div(a,b);
                break;
        }
    }
}
