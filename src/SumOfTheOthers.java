import java.util.Scanner;

/**
 * Created by Ada on 23.10.2018.
 */
public class SumOfTheOthers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String a = input.nextLine();
            String[] b = a.split(" ");
            int sum = 0;
            for (String c : b) {
                sum = sum + Integer.parseInt(c);
            }
            System.out.println(sum / 2);
        }
    }
}
