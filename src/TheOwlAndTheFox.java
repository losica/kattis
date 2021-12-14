import java.util.Scanner;

public class TheOwlAndTheFox {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numOfcases = input.nextInt();
        for(int a=0; a<numOfcases; a++) {
            String numberStr = input.next();
            boolean found = false;
            while (!found) {
                boolean intFound = false;
                int i = numberStr.length();
                while (!intFound && i > 0) {
                    String strChar = numberStr.substring(i-1, i);
                    if(!strChar.equals("0")){
                        int d = Integer.parseInt(strChar);
                        d = d-1;
                        String newNumber = numberStr.substring(0,i-1) + d + numberStr.substring(i);
                        int numberToPrint = Integer.parseInt(newNumber);
                        System.out.println(numberToPrint);
                        found = true;
                        intFound = true;
                    }
                    i--;
                }
            }
        }
    }
}
