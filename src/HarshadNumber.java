import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean found = false;
        while(!found){
            int sum = 0;
            String numberStr = Integer.toString(number);
            for(int i=0; i<numberStr.length(); i++){
                sum += Integer.parseInt(numberStr.substring(i, i+1));
            }
            if(number%sum==0){
                System.out.println(number);
                found = true;
            }
            number++;
        }
    }
}
