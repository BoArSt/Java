package Tasks;

public class Computer {
        private String brand;
        private String model;
        private double processorSpeed;
        private int ramSize;
        private int storage;
        public Computer(String brand, String model, double processorSpeed, int ramSize, int storageSize) {
            this.brand = brand;
            this.model = model;
            this.processorSpeed = processorSpeed;
            this.ramSize = ramSize;
            this.storage = storageSize;
        }
        public void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Processor Speed: " + processorSpeed + " GHz");
            System.out.println("RAM Size: " + ramSize + " GB");
            System.out.println("Storage Size: " + storage + " GB");
            System.out.println();
        }
        public static void main(String[] args) {
            Computer[] computers = new Computer[5];
            computers[0] = new Computer("Apple", "MacBook Pro", 2.3, 16, 512);
            computers[1] = new Computer("Dell", "XPS 13", 3.0, 8, 256);
            computers[2] = new Computer("HP", "Envy", 2.5, 12, 1024);
            computers[3] = new Computer("Lenovo", "ThinkPad", 2.8, 16, 512);
            computers[4] = new Computer("Asus", "ZenBook", 3.1, 16, 512);
            for (Computer computer : computers) {
                computer.display();
            }
        }
}
