import java.util.Scanner;

/**
 * Created by Ada on 28.10.2018.
 */
public class EstimatingArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = -1;
        int b = -1;
        int c = -1;

        while (input.hasNext()) {
            String radiusStr = input.next();

            double radius= Double.parseDouble(radiusStr);
            int noOfPoints = input.nextInt();
            int correctNoOfPoints = input.nextInt();
            if(radiusStr.equals("0")) {
                a = 0;
            }
            b = noOfPoints;
            c = correctNoOfPoints;
            if(a == 0 && b == 0 && c == 0){
                break;
            }
            double area = Math.PI * radius * radius;
            double area2 = 4 * radius * radius * correctNoOfPoints / noOfPoints;
            System.out.println(area + " " + area2);


        }
    }
}
