import java.util.Scanner;

/**
 * Created by Ada on 08.11.2018.
 */
public class Tri {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a+b==c){
            System.out.println(a+"+"+b+"="+c);
        } else if(b+c == a){
            System.out.println(a+"="+b+"+"+c);
        } else if(a-b == c) {
            System.out.println(a+"-"+b+"="+c);
        } else if(a == b-c) {
            System.out.println(a+"="+b+"-"+c);
        } else if(a * b==c){
            System.out.println(a+"*"+b+"="+c);
        } else if(a == b*c){
            System.out.println(a+"="+b+"*"+c);
        } else if(a/b ==c){
            System.out.println(a+"/"+b+"="+c);
        } else {
            System.out.println(a+"="+b+"/"+c);
        }
    }
}
