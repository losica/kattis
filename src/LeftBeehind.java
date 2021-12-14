import java.util.Scanner;

/**
 * Created by Ada on 31.10.2018.
 */
public class LeftBeehind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            int sweet = input.nextInt();
            int sour = input.nextInt();
            if (sweet==0 && sour==0){
                break;
            } else {
                if(sweet == sour){
                    System.out.println("Undecided.");
                }else if(sweet+sour == 13){
                    System.out.println("Never speak again.");
                } else if(sweet>sour){
                    System.out.println("To the convention.");
                } else if(sweet<sour){
                    System.out.println("Left beehind.");
                }
            }
        }
    }
}
