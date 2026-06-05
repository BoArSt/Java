package Tasks;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;
public class Collection1 {
    public static int[] Duplicate(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }
        return uniqueArray;
    }

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



