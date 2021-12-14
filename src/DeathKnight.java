import java.util.Scanner;

/**
 * Created by Ada on 28.10.2018.
 */
public class DeathKnight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        int count = 0;
        for (int i = 0; i < numberOfCases; i++) {
            String s = input.next();
            if(!s.matches(".*CD.*")){
                count++;
            }
        }
        System.out.println(count);
    }
}
