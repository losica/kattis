import java.util.*;

/**
 * Created by Ada on 08.11.2018.
 */
public class CostumeContest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> costumes= new TreeMap<>();
        int noOfCases = input.nextInt();
        for(int i = 0; i<noOfCases; i++){
            String costume = input.next();
            if(costumes.containsKey(costume)){
                int count = costumes.get(costume) +1;
                costumes.replace(costume, count);
            } else {
                costumes.put(costume, 1);
            }
        }
        Set<Integer> values = new TreeSet<>(costumes.values());
        int smallest = values.stream().min(Integer::compare).get();
        ArrayList<String> bestCostumes = new ArrayList<>();
        for (Map.Entry<String, ?> entry : costumes.entrySet()) {
            if(entry.getValue() == (Integer) smallest) {
                bestCostumes.add(entry.getKey());
            }
        }
        Collections.sort(bestCostumes);
        for(String s: bestCostumes){
            System.out.println(s);
        }
    }
}
