import java.util.Scanner;

/**
 * Created by Ada on 23.10.2018.
 */
public class Coldputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        int count = 0;
        for(int i=0; i<numberOfCases; i++){
            if(input.nextInt() < 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
