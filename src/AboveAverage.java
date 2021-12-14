import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        while(x > 0) {
            String set = input.nextLine();
            String[] numbers = set.split(" ");
            int noOfPpl = Integer.parseInt(numbers[0]);
            int sum = 0;
            for(int i = 1; i< numbers.length; i++){
                sum += Integer.parseInt(numbers[i]);
            }
            double average = (sum/noOfPpl);
            //System.out.println(average + "%");
            int studentsAboveAverage = 0;
            for(int a = 1; a< numbers.length; a++){
                if (Integer.parseInt(numbers[a]) > (int) average) {
                    studentsAboveAverage = studentsAboveAverage +1;
                }
            }
            double aboveAverage = (double) studentsAboveAverage*100/noOfPpl;
        System.out.println(String.format("%.3f", aboveAverage) + "%");
        x--;
        }
    }
}
