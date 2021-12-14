import java.util.Scanner;

/**
 * Created by Ada on 04.11.2018.
 */
public class PaulEigon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int servesByPerson = input.nextInt();
        int paulScore = input.nextInt();
        int opponentScore = input.nextInt();
        int round = (paulScore+opponentScore+1)/servesByPerson;
        if((paulScore+opponentScore+1)%servesByPerson != 0){
            round++;
        }
        //System.out.println(round);
        if(round%2 == 1) {
            System.out.println("paul");
        } else {
            System.out.println("opponent");
        }
    }
}
