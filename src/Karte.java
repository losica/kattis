import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Ada on 04.11.2018.
 */
public class Karte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        int lengthBy3 = line.length()/3;
        Set<Integer> P = new HashSet<>();
        Set<Integer> K = new HashSet<>();
        Set<Integer> H = new HashSet<>();
        Set<Integer> T = new HashSet<>();
        int count = 0;
        for(int i= 0; i<lengthBy3; i++) {
            if(line.substring(count, count+1).equals("P")){
                P.add(Integer.parseInt(line.substring(count+1, count+3)));
            } else if(line.substring(count, count+1).equals("K")){
                K.add(Integer.parseInt(line.substring(count+1, count+3)));
            } else if(line.substring(count, count+1).equals("H")){
                H.add(Integer.parseInt(line.substring(count+1, count+3)));
            } else if(line.substring(count, count+1).equals("T")){
                T.add(Integer.parseInt(line.substring(count+1, count+3)));
            }
                count += 3;
        }
        int sizeP = P.size();
        int sizeK = K.size();
        int sizeH = H.size();
        int sizeT = T.size();
        int sum = sizeP + sizeK + sizeH + sizeT;
        if(sum < lengthBy3){
            System.out.println("GRESKA");
        } else {
            System.out.println((13-sizeP) + " " + (13 - sizeK) + " " + (13 - sizeH) + " " + (13 - sizeT));
        }

    }
}
