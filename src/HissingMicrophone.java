import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if(s.contains("ss")){
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
