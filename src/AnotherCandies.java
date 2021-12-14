import java.util.Scanner;

/**
 * Created by Ada on 24.10.2018.
 */
public class AnotherCandies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            long sum = 0;
            long noOfChildren = input.nextLong();
            for(int a=0; a<noOfChildren; a++){
                sum = (sum + input.nextLong())% noOfChildren;
            }
            if (sum == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
