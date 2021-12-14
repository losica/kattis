import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ada on 03.11.2018.
 */
public class Kornislav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int[] array= {a, b, c, d};
        Arrays.sort(array);
        System.out.println(array[0]*array[2]);
    }
}
