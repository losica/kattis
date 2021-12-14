import java.util.Scanner;

/**
 * Created by Ada on 24.10.2018.
 */
public class QuickEstimates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            String y = input.next();
            System.out.println(y.length());
        }
    }
}
