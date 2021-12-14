import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ada on 04.11.2018.
 */
public class Parking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int priceA = input.nextInt();
        int priceB = input.nextInt();
        int priceC = input.nextInt();
        int[] arrival = new int[3];
        int[] departure = new int[3];
        for(int i=0; i<3; i++) {
            arrival[i] = input.nextInt();
            departure[i] = input.nextInt();
        }
        Arrays.sort(arrival); // 15 25 70
        Arrays.sort(departure); // 30 50 80

        int countA = 0;
        int countB = 0;
        int countC = 0;
        for(int i = arrival[0]; i<departure[2]; i++){
            int count = 0;
            if(i>=arrival[0] && i<departure[0]){
                count++;
            }
            if(i>=arrival[1] && i<departure[1]){
                count++;
            }
            if(i>=arrival[2] && i<departure[2]){
                count++;
            }
            if(count == 1){
                countA++;
            } else if(count == 2){
                countB++;
            } else if(count==3){
                countC++;
            }
        }

        System.out.println(countA*priceA + countB*priceB*2 + countC*priceC*3);

    }
}
