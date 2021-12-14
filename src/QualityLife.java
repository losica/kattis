import java.util.Scanner;

/**
 * Created by Ada on 06.11.2018.
 */
public class QualityLife {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int noOfCases = input.nextInt();
        double qualityOfLife = 0;
        for (int i = 0; i < noOfCases; i++) {
            double quality = Double.parseDouble(input.next());
            double noOfYears = Double.parseDouble(input.next());
            qualityOfLife += quality * noOfYears;
        }
        System.out.println(qualityOfLife);
    }
}
