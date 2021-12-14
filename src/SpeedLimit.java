import java.util.Scanner;

/**
 * Created by Ada on 24.10.2018.
 */
public class SpeedLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int x = input.nextInt();
            if(x!=-1){
                int miles = 0;
                int hoursSpent=0;
                for (int i = 0; i < x; i++) {
                    int speed = input.nextInt();
                    int hours = input.nextInt();
                    miles = miles + speed*(hours -hoursSpent);
                    hoursSpent = hours;
                }
                System.out.println(miles + " miles");
            }
        }
    }
}
