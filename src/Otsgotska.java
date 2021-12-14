import java.util.Scanner;

/**
 * Created by Ada on 31.10.2018.
 */
public class Otsgotska {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String [] str = line.split(" ");
        int noOfWords = str.length;
        int countAE = 0;
        for(String s: str){
            if(s.contains("ae")){
                countAE++;
            }
        }

        if(countAE*100/noOfWords >= 40){
            System.out.println("dae ae ju traeligt va");
        } else {
            System.out.println("haer talar vi rikssvenska");
        }
    }
}
