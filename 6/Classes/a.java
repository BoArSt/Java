package Classes;

public class a {
    public static boolean Astericks(int w, int l) {
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return true;
    }

    public static boolean Sum(int a, int b, int s) {
        while (a < b) {
            s += a;
            a++;
        }
        System.out.println("The Sum between A and B is:" + s);
        return true;
    }

    public static boolean Odd(int a, int b) {
        while (a < b) {
            switch (a % 2) {
                case 0: {
                    a++;
                }
                default: {
                    System.out.println(a + " is odd");
                    a++;
                }
            }
        }
        return true;
    }

    public static boolean Rectangle(int w, int l) {
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        return true;
    }

    public static boolean Rtriangle(int s){
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        return true;
    }

    public static boolean Etriangle(int s){
        for (int i = 1; i <= s; i++) {
            for (int j = s; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        return true;
    }

    public static boolean Rhombus(int s) {
        for (int i = 1; i <= s; i++) {
            for (int j = s; j > i; j--) {
                System.out.print("");
            }
        }
        for (int k = 1; k <= s; k++) {
            System.out.print("*  ");
        }
        System.out.print("\n");
        for (int i = 1; i < s; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= s; k++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
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

    public static boolean SumD(int n){
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n/=10;
        }
        System.out.println("The sum of digits is:" + sum);
        return true;
    }

    public static boolean Prime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
