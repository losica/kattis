import java.util.Scanner;

public class LastFactorialDigit {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numOfCases = input.nextInt();
        for(int a=0; a<numOfCases; a++) {
            int number = input.nextInt();
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            String num = Integer.toString(factorial);
            String lastDigit = num.substring(num.length() - 1);
            System.out.println(lastDigit);
        }
    }
}
