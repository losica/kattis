import java.util.Scanner;

/**
 * Created by Ada on 24.10.2018.
 */
public class Filip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x =input.next();
        String y = input.next();

        int x1=Integer.parseInt(x.substring(0,1));
        int x2 =Integer.parseInt(x.substring(1,2));
        int x3 = Integer.parseInt(x.substring(2,3));
        int x123 = x1 + x2*10 +x3*100;

        int y1=Integer.parseInt(y.substring(0,1));
        int y2 =Integer.parseInt(y.substring(1,2));
        int y3 = Integer.parseInt(y.substring(2,3));
        int y123 = y1 + y2*10 +y3*100;

        if(x123>y123){
            System.out.println(x123);
        } else {
            System.out.println(y123);
        }

    }
}
