import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Ada on 27.10.2018.
 */
public class RationalSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            int order = input.nextInt();
            String str = input.next();
            String[] a = str.split("/");
            int p = Integer.parseInt(a[0]);
            int q = Integer.parseInt(a[1]);
            int maxPQ = Math.max(p, q);
            int levelBefofeCount = new BigInteger("2").pow(maxPQ).intValue();
            int p1 = 1;
            int q1 = 1;
            int count = 1;
            //for(int s= 1; s<maxPQ; s++){
            //  if(p1 != p && q1 != q){

//                }
            //          }

            System.out.println(order + " " + p + " " + q + " lvl " +func(Integer.parseInt(args[0]),
                    Integer.parseInt(args[1])));
        }
    }

            public static int func(int num, int den) {
                ArrayList<Boolean> lefts = new ArrayList<>();
                while (num != den) {
                    if (num < den) {
                        //it's a left child
                        den = den - num;
                        lefts.add(true);
                    } else {
                        num = num - den;
                        lefts.add(false);
                    }
                }
                int s = (1 << lefts.size()) - 1; // 2^(i+1) - 1
                int k = 0;
                for (int i = lefts.size() - 1; i >= 0; i--) {
                    if (!lefts.get(i)) {
                        k += 1 << i;
                    }
                }
                return s + k + 1;
            }

            public static void main2(String[] args) {
                System.out.println(func(Integer.parseInt(args[0]),
                        Integer.parseInt(args[1])));
            }
        }


