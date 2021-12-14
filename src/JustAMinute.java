import java.util.Scanner;

public class JustAMinute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        double sum = 0;
        double averSum = 0;
        double averTimes = 0;
        for(int i =0; i<numberOfCases; i++){
            int time = input.nextInt();
            double secondsLapsed = input.nextDouble();
            //System.out.println(secondsLapsed);
            double average = secondsLapsed/(time*60);
            //System.out.println("AVERGGE" + average);
            averSum = averSum+(average*time);
            averTimes = averTimes+time;
        }
        //System.out.println("SUM" + sum);
        double aver = averSum/(averTimes);
        if(aver > 1) {
            System.out.println(String.format("%.9f", aver));
        } else {
            System.out.println("measurement error");
        }
    }
}
