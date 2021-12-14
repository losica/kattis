import java.util.Scanner;

public class OneChickenPerPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chickenDemand = input.nextInt();
        int chickenInStock = input.nextInt();

        int difference = chickenInStock - chickenDemand;
        if(difference<0) {
            if (difference == -1) {
                System.out.println("Dr. Chaz needs 1 more piece of chicken!");
            } else {
                System.out.println("Dr. Chaz needs "+ Math.abs(difference) +" more pieces of chicken!");
            }
        } else if(difference==1){
            System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
        } else {
            System.out.println("Dr. Chaz will have "+ difference +" pieces of chicken left over!");
        }

    }
}
