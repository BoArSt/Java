package Tasks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
public class Grades {
        public static void main(String[] args) {
            ArrayList<Integer> grades = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                grades.add(random.nextInt(11));
            }
            System.out.println("Original Grades: " + grades);
            Iterator<Integer> iterator = grades.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() < 6) {
                    iterator.remove();
                }
            }
            System.out.println("Filtered Grades: " + grades);
        }
}
