import java.util.HashMap;
import java.util.Scanner;

public class Sok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double orange = input.nextDouble();
        double apple = input.nextDouble();
        double pinapple = input.nextDouble();
        double a1 = input.nextDouble();
        double a2 = input.nextDouble();
        double a3 = input.nextDouble();

        double[] ratio = {a1, a2, a3};
        double[] juice = {orange, apple, pinapple};
        double[] realRatio = {orange/a1, apple/a2, pinapple/a3};

        HashMap<Double, Integer> map = new HashMap<>();

        double minRatio = realRatio[0];
        for(int i = 1; i<3; i++){
            if(minRatio> realRatio[i]){
                minRatio = realRatio[i];
            }
        }

        //System.out.println("min"+minRatio);
        for(int i=0; i<3; i++){
            double left = juice[i] - minRatio*ratio[i];
            System.out.print(String.format("%.5f", left) + " ");
        }

    }
}
