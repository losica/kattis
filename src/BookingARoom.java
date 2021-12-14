import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookingARoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfRooms = input.nextInt();
        int numOfBookedRooms = input.nextInt();

        ArrayList<Integer> list= new ArrayList<>();
        for(int i=1; i<= numberOfRooms; i++){
            list.add(new Integer(i));
        }

        for(int i=0; i < numOfBookedRooms; i++) {
            int s = input.nextInt();
            list.remove(new Integer(s));
        }
        if(list.size() > 0){
            System.out.println(list.get(0));
        } else {
            System.out.println("too late");
        }
    }
}
