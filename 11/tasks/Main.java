package tasks;

import classes.Car;

public class Main {
        public static void main(String[] args) {
            Car car1 = new Car();
            System.out.println(car1);
            Car car2 = new Car(2022);
            System.out.println(car2);
            Car car3 = new Car(2021, "Red");
            System.out.println(car3);
            car1.setYear(2020);
            car1.setColor("Blue");
            System.out.println(car1);
        }
    }

