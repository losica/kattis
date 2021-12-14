import java.util.Scanner;

/**
 * Created by Ada on 04.11.2018.
 */
public class Sjecista {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int noOfLines = input.nextInt();
        int intersections = (noOfLines-3)*(noOfLines-2)*(noOfLines-1)*noOfLines/24;
        System.out.println(intersections);
    }
}
