import java.util.Scanner;

/**
 * Created by Ada on 29.10.2018.
 */
public class Pet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0;
        int contestant =1;
        for (int i = 1; i <= 5; i++) {
            int sum2 = input.nextInt() + input.nextInt() + input.nextInt() +input.nextInt();
            if(sum2 > sum) {
                sum = sum2;
                contestant =i;
            }
        }
        System.out.println(contestant + " "+sum);
    }
}
