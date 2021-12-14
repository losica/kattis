import java.util.Scanner;

/**
 * Created by Ada on 07.11.2018.
 */
public class Mjehuric {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i=0; i<5; i++){
            numbers[i] = input.nextInt();
        }
        boolean inOrder = false;
        while(!inOrder){
            for(int i=0; i<4; i++){
                if(numbers[i]>numbers[i+1]){
                    swap(numbers, i, i+1);
                    printArray(numbers);
                    //break;
                }

                inOrder = checkInOrder(numbers);

            }
        }

    }

    public static void printArray(int[] arrayToPrint){
        String s="";
        for(int i=0; i<arrayToPrint.length; i++){
            if(i==arrayToPrint.length-1) {
                s += arrayToPrint[i];
            } else{
                s += arrayToPrint[i] + " ";
            }
        }
        System.out.println(s);
    }

    public static final void swap (int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean checkInOrder(int[] numbers){
        return numbers[0]==1 && numbers[1]==2 && numbers[2]==3 && numbers[3]==4 && numbers[4]==5;
    }

}
