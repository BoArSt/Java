package Tasks;
import java.util.Random;
import static Classes.a.Largest;

public class LargestRandom {
    public static void main(String[] args){
    Random rand = new Random();
    int n = rand.nextInt(30) + 1;
    int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(1001);
        }
        System.out.println("The size of an array is:" + n);
        System.out.print("The array is:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(Largest(array));
    }
}
