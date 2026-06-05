package tasks;

import classes.Car2;

public class Main2 {
        public static void main(String[] args) {
            Car2 car1 = new Car2();
            System.out.println(car1);
            Car2 car2 = new Car2(2022);
            System.out.println(car2);
            Car2 car3 = new Car2(2021, 150.0);
            System.out.println(car3);
            Car2 car4 = new Car2(2020, 160.0, 1200);
            System.out.println(car4);
            Car2 car5 = new Car2(2019, 140.0, 1100, "Red");
            System.out.println(car5);
        }
    }
