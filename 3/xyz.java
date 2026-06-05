public class xyz {
    public static void main(String[] args) {
        int x=10,y=12,z=3;
        x += y - x++ * z;
        System.out.print(String.format("%s%s%s","x = ",x,"\n"));
        z = --x - y * 5;
        System.out.print(String.format("%s%s%s","z = ",z,"\n"));
        y /= x + 5 % z;
        System.out.print(String.format("%s%s%s","y = ",y,"\n"));
        z = x++ + y * 5;
        System.out.print(String.format("%s%s%s","Also z = ",z,"\n"));
        x = y - x++ * z;
        System.out.print(String.format("%s%s%s","Also x = ",x,"\n"));
    }
}