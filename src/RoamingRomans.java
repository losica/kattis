import java.util.Scanner;

/**
 * Created by Ada on 31.10.2018.
 */
public class RoamingRomans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double miles = Double.valueOf(input.next());
        double engMiles = miles * 1000 * 5280 / 4854;
        int milesToPrint = (int) Math.round(engMiles);
        System.out.println(milesToPrint);
    }
}
