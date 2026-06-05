package classes;

public class Household {
    public static class Appliance {
        private String name;
        private boolean isPluggedIn;

        public Appliance(String name) {
            this.name = name;
            this.isPluggedIn = false;
        }

        public void plugIn() {
            isPluggedIn = true;
            System.out.println(name + " is now plugged in.");
        }

        public void unplug() {
            isPluggedIn = false;
            System.out.println(name + " is now unplugged.");
        }

        public boolean isPluggedIn() {
            return isPluggedIn;
        }

        public String getName() {
            return name;
        }
    }
    public static class KitchenAppliance extends Appliance {
        public KitchenAppliance(String name) {
            super(name);
        }
    }
    public static class LivingRoomAppliance extends Appliance {
        public LivingRoomAppliance(String name) {
            super(name);
        }
    }
    public static class Refrigerator extends KitchenAppliance {
        public Refrigerator(String name) {
            super(name);
        }
        public void cool() {
            System.out.println(getName() + " is cooling.");
        }
    }
    public static class Microwave extends KitchenAppliance {
        public Microwave(String name) {
            super(name);
        }
        public void heat() {
            System.out.println(getName() + " is heating.");
        }
    }
    public static class Television extends LivingRoomAppliance {
        public Television(String name) {
            super(name);
        }
        public void display() {
            System.out.println(getName() + " is displaying content.");
        }
    }

    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator("Refrigerator");
        Microwave microwave = new Microwave("Microwave");
        Television tv = new Television("TV");
        fridge.plugIn();
        microwave.plugIn();
        tv.plugIn();
        System.out.println("Appliances and their status:");
        System.out.println(fridge.getName() + " is plugged in: " + fridge.isPluggedIn());
        fridge.cool();
        System.out.println(microwave.getName() + " is plugged in: " + microwave.isPluggedIn());
        microwave.heat();
        System.out.println(tv.getName() + " is plugged in: " + tv.isPluggedIn());
        tv.display();
    }
}

