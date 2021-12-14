import java.util.Scanner;

public class GrassSeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cost = Double.parseDouble(input.next());
        int numOfCases = input.nextInt();
        double sum =0;
        for(int i = 0; i<numOfCases; i++) {
            double width = Double.parseDouble(input.next());
            double length = Double.parseDouble(input.next());
            sum = sum + width*length*cost;
        }
        System.out.println(sum);
    }
}
