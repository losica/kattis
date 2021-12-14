import java.util.Scanner;

public class Luhn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfCases = input.nextInt();

        for(int i=0; i<numOfCases; i++){
            String number = input.next();
            //System.out.println("nnn" +number);
            int lenght = number.length();
            int sum =0;
            //add every second digit
            for(int a=lenght-2; a>=0; a=a-2){
                int w = Integer.parseInt(number.substring(a, a+1)) *2;
                if(w<10) {
                    sum = sum + w;
                } else {
                    String x1 = ""+w;
                    int ax=Integer.parseInt(x1.substring(0,1)) + Integer.parseInt(x1.substring(1,2));
                    sum = sum + ax;
                }
                //System.out.print("every second line" + w);
            }

            for(int b=lenght-1; b>=0; b=b-2){
                int x = Integer.parseInt(number.substring(b, b+1));
                sum = sum + x;
            }

            //System.out.println("SUM" +sum);

            if(sum%10==0){
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }

}
