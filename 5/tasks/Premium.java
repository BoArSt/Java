package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static classes.a.Bonuses;

public class Premium {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the years of service:");
        int years = Integer.parseInt(reader.readLine());
        System.out.println("Enter the salary of the employee:");
        int salary = Integer.parseInt(reader.readLine());
        System.out.println(Bonuses(years,salary));
    }
}
