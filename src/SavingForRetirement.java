import java.util.Scanner;

/**
 * Created by Ada on 03.11.2018.
 */
public class SavingForRetirement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int br = input.nextInt();
        int bs = input.nextInt();
        int a = input.nextInt();
        int as = input.nextInt();
        int savings = (br-b) * bs;
        int years = savings/as;
        int savingsA  = years * as;
        if(savingsA > savings) {
            System.out.println(a + years);
        } else {
            System.out.println(a + years +1);
        }
    }
}
