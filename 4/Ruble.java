import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ruble {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number:");
        int number = Integer.parseInt(reader.readLine()),ld=0,ltd=0;
        ld = Math.abs(number%10);
        ltd = Math.abs(number%100);
        if(ltd>=11 && ltd<=19){
            System.out.println(number + " рублей");
        }else if(ld == 1){
            System.out.println(number + " рубль");
        }else if(ld>=2 && ld <= 4){
            System.out.println(number + " рубля");
        }else System.out.println(number + " рублей");
    }
}
