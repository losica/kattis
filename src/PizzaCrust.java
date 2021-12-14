import java.util.Scanner;

/**
 * Created by Ada on 24.10.2018.
 */
public class PizzaCrust {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double radius2 = input.nextDouble();
        double area2 = Math.PI * (radius -radius2) * (radius - radius2);
        double area1 = Math.PI * radius * radius;
        double percentage = (area1 - (area1-area2))/area1 * 100;
        System.out.println(percentage);
    }
}
