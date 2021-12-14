import java.util.ArrayList;
import java.util.Scanner;

//Knuth-Morris-Pratt  prints KMP
public class Autori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        String[] words = x.split("-");
        String autori ="";
        for(String s: words) {
            autori = autori + s.substring(0,1);
        }
        System.out.println(autori);
    }
}
