import java.util.Scanner;

/**
 * Created by Ada on 29.10.2018.
 */
public class HangingOut {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int noOfPeople = input.nextInt();
            int numberOfCases = input.nextInt();
            int noEntered = 0;
            int currentNoOfPple = 0;
            for (int i = 0; i < numberOfCases; i++) {
                String enter = input.next();
                int newPpl = input.nextInt();
                if (enter.equals("enter")) {
                    int nextRound = newPpl + currentNoOfPple;
                    if (nextRound <= noOfPeople) {
                        currentNoOfPple = nextRound;
                    } else {
                        noEntered++;
                    }
                } else {
                        currentNoOfPple = currentNoOfPple - newPpl;
                }

            }
            System.out.println(noEntered);
        }
}
