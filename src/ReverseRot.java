import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ada on 03.11.2018.
 */
public class ReverseRot {
    private static ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList("A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,_,.".split(",")));
    private static int size = alphabet.size();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int shift = input.nextInt();
            if(shift == 0){
                break;
            }
            String message = input.next();
            String[] mess = message.split("(?!^)");
            String encryptedMessage = "";
            for(int s=message.length()-1; s>=0; s--){
                encryptedMessage += alphabet.get((alphabet.indexOf(mess[s])+shift)%size);
            }
            System.out.println(encryptedMessage);
        }
    }

}
