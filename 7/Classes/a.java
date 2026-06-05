package Classes;

public class a {
    public static double Calculate(int a,int b,int c,double average){
        average = (double)(a+b+c)/3;
        return average;
    }
    public static void add(int a,int b){
        System.out.println(a + "+" + b + "=" + (a+b));
    }
    public static void sub(int a,int b){
        System.out.println(a + "-" + b + "=" + (a-b));
    }
    public static void mult(int a,int b){
        System.out.println(a + "*" + b + "=" + (a*b));
    }
    public static void div(int a,int b){
        if(b == 0){
            System.out.println("Can't divide by zero!");
        }else System.out.println(a + "/" + b + "=" + (a/b));
    }
    public static void Convert(int a,double b){
        System.out.println("The converted value:" + (a*b));
    }
    public static void Positive(int a){
        if (a > 0) {
            System.out.println(a + " is positive.");
        } else if (a < 0) {
            System.out.println(a + " is negative.");
        } else {
            System.out.println(a + " is neither positive nor negative (zero).");
        }
    }
    public static boolean Prime(int n){
        System.out.println("Is your number prime?");
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
    public static void Division(int n){
        if (n % 2 == 0) {
            System.out.println(n + " is divisible by 2.");
        } else {
            System.out.println(n + " is not divisible by 2.");
        } if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5.");
        } else {
            System.out.println(n + " is not divisible by 5.");
        } if (n % 3 == 0) {
            System.out.println(n + " is divisible by 3.");
        } else {
            System.out.println(n + " is not divisible by 3.");
        } if (n % 6 == 0) {
            System.out.println(n + " is divisible by 6.");
        } else { System.out.println(n + " is not divisible by 6.");
        } if (n % 9 == 0) {
            System.out.println(n + " is divisible by 9.");
        } else {
            System.out.println(n + " is not divisible by 9.");
     }
    }
}
