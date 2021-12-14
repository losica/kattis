import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ArmyStrenghtEasy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfCases = input.nextInt();

        for(int i=1; i<=numberOfCases; i++) {
            int numOfGodzillas = input.nextInt();
            int numOfMechaGodzilla = input.nextInt();
            int strongestGodzilla = 0;
            int strongestMechaGodzilla = 0;

            int[] godzillas = new int[numOfGodzillas];
            for(int g=1; g<=numOfGodzillas; g++){
                int strenght = input.nextInt();
                godzillas[g-1] = strenght;
            }
            strongestGodzilla = Arrays.stream(godzillas).max().getAsInt();

            int[] mechaGodzillas = new int[numOfMechaGodzilla];
            for(int m=1; m<=numOfMechaGodzilla; m++){
                int strenght = input.nextInt();
                mechaGodzillas[m-1] = strenght;
            }
            strongestMechaGodzilla = Arrays.stream(mechaGodzillas).max().getAsInt();

            if(strongestGodzilla >= strongestMechaGodzilla){
                System.out.println("Godzilla");
            } else if(strongestGodzilla < strongestMechaGodzilla) {
                System.out.println("MechaGodzilla");
            }
        }
    }
}
