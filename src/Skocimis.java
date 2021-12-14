import java.util.Scanner;

/**
 * Created by Ada on 03.11.2018.
 */
public class Skocimis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int ab = b - a - 1;
        int cb = c - b - 1;
        System.out.println(Math.max(ab,cb));
    }
}
