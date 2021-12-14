import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ada on 06.11.2018.
 */
public class SavingDaylight {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] array = line.split(" ");
            int[] time1 = Arrays.asList(array[3].split(":")).stream().mapToInt(Integer::parseInt).toArray();
            int[] time2 = Arrays.asList(array[4].split(":")).stream().mapToInt(Integer::parseInt).toArray();

            int hours = time2[0] - time1[0];
            int minutes = time2[1] - time1[1];
            if (minutes < 0) {
                minutes = 60 + minutes;
                hours--;
            }
            System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + hours + " hours " + minutes + " minutes");
        }
    }

}
