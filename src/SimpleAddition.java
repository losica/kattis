import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Ada on 31.10.2018.
 */
public class SimpleAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String i = input.next();
        String a = input.next();
        BigInteger bigInteger = new BigInteger(i).add(new BigInteger(a));
        System.out.println(bigInteger.toString());
    }
}
