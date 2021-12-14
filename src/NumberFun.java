import java.util.Scanner;

/**
 * Created by Ada on 29.10.2018.
 */
public class NumberFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        for(int i =0; i<numberOfCases; i++){
            String a = input.next();
            String b = input.next();
            String c = input.next();
            boolean possible = false;
            if(Integer.parseInt(a) + Integer.parseInt(b) == Integer.parseInt(c)) {
                possible = true;
            }
            if((Integer.parseInt(a)-Integer.parseInt(b) == Integer.parseInt(c)) || (Integer.parseInt(b)-Integer.parseInt(a) == Integer.parseInt(c))) {
                possible = true;
            }
            if(Integer.parseInt(a)*Integer.parseInt(b) == Integer.parseInt(c)){
                possible = true;
            }
            if((Integer.parseInt(a)*Integer.parseInt(c) == Integer.parseInt(b)) || (Integer.parseInt(b)*Integer.parseInt(c) == Integer.parseInt(a))){
                possible = true;
            }

            if(possible){
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
