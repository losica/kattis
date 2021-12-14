import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();
        int sum = 0;

        for(int i=0; i <= numberOfLines; i++){
            String s = input.nextLine();
            //System.out.println(s);
            if(s.length() >=1) {
                int number = Integer.parseInt(s.substring(0, s.length() - 1));
                int power = Integer.parseInt(s.substring((s.length() - 1)));
                sum += Math.pow(number, power);
            }
        }
        System.out.println(sum);
    }
}

