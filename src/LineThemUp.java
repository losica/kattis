import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ada on 07.11.2018.
 */
public class LineThemUp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int noOfCases = input.nextInt();
        ArrayList<String> lines = new ArrayList<>();
        for(int i=0; i<noOfCases; i++){
            lines.add(input.next());
        }
        List tmp = new ArrayList(lines);
        Collections.sort(tmp);
        boolean sortedIncreasing = tmp.equals(lines);
        boolean sortedDecreasing = true;
        for (int i = lines.size() -1 ; i > 0; i--) {
            if(lines.get(i).compareTo(lines.get(i-1))> 0){
                sortedDecreasing= false;
            }
        }
        if(sortedIncreasing){
            System.out.println("INCREASING");
        } else if (sortedDecreasing){
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }

    }

}
