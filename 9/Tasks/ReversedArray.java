package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static Classes.a.*;

public class ReversedArray {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of an array:");
        int a = Integer.parseInt(reader.readLine());
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Array[" + (i + 1) + "]=");
            array[i] = Integer.parseInt(reader.readLine());
        }
        myReverse(array);
        System.out.print("Enter the index from which array will be started:");
        int index = Integer.parseInt(reader.readLine());
        System.out.print("Enter the count of elements for the sub-array: ");
        int count = Integer.parseInt(reader.readLine());
        int[] subArrayResult = subArray(array, index, count); System.out.print("Sub Array: " + Arrays.toString(subArrayResult));
    }
}
