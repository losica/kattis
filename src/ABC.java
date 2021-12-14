import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        String order = input.next();
        //System.out.println(order);

        int[] array = {a, b, c};
        Arrays.sort(array);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", array[0]);
        map.put("B", array[1]);
        map.put("C", array[2]);
        //System.out.println(order);
        System.out.println(map.get(order.substring(0,1))+" " +map.get(order.substring(1,2))+ " " + map.get(order.substring(2,3)));
    }
}
