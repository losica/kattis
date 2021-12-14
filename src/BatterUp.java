import java.util.Scanner;

/**
 * Created by Ada on 31.10.2018.
 */
public class BatterUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfCases = input.nextInt();
        int count = 0;
        int sum = 0;
        for(int i=0; i<noOfCases; i++){
            int a = input.nextInt();
            if(a>=0){
                sum += a;
                count++;
            }
        }
        double avg = (double) sum/(double)count;
        System.out.println(avg);
    }
}
