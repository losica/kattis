import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gigabytes = input.nextInt();
        int noOfMonths = input.nextInt();
        int x = noOfMonths;
        int usedGigabytes = 0;
        while(x>0) {
            usedGigabytes += input.nextInt();
            x--;
        }
        int availableGiga = gigabytes*(noOfMonths+1) - usedGigabytes;
        System.out.println(availableGiga);
    }
}
