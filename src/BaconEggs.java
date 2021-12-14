import java.util.*;

/**
 * Created by Ada on 03.11.2018.
 */
public class BaconEggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNextInt()) {
            Map<String, Set<String>> foodToNames = new HashMap<>();

            int numberOfLines = input.nextInt();
            if(numberOfLines==0){
                break;
            }
            for(int i=0; i<=numberOfLines; i++){
                String line = input.nextLine();
                //System.out.println(line);
                String[] str = line.split(" ");
                String name = str[0];
                for(int a=1; a<str.length; a++){
                    String foodName = str[a];
                    Set<String> set =foodToNames.get(foodName);
                    if(set==null) {
                        set = new TreeSet<>();
                        set.add(name);
                        foodToNames.put(str[a], set);
                    } else {
                        set.add(name);
                        foodToNames.replace(str[a], set);
                    }
                }
            }

            Set<String> ff = new TreeSet<>(foodToNames.keySet());
            for(String s: ff){
                String toPrint = s;
                Set<String> names = foodToNames.get(s);
                for(String dd: names){
                    //System.out.println(dd);
                    toPrint+=" "+dd;
                }
                System.out.println(toPrint);
            }
            System.out.println();
        }
    }
}
