import java.util.Arrays;
import java.util.Scanner;

public class Akcija {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfBooks = input.nextInt();
        int[] array = new int[noOfBooks];
        for(int a =0 ; a <noOfBooks; a++){
            array[a] = input.nextInt();
        }
        //sort the array
        Arrays.sort(array);

        int sum = 0;
        for(int i=array.length - 1; i >=0; i=i-2) {
            sum = sum + array[i];
            i--;
            if(i >=0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }

}
