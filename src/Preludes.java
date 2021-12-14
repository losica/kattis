import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Ada on 07.11.2018.
 */
public class Preludes {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Map<String, String> notes = new HashMap<>();
        notes.put("A#", "Bb");
        notes.put("Bb", "A#");
        notes.put("C#", "Db");
        notes.put("Db", "C#");
        notes.put("D#", "Eb");
        notes.put("Eb", "D#");
        notes.put("F#", "Gb");
        notes.put("Gb", "F#");
        notes.put("G#", "Ab");
        notes.put("Ab", "G#");
        int count = 1;
        while (input.hasNext()) {
            String note = input.next();
            String tonality = input.next();
            if(notes.containsKey(note)){
                note = notes.get(note);
                System.out.println("Case "+ count +": " + note + " "+ tonality);
            } else {
                note ="UNIQUE";
                System.out.println("Case "+ count +": " + note);
            }

            count++;
        }
    }
}
