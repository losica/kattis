import java.util.*;

/**
 * Created by Ada on 06.11.2018.
 */
public class PokerHand {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> cardsMap = new HashMap<>();
        for(int i =0; i<5; i++) {
            String card = input.next().substring(0,1);
            if(!cardsMap.containsKey(card)){
                cardsMap.put(card, 1);
            } else {
                cardsMap.replace(card, cardsMap.get(card)+1);
            }
        }
        Set<Integer> set = new HashSet<>(cardsMap.values());
        int[] array = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(array);
        System.out.println(array[array.length-1]);

    }

}
