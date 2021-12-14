import java.util.Scanner;

/**
 * Created by Ada on 23.10.2018.
 */
public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for(int i=0; i<x; i++){
            String a = input.next();
            String b = input.next();
            System.out.println(a);
            System.out.println(b);
            String c="";
            for (int q=0; q<a.length(); q++){
                if(a.substring(q,q+1).equals(b.substring(q,q+1))){
                    c=c+".";
                } else {
                    c=c+"*";
                }
            }
            System.out.println(c);
            System.out.println();
        }
    }
}
