import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;
public class Cover {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number a:");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Enter the number b:");
        int b = Integer.parseInt(reader.readLine());
        int S = a*b;
        System.out.print("Enter the radius:");
        int r = Integer.parseInt(reader.readLine());
        double Ss = pow(r,2);
        if(S <= Ss){
            System.out.println("Round cardboard can cover the rectangle.");
        }else System.out.println("The rectangle hole is bigger");
    }
}
