import java.util.Scanner;

/**
 * Created by Ada on 04.11.2018.
 */
public class Exam {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int correctAnswers = input.nextInt();
        String myAnswers = input.next();
        String friendAnswers = input.next();
        int sameAnsw =0;
        for(int i =0; i< myAnswers.length(); i++){
            char ch = myAnswers.charAt(i);
            char ch2 = friendAnswers.charAt(i);
            if (ch ==ch2) {
                sameAnsw++;
            }
        }
        int total= myAnswers.length();
        System.out.println(total-Math.abs(sameAnsw-correctAnswers));

    }
}
