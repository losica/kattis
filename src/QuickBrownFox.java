import java.util.Scanner;

/**
 * Created by Ada on 31.10.2018.
 */
public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        input.next();
        String[] s = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        while (input.hasNextLine()) {
            String missingLetters = "";
            String line = input.nextLine();
            for(String a: s) {
                if(!line.contains(a) && !line.contains(a.toUpperCase())){
                    missingLetters += a;
                }
            }
            if(!missingLetters.isEmpty()) {
                System.out.println("missing " + missingLetters);
            } else {
                System.out.println("pangram");
            }
        }
    }
}
