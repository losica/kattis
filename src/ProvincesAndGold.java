import java.util.Scanner;

/**
 * Created by Ada on 06.11.2018.
 */
public class ProvincesAndGold {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int gold = input.nextInt();
        int silver = input.nextInt();
        int copper = input.nextInt();

        int buyingPoints = gold*3 + silver*2 + copper;
        if(buyingPoints>=8){
            System.out.println("Province or Gold");
        } else if(buyingPoints>=6){
            System.out.println("Duchy or Gold");
        } else if(buyingPoints>=5) {
            System.out.println("Duchy or Silver");
        } else if(buyingPoints>=3) {
            System.out.println("Estate or Silver");
        } else if(buyingPoints>=2) {
            System.out.println("Estate or Copper");
        } else {
            System.out.println("Copper");
        }
    }
}
