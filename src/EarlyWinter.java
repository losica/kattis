import java.util.Scanner;

/**
 * Created by Ada on 04.11.2018.
 */
public class EarlyWinter {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int noOfCases = input.nextInt();
        int min = input.nextInt();

        boolean hasSnowedEarly = false;
        int times = 0;
        int mostTimes = 0;
        for(int a=0; a<noOfCases; a++){
            int snow = input.nextInt();
            if(snow <= min){
                hasSnowedEarly = true;
                if(a!=(noOfCases-1) || a==0) {
                    times = 0;
                }
            } else {
                times++;

                if(a==(noOfCases-1) && snow>min){
                    times = 0;
                }
            }

        }
        if(!hasSnowedEarly) {
            System.out.println("It had never snowed this early!");
        } else {
            System.out.println("It hadn't snowed this early in " + mostTimes + " years!");
        }

    }
}
