import java.text.DecimalFormat;
import java.util.Scanner;

public class EulersNumber {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        double totalSum = 1;
        DecimalFormat numberFormat = new DecimalFormat("#.000000000000000");
        if(number1>0){
            for(int a=1; a<=number1; a=a+1){
                int i;
                double fact=1;
                double number=(double) a;
                for(i=1;i<=number;i++){
                    fact=fact*(double) i;
                    //System.out.println(numberFormat.format(fact));
                }
                totalSum = totalSum + (1/fact);
            }
        }
        System.out.println(numberFormat.format(totalSum).replace(",", "."));
    }
}
