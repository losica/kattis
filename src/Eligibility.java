import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Ada on 04.11.2018.
 */
public class Eligibility {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int noOfCases = input.nextInt();
        for(int i=0; i<noOfCases; i++) {
            String name = input.next();
            // date2013/09/01
            Date uinversityStart = new SimpleDateFormat("yyyy/MM/dd").parse(input.next());
            //System.out.println("uni start " + uinversityStart);
            Date birthdate = new SimpleDateFormat("yyyy/MM/dd").parse(input.next());
            int noOfCourses = input.nextInt();
            Date eligibleUniStart = new Date(109, 11,31);
            Date eligibleBirthdate = new Date(90, 11,31);
            //System.out.println("Birht elig" + eligibleBirthdate);
            //System.out.println("Eligible" + eligibleUniStart);
            if(uinversityStart.after(eligibleUniStart)){
                System.out.println(name + " eligible");
            } else if(birthdate.after(eligibleBirthdate)){
                System.out.println(name + " eligible");
            } else if(noOfCourses >= 41){
                System.out.println(name + " ineligible");
            } else {
                System.out.println(name + " coach petitions");
            }
        }
    }
}
