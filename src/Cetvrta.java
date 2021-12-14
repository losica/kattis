import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        int xToPrint;
        int yToPrint;
        if(x1!=x2 && x1!=x3){
            xToPrint = x1;
        } else if(x1==x3){
            xToPrint = x2;
        } else {
            xToPrint = x3;
        }

        if(y1!=y2 && y1!=y3){
            yToPrint = y1;
        } else if(y1==y3){
            yToPrint = y2;
        } else {
            yToPrint = y3;
        }

        System.out.println(xToPrint + " " + yToPrint);
    }

}
