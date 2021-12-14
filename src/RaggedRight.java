import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 *
 * Created by Ada on 06.11.2018.
 */
public class RaggedRight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();
        int maxLength = 0;
        while (in.hasNext()) {
            String line = in.nextLine();
            maxLength = Math.max(maxLength, line.length());
            lines.add(line);
        }

        int counter = 0;
        for (int i = 0; i < lines.size() - 1; i++) {
            counter += Math.pow(maxLength - lines.get(i).length(), 2);
        }

        System.out.println(counter);
    }
}
