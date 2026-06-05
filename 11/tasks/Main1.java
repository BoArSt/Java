package tasks;

import classes.Car1;

public class Main1 {
        public static void main(String[] args) {
            Car1 car1 = new Car1();
            System.out.println(car1);
            Car1 car2 = new Car1(2022);
            System.out.println(car2);
            Car1 car3 = new Car1(2021, 150.0);
            System.out.println(car3);
            Car1 car4 = new Car1(2020, 160.0, 1200);
            System.out.println(car4);
            Car1 car5 = new Car1(2019, 140.0, 1100, "Red");
            System.out.println(car5);
        }
    }
