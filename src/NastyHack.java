import java.util.Scanner;

public class NastyHack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfCases = input.nextInt();
        for(int i=0; i<numOfCases; i++){
            int notAd = input.nextInt();
            int withAd = input.nextInt();
            int cost = input.nextInt();
            int adProfit = withAd-cost-notAd;
            if(adProfit>0){
                System.out.println("advertise");
            } else if (adProfit==0) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
    }
}
