import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();;
        int c = 0;
        int t = 0;
        int g = 0;
        int score = 0;

        int index = 0;
        while (index < result.length()) {
            char s = result.charAt(index);
            if(s == 'C') {
                c++;
            } else if( s == 'T'){
                t++;
            } else if( s == 'G') {
                g++;
            }
            index ++;
        }
       if(c!= 0 && g!=0 && t!=0) {
           int minValue = Math.min(c, g);
           minValue = Math.min(minValue, t);
           score = score + 7*minValue;
       }

       score = score + c*c + t*t + g*g;

       System.out.println(score);

    }
}
