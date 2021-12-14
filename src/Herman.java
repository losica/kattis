import java.util.Scanner;

/**
 * Created by Ada on 23.10.2018.
 */
public class Herman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println(Math.PI * radius * radius);
        System.out.println(radius*radius*2);
    }
}
