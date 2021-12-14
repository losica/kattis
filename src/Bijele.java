import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int king = 1 - input.nextInt();
        int queen = 1 - input.nextInt();
        int rooks = 2 - input.nextInt();
        int bishop = 2 - input.nextInt();
        int knights = 2 - input.nextInt();
        int pawns = 8 -input.nextInt();

        System.out.println(king + " " + queen + " " + rooks + " " + bishop + " " + knights + " " + pawns);
    }
}
