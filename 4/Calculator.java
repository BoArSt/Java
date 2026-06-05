import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Calculator {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int operand1 = 11,operand2 = 0;
        System.out.print("Enter the sign of an arithmetic operation:");
        String sign = reader.readLine();
       switch (sign){
           case "+": operand1 += operand2;
               System.out.println("Result:"+ operand1);
               break;
           case "-": operand1 -= operand2;
               System.out.println("Result:"+ operand1);
               break;
           case "*": operand1 *= operand2;
               System.out.println("Result:"+ operand1);
               break;
           case "/":
               if (operand2 == 0){
                   System.out.println("Division by zero is not allowed!");
                   return;
               }
               double div=((double)operand1)/operand2;
               System.out.println("Result:"+ div);
               break;
       }
    }
}
