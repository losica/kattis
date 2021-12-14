import java.util.Scanner;

/**
 * Created by Ada on 03.11.2018.
 */
public class Rijeci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int start = 1;
        int b = 0;
        int a = 0;
        while(start <= count){
            int oldB = b;
            int oldA = a;
            a = oldB;
            b += oldA;

            if(b==0){
                b=1;
            }
            start++;
        }
        System.out.println(a + " " + b);
    }
}
