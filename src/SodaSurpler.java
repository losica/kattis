import java.util.Scanner;

/**
 * Created by Ada on 03.11.2018.
 */
public class SodaSurpler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int emptyBottels1 = input.nextInt();
        int emptyBottles2= input.nextInt();
        int requiredBottels = input.nextInt();
        int sum = emptyBottels1 + emptyBottles2;
        boolean canBuyMore = true;
        int bottlesBought = 0;
        while(sum >= requiredBottels){
            int leftEmptyBttl = sum%requiredBottels;
            int bought2 = sum/requiredBottels;
            bottlesBought += bought2;
            sum = bought2 + leftEmptyBttl;
        }
        System.out.println(bottlesBought);
    }
}
