import java.util.Scanner;

/**
 * Created by Ada on 28.10.2018.
 */
public class Soylent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            int cal = input.nextInt();
            int numOfBottles = cal/400;
            if(cal%400 != 0){
                numOfBottles++;
            }
            System.out.println(numOfBottles);

        }
    }
}
