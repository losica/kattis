import java.io.*;
import java.util.*;
import java.util.regex.*;
public class TwoStones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if(x%2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
