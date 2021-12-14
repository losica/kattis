import java.util.Scanner;

/**
 * Created by Ada on 28.10.2018.
 */
public class HelpAPhd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            String s = input.next();
            if(s.equals("P=NP")){
                System.out.println("skipped");
            } else {
                String[] g = s.split("\\+");
                System.out.println(Integer.parseInt(g[0]) + Integer.parseInt(g[1]));
            }
        }
    }
}
