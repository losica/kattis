import java.util.*;

/**
 * Created by Ada on 08.11.2018.
 */
public class UnbearableZoo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int noOfCases = input.nextInt();
        int listNo = 1;
        input.next();
        while(noOfCases!=0){
            Map<String, Integer> animals = new HashMap<>();
            for(int i=0; i<noOfCases; i++){
                String lineStr = input.nextLine();
                //System.out.println(lineStr);
                String[] line = lineStr.split(" ");
                int lastIndex = line.length - 1;
                String animal = line[line.length-1].toLowerCase();
                if(animals.containsKey(animal)){
                    int count = animals.get(animal) +1;
                    animals.put(animal,count);
                } else {
                    //System.out.println("ADDDING ANIMAL " + animal);
                    animals.put(animal, 1);
                }
            }
            System.out.println("List " + listNo+":");
            printMap(animals);
            listNo++;
            if(input.hasNext()) {
                noOfCases = input.nextInt();
                if(input.hasNext()) {
                    input.next();
                }
            } else {
                noOfCases = 0;
            }
        }
    }

    public static void printMap(Map<String, Integer> map) {
        for(String key: new TreeSet<String>(map.keySet())) {
            System.out.println(key + " | " + map.get(key));
        }
    }
}
