import java.util.Scanner;

/**
 * Created by Ada on 29.10.2018.
 */
public class BabyBites {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        boolean makeSense = true;
        int count = 0;
        for(int i = 1; i<=numberOfCases; i++){
            String s = input.next();
            if(s.equals("mumble")){
                count++;
            } else {
                count = Integer.parseInt(s);
            }
            if(count!= i){
                makeSense = false;
                break;
            }
        }
        if(makeSense){
            System.out.println("makes sense");
        } else {
            System.out.println("something is fishy");
        }
    }
}
