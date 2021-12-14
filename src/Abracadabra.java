import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Abracadabra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int count = 1;
        while(x > 0) {
            System.out.println(count + " Abracadabra");
            count++;
            x--;
        }
    }
}

