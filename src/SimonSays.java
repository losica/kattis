import java.util.Scanner;

/**
 * Created by Ada on 31.10.2018.
 */
public class SimonSays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        //input.next();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            //System.out.println(line);
            if(line.startsWith("Simon says")) {
                String lineToPrint = line.substring(11);
                System.out.println(lineToPrint);
            }
        }
    }
}
