package Tasks;
import classes.a.*;
public class Household {
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
