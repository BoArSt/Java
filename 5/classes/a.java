package classes;
public class a {
    public static boolean IsPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        return  (n&(n-1))==0;
    }
    public static boolean IsEven1(int n){
        if(n % 2 == 0){
             System.out.println(n + " is even");
             return true;
        } else {System.out.println(n + " is odd");
        return false;}
    }
   public static boolean IsEven2(int n){
       if((n & 1) == 0){
           System.out.println(n + " is even");
           return true;
       } else {System.out.println(n + " is odd");
           return false;}
   }
public static boolean Bonuses(double y,double s){
        if(y < 5){
            System.out.println("Bonuses is 10%.");
            System.out.println("Salary with bonus:"+(s+(s*0.1)));
        }else if (y>=5 && y <10){
            System.out.println("Bonuses is 15%.");
            System.out.println("Salary with bonus:"+(s+(s*0.15)));
        }else if(y>=10 && y <15){
            System.out.println("Bonuses is 25%.");
            System.out.println("Salary with bonus:"+(s+(s*0.25)));
        }else if(y>=15 && y <20){
            System.out.println("Bonuses is 35%.");
            System.out.println("Salary with bonus:"+(s+(s*0.35)));
        }else if(y>=20 && y <25) {
            System.out.println("Bonuses is 45%.");
            System.out.println("Salary with bonus:" + (s + (s * 0.45)));
        }else if(y>=25) {
            System.out.println("Bonuses is 50%.");
            System.out.println("Salary with bonus:" + (s + (s * 0.5)));
        }
        return true;
    }
}
