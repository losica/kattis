import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfMatches = input.nextInt();
        int width = input.nextInt();
        int height = input.nextInt();

        int maxLenght = (int) Math.sqrt(width*width + height*height);

        while(noOfMatches > 0) {
            if(input.nextInt() <= maxLenght){
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
            noOfMatches--;
        }
    }
}
