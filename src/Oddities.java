import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfCases = input.nextInt();
        for (int i = 0; i < numOfCases; i++) {
            int x = input.nextInt();
            if (x % 2 == 0) {
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
        }
    }
}
