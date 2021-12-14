import java.util.Scanner;

public class Apaaaaaxian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repeatingWord = input.nextLine();

        System.out.println(repeatingWord.replaceAll("(.)\\1{1,}", "$1"));
    }


}
