import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ada on 23.10.2018.
 */
public class OddManOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        for (int i = 1; i <= numberOfCases; i++) {
            int noOfGuests = input.nextInt();
            int[] guest = new int[noOfGuests];
            for(int a=0; a < noOfGuests; a++){
                guest[a] = input.nextInt();
            }
            Arrays.sort(guest);
            int s=0;
            while(s < guest.length-1 && guest[s]== guest[s+1]){
                s=s+2;
            }
            System.out.println("Case #" + i + ": "+ guest[s]);
        }
    }
}
