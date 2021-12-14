import java.util.Scanner;

/**
 * NOT SOLVED
 *
 * Created by Ada on 05.11.2018.
 */
public class Kutevi {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int noOfmirkoAngles = input.nextInt();
        int noOfSlavkoAngles = input.nextInt();
        int[] angelsMirko = new int[noOfmirkoAngles];
        for(int a=0; a<noOfmirkoAngles; a++){
            int mirkoAngle = input.nextInt();
            angelsMirko[a] = mirkoAngle;
        }
        for(int a=0; a<noOfSlavkoAngles; a++){
            int slavkoAngle = input.nextInt();
            boolean canMake = false;
            for(int s: angelsMirko){

                if(slavkoAngle%s==0){
                    canMake=true;
                }
                if((360-slavkoAngle)%s==0){
                    canMake=true;
                }

                if (s > slavkoAngle) {
                    int rest = s-slavkoAngle;
                    for(int c: angelsMirko) {
                        if (rest%c == 0){
                            canMake = true;
                        }
                        if((360-rest)%c ==0){
                            canMake=true;
                        }
                    }
                }
            }
            if(canMake){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
