package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Classes.a.*;

public class CustomerArray {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of an array:");
        int a = Integer.parseInt(reader.readLine());
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Array[" + (i+1) + "]=");
            array[i] = Integer.parseInt(reader.readLine());
        }
        Largest(array);
        Smallest(array);
        Sum(array);
        Arm(array,a);
        Odd(array);
    }
}
