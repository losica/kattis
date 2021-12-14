import java.util.Scanner;

/**
 * Created by Ada on 29.10.2018.
 */
public class Spam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int lenght = s.length();
        int whiteSpace = 0;
        int lowercase = 0;
        int uppercase = 0;
        int specialChar = 0;
        for(int i=0; i<lenght; i++){
            if(Character.toString(s.charAt(i)).equals("_")){
                whiteSpace++;
            } else if(Character.isLowerCase(s.charAt(i))) {
                lowercase++;
            } else if(Character.isUpperCase(s.charAt(i))) {
                uppercase++;
            } else {
                specialChar++;
            }
        }

        double whitespace = (double) whiteSpace/ (double) lenght;
        double low = (double) lowercase/ (double) lenght;
        double upp = (double) uppercase/ (double) lenght;
        double special = (double) specialChar/ (double) lenght;

        System.out.println(whitespace);
        System.out.println(low);
        System.out.println(upp);
        System.out.println(special);
    }
}
