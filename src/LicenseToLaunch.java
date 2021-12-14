import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LicenseToLaunch {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numOfCases = input.nextInt();
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        int theSmallest=0;
        for(int i=0; i<numOfCases; i++){
            int n = input.nextInt();
            if(i==0 || theSmallest > n){
                theSmallest = n;
            }
            if(!valueToIndex.containsKey(n)) {
                valueToIndex.put(n, i);
            }
        }
        System.out.println(valueToIndex.get(theSmallest));
    }
}
