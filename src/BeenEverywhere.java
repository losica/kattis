import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeenEverywhere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfCases = input.nextInt();
        for(int i = 0; i<numOfCases; i++) {
            int cities = input.nextInt();
            Set<String> distinctCities = new HashSet<>();
            for(int a=0; a< cities; a++){
                distinctCities.add(input.next());
            }
            System.out.println(distinctCities.size());
        }
    }
}
