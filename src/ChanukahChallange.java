import java.util.Scanner;

/**
 * Created by Ada on 05.11.2018.
 */
public class ChanukahChallange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfCases = input.nextInt();
        for(int i=0; i <noOfCases; i++){
            int no = input.nextInt();
            int days = input.nextInt();
            int candles = 0;
            for(int a=0; a<days; a++){
                candles+=(a+2);
            }
            System.out.println(no + " " + candles);
        }
    }
}
