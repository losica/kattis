import java.util.Scanner;

/**
 * Created by Ada on 03.11.2018.
 */
public class Kemija {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String toPrint = "";
        String[] notAllowed = {"apa", "epe", "ipi", "opo", "upu"};
        String line = input.nextLine();
        String[] str = line.split(" ");
        for (int a=0; a<str.length; a++) {
            String st = str[a];
            //String word = input.next();
            for (String s : notAllowed) {
                if (st.contains(s)) {
                    st = st.replaceAll(s, s.substring(0, 1));
                }
            }
            if(a<str.length) {
                toPrint += st + " ";
            } else {
                toPrint += st;
            }
        }
        System.out.println(toPrint);
    }
}
