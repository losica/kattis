import java.lang.reflect.Array;
import java.util.*;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfCases = input.nextInt();
        int[] array = new int[numOfCases];
        int flag = 0;
        Map<Integer, Integer> map= new HashMap<>(); //value index
        for(int i = 1; i<=numOfCases; i++){
            int a =input.nextInt();
            array[i-1] = a;
            map.put(a, i);
        }
        Set<Integer> uniqueInt = new HashSet<>();
        for(int i = 0; i < numOfCases; i++) {
            for(int j = 0; j < numOfCases; j++) {
                if(i != j) {
                    if( array[i] != array[j]) {
                        flag = 1;
                    } else {
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1 || array.length==1) {
                uniqueInt.add(array[i]);
                //System.out.println("Unique int" + array[i]+" ");
            }
        }

        Integer maxInt = uniqueInt
                .stream()
                .mapToInt(v -> v)
                .max().orElse(-1);
        //.orElseThrow(NoSuchElementException::new)
        //System.out.println(maxInt);
        if(map.containsKey(maxInt)) {
            System.out.println(map.get(maxInt));
        } else {
            System.out.println("none");
        }


    }

}
