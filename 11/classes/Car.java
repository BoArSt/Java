package classes;

public class Car {
        private int year;
        private String color;
        public Car() {
            this.year = 0;
            this.color = "Unknown";
        }
        public Car(int year) {
            this.year = year;
            this.color = "Unknown";
        }
        public Car(int year, String color) {
            this.year = year;
            this.color = color;
        }
        public int getYear() {
            return year;
        }
        public String getColor() {
            return color;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public void setColor(String color) {
            this.color = color;
        }
        @Override
        public String toString() {
            return "Car{year=" + year + ", color='" + color + "'}";
        }
    }
