package person;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSett {
    public static void main(String[] args) {
            Set<String> list1 = new HashSet(Arrays.asList("word3", "word4", "word5", "word6", "word7"));
            Set<String> list2 = new HashSet(Arrays.asList("word5", "word4"));
            list2.retainAll(list1);
    }
}
