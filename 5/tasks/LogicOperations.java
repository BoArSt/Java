package tasks;

public class LogicOperations {
    public static void main(String[] args){
        int x = 5,y = 10,z = 15;
        System.out.println("X="+  (x += y >> x++ * z) );
        System.out.println("Z="+ (z = ++x & y * 5));
        System.out.println("Y="+ ( y /= x + 5 | z));
        System.out.println("Z="+ ( z = x++ & y * 5));
        System.out.println("X="+ ( x = y << x++ ^ z));
    }
}
