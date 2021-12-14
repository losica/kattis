import java.util.Scanner;

/**
 * Created by Ada on 29.10.2018.
 */
public class Ladder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heigth = input.nextDouble();
        double degree = input.nextDouble();
        double sin = Math.sin(Math.toRadians(degree));
        double length = heigth/sin;
        int lengthInt = (int) Math.ceil(length);
        System.out.println(lengthInt);
    }
}
