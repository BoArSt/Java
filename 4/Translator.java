import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Translator {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String[] eng = {"sunny","rainy","cloudy","foggy","stormy","snowy","windy","humid","freezing","hailing"};
        String[] rus = {"солнечно","дождь","облачно","туманно","штормит","снегопад","ветрено","влажно","морозно","град"};
        System.out.print("Enter weather condition:");
        String weather = reader.readLine();
        for (int i = 0; i < rus.length; i++) {
            if (weather.equals(rus[i])) {
                System.out.println(eng[i]);
                return;
            }
        }
        System.out.println("Weather condition is not recognized.");
    }
}
