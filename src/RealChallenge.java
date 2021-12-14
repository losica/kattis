import java.util.Scanner;

public class RealChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cost = Double.parseDouble(input.next());
        System.out.println(Math.sqrt(cost)*4);
    }
}
