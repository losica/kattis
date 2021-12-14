import java.util.Scanner;

/**
 * Created by Ada on 07.11.2018.
 */
public class QuiteAProblem {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String line = input.nextLine();
            if(line.toLowerCase().contains("problem")){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
