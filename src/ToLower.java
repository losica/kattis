import java.util.Scanner;

/**
 * Created by Ada on 04.11.2018.
 */
public class ToLower {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int noOfCases = input.nextInt();
        int testCases = input.nextInt();
        int solvedCases = 0;
        for (int i = 0; i < noOfCases; i++) {
            boolean success = true;
            for (int a = 0; a < testCases; a++) {
                String str = input.next();
                int upper = 0;
                for (int d = 0; d < str.length(); d++) {
                    char ch = str.charAt(d);
                    if (ch >= 'A' && ch <= 'Z') {
                        if (d != 0) {
                            upper++;
                        }
                    }
                    if (upper != 0) {
                        success = false;
                        break;
                    }
                }
            }
            if (success) {
                solvedCases++;
            }
        }
        System.out.println(solvedCases);
    }
}
