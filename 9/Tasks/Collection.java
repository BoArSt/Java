package Tasks;

import java.util.Random;

import static Classes.a.Duplicate;

public class Collection {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(30) + 1;
        int[] collection = new int[n];
        for (int i = 0; i < n; i++) {
            collection[i] = rand.nextInt(11);
            System.out.println("The size of an array is:" + n);
            System.out.print("The array is:");
            for (int num : collection) {
                System.out.print(num + " ");
            }
            System.out.println("The collection without duplicates:" + Duplicate(collection));
        }
    }
}
