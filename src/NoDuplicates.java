import java.util.*;

public class NoDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine();
        //System.out.println(phrase);
        List<String> list = Arrays.asList(phrase.split(" "));
        Set<String> set = new HashSet<>();
        boolean addedSuccessfully = true;
        for(String s: list){
            addedSuccessfully = set.add(s);
            if(addedSuccessfully == false){
                System.out.println("no");
                break;
            }
        }
        if(addedSuccessfully){
            System.out.println("yes");
        }
    }
}
