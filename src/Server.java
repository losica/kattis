import java.util.Scanner;

/**
 * Created by Ada on 24.10.2018.
 */
public class Server {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        int timeLimit = input.nextInt();
        int timeCount = 0;
        for(int i=0; i<numberOfCases; i++){
            timeCount = timeCount + input.nextInt();
            if(timeCount>timeLimit) {
                System.out.println(i);
                break;
            }
        }
        if(timeCount<=timeLimit){
            System.out.println(numberOfCases);
        }
    }
}
