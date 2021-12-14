import java.util.Scanner;

public class Aaaah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myAah = input.nextLine();
        String doctordAaah = input.nextLine();

        if(myAah.trim().length() >= doctordAaah.trim().length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
