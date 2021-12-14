import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Towers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] array = new Integer[6];
        array[0] = input.nextInt();
        array[1] = input.nextInt();
        array[2] = input.nextInt();
        array[3] = input.nextInt();
        array[4] = input.nextInt();
        array[5] = input.nextInt();
        int tower1Height = input.nextInt();
        int tower2Height = input.nextInt();

        Arrays.sort(array, Collections.reverseOrder()); // sort array in descending order

        Integer[] tower1 = {array[0], array[1], array[2]};
        Integer[] tower2 = new Integer[3];
        int sum = sum(tower1);

        String arrayToPrint = "";

        if(sum == tower1Height){
            for(int n: array) {
                arrayToPrint= arrayToPrint + n +" ";
            }
        } else {

            while (sum != tower1Height) {
                for (int i = 0; i <= 3; i++) {
                    tower1[0] = array[i];
                    for (int s = 1; s <= 4; s++) {
                        tower1[1] = array[s];
                        for (int a = 3; a <= 5; a++) {//i is first number
                            tower1[2] = array[a];
                            sum = sum(tower1);
                            if (sum == tower1Height) {
                                array[i] = -1;
                                array[s] = -1;
                                array[a] = -1;
                                break;
                            }

                        }
                        if (sum == tower1Height) {
                            break;
                        }
                    }
                    if (sum == tower1Height) {
                        for (int n : tower1) {
                            arrayToPrint = arrayToPrint + n + " ";
                        }
                        for (int s : array) {
                            if (s != -1) {
                                arrayToPrint = arrayToPrint + s + " ";
                            }
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(arrayToPrint.substring(0, arrayToPrint.length()-1));

    }

    static int sum(Integer[] threeElementArray) {
        return threeElementArray[0] + threeElementArray[1] + threeElementArray[2];
    }
}
