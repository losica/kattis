import java.util.Scanner;

/**
 * Created by Ada on 04.11.2018.
 */
public class JumbledCompass {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int deg1 = input.nextInt();
        int deg2 =input.nextInt();
        if(deg1>deg2){
            if(deg1 - deg2 >= 180) {
                System.out.println((360 - deg1 + deg2));
            } else {
                System.out.println(-(deg1 - deg2));
            }
        } else if(deg1<deg2){
            if(deg2-deg1 <=180) {
                System.out.println(deg2 - deg1);
            }else {
                System.out.println(-(360-deg2 + deg1));
            }
        } else {
            System.out.println(0);
        }
    }

}
