import java.util.Scanner;

/**
 * Created by Ada on 23.10.2018.
 */
public class SumKindOfProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfCases = input.nextInt();
        for(int i=1; i<=noOfCases; i++){
            int caseNo = input.nextInt();
            int x = input.nextInt();
            int s1 =0;
            int s2 =1;
            int s3 =0;
            for(int a=0; a<=x; a++){
                s1=s1+a;
                s3=s3+(2*a);
                s2=s2+(2*a-1);
            }

            System.out.println(caseNo + " " + s1 + " " + s2 + " " + s3);

        }
    }
}
