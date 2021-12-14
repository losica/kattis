import java.util.Scanner;

//Mirko decided to heed his advice, however his alarm clock uses 24-hour notation and he has issues with adjusting the time. Help Mirko and write a program that will take one time stamp, in 24-hour notation, and print out a new time stamp, 45 minutes earlier, also in 24-hour notation.
//10 10 > 9 25
public class Spavanac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        int minutes = input.nextInt();

        if(minutes < 45) {
            hours = hours - 1;
            if(hours == -1){
                hours = 23;
            }
            minutes = 60+minutes-45;
        } else {
            minutes -=45;
        }
        System.out.println(hours + " " + minutes);
    }
}
