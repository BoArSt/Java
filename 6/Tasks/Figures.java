package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Classes.a.*;

public class Figures {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the width:");
        int width = Integer.parseInt(reader.readLine());
        System.out.print("Enter the length:");
        int length = Integer.parseInt(reader.readLine());
        System.out.println(Rectangle(width,length));
        System.out.print("Enter the side of the right triangle:");
        int side = Integer.parseInt(reader.readLine());
        System.out.println(Rtriangle(side));
        System.out.print("Enter the side of the equilateral triangle:");
        int size = Integer.parseInt(reader.readLine());
        System.out.println(Etriangle(size));
        System.out.print("Enter the side of the rhombus:");
        int rhombus = Integer.parseInt(reader.readLine());
        System.out.println(Rhombus(rhombus));
    }
}

