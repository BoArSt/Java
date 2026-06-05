import static java.lang.Math.*;
public class Volume {
    public static void main(String[] args) {
        double r=8,h=11,V,S;
        V= PI * pow(r,2)*h;
        S = 2*PI*r*(r+h);
        System.out.println(V);
        System.out.println(S);
    }
}