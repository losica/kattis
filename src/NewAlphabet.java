import java.util.*;

/**
 * Created by Ada on 04.11.2018.
 */
public class NewAlphabet {

    public static void main(String[] args) throws Exception {
        Map<String, String> alphabet = new HashMap<>();
        alphabet.put("a", "@");
        alphabet.put("b", "8");
        alphabet.put("c", "(");
        alphabet.put("d", "|)");
        alphabet.put("e", "3");
        alphabet.put("f", "#");
        alphabet.put("g", "6");
        alphabet.put("h", "[-]");
        alphabet.put("i", "|");
        alphabet.put("j", "_|");
        alphabet.put("k", "|<");
        alphabet.put("l", "1");
        alphabet.put("m", "[]\\/[]");
        alphabet.put("n", "[]\\[]");
        alphabet.put("o", "0");
        alphabet.put("p", "|D");
        alphabet.put("q", "(,)");
        alphabet.put("r", "|Z");
        alphabet.put("s", "$");
        alphabet.put("t", "']['");
        alphabet.put("u", "|_|");
        alphabet.put("v", "\\/");
        alphabet.put("w", "\\/\\/");
        alphabet.put("x", "}{");
        alphabet.put("y", "`/");
        alphabet.put("z", "2");

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        //System.out.println(line);
        String[] all = {"!", ",", "?", ".", "&", "@", "<", ">","\\", "%", "#", "'", "   "};
        Set<String> allowed =new HashSet<>(Arrays.asList(all));

        String lineToPrint = "";
        for(int i=1; i<=line.length(); i++){
            String c = line.substring(i-1, i);
            //System.out.println(c.toLowerCase());
            if(allowed.contains(c)){
                lineToPrint += c;
            } else if(alphabet.containsKey(line.substring(i-1, i).toLowerCase())) {
                lineToPrint += alphabet.get(line.substring(i-1, i).toLowerCase());
            } else {
                lineToPrint += line.substring(i-1, i);
            }
        }
        System.out.println(lineToPrint);

    }
}
