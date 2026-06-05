package Classes;

import java.util.HashSet;
import java.util.Set;

public class a {
    public static boolean Reverse(int[] a){
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        return true;
    }
    public static boolean Largest(int[] a){
        int max = a[0];
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("\nThe largest number is:" + max);
        return true;
    }
    public static boolean Smallest(int[] a){
        int min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("\nThe smallest number is:" + min);
        return true;
    }
    public static void Sum(int[] a){
        int sum = 0;
        for(int num : a){
                sum += num;
        }
        System.out.println("\nThe sum:" + sum);
    }
    public static void Arm(int[] a,int b){
        double sum = 0;
        for(int num : a){
            sum += num;
        }
        double arm = sum/b;
        System.out.println("\nThe Arithmetic mean:"+ arm);
    }
    public static void Odd(int[] a){
        for(int num : a) {
                if(num % 2 == 0) {

                }else {
                    System.out.println(num + " is odd");
                    }
                }
            }
            public static void myReverse(int[] a){
                for (int i = a.length - 1; i >= 0; i--) {
                    System.out.print(a[i] + " ");
                }
            }
    public static int[] subArray(int[] array, int index, int count) {
        int[] subArray = new int[count];
        for (int i = 0; i < count; i++) {
            if (index + i < array.length) {
                subArray[i] = array[index + i];
            } else {
                subArray[i] = 1;
            }
        }
        return subArray;
    }
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
}



