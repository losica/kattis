import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ada on 06.11.2018.
 */
public class Statistics {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int caseNo = 1;
        while(input.hasNextLine()) {
            String line = input.nextLine();
            String[] array = line.split(" ");
            int[] numbers = new int[array.length-1];
            for(int i =1; i<array.length; i++) {
                numbers[i-1] = Integer.parseInt(array[i]);
            }
            Arrays.sort(numbers);
            System.out.println("Case " + caseNo+": " + numbers[0] + " " + numbers[numbers.length-1] + " " + (numbers[numbers.length-1]-numbers[0]));
            caseNo++;
        }
    }
}
