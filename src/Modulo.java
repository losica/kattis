import java.util.*;

public class Modulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> distinctnumbers = new HashSet<>();
        for(int i=0; i<10; i++){
            distinctnumbers.add(input.nextInt()%42);
        }
        System.out.println(distinctnumbers.size());
    }
}
