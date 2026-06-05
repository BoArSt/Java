package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Classes.a.Convert;

public class Converter {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("amount of money in a certain currency:");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("exchange rate to another currency:");
        double b = Double.parseDouble(reader.readLine());
        Convert(a, b);
    }
}
