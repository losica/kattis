import java.util.Scanner;

/**
 * Created by Ada on 08.11.2018.
 */
public class JudgingMoose {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int left = input.nextInt();
        int right = input.nextInt();
        int sum = left+right;
        if(sum == 0){
            System.out.println("Not a moose");
        } else if(sum%2==0 && left==right) {
            System.out.println("Even "+ sum);
        } else if(left>right){
            System.out.println("Odd " + left*2);
        } else{
            System.out.println("Odd " + right*2);
        }
    }
}
