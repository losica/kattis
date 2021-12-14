import java.util.*;

/**
 * Created by Ada on 07.11.2018.
 */
public class Peragram {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String line = input.next();
        Map<String, Integer> characters = new HashMap<>();
        for(int i=1; i<=line.length(); i++){
            String c = line.substring(i-1, i);
            int count = 1;
            if(characters.containsKey(c)){
                count = characters.get(c) + 1;
                //System.out.println("Replacing " + c + " with value "+ count);
                characters.replace(c, count);
            } else {
                //System.out.println("Adding "+ c + " with value "+ count);
                characters.put(c, count);
            }
        }
        int charToReplace = 0;
        for(Integer v: characters.values()){
            if(v%2==1){
                charToReplace++;
            }
        }
        if(charToReplace>0){
            charToReplace--;
        }

        System.out.println(charToReplace);
    }
}
