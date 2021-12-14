import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Ada on 31.10.2018.
 */
public class prsenti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        int bigNo = input.nextInt();
        for(int i=0; i<numberOfCases-1; i++){
            int s = input.nextInt();
            int gcm = gcdThing(bigNo, s);
            System.out.println(bigNo/gcm + "/" + s/gcm);
        }

    }

    private static int gcdThing(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

}
