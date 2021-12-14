import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Ada on 04.11.2018.
 */
public class MapTitles {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String number = input.next();
        int level = number.length();
        Map<Integer, String> coordiantes = new HashMap<>();

        for(int x=0; x<8; x++) {
            int a = 0;
            int b = 1;
            if(x==1){
                a=2;
                b=3;
            }
            if(x==2){
                a=20;
                b=21;
            }
            if(x==3){
                a=22;
                b=23;
            }
            if(x==4){
                a=200;
                b=201;
            }
            if(x==5){
                a=202;
                b=203;
            }
            if(x==6){
                a=220;
                b=221;
            }
            if(x==7){
                a=222;
                b=223;
            }
            int start = 0;
            for (int i = 0; i < 4; i++) {
                coordiantes.put(a, start + " " + x);
                coordiantes.put(b, (start + 1) + " " + x);
                if (i == 0) {
                    a = a + 10;
                    b = b + 10;
                }
                if (i == 1) {
                    a = a + 90;
                    b = b + 90;
                }
                if (i == 2) {
                    a = a + 10;
                    b = b + 10;
                }
                start += 2;
            }
        }

        System.out.println( level+" "+ coordiantes.get(Integer.parseInt(number)));

    }
}
