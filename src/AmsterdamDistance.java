import java.util.Scanner;

public class AmsterdamDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfSegments = input.nextInt();
        int noOfRings = input.nextInt();
        double noOfRingsD = (double) noOfRings;
        String radiusStr = input.next();

        double radius = Double.parseDouble(radiusStr);

        int ax = input.nextInt();
        int ay = input.nextInt();
        double ayDouble = (double) ay;
        int bx = input.nextInt();
        int by = input.nextInt();
        double byDouble = (double) by;

        double distanceX = Math.abs(ax-bx);
        double distanceY = Math.abs(ay-by);

        double radiusA = (radius*ayDouble)/noOfRingsD;
        double radiusB = (radius*byDouble)/noOfRingsD;
        double chosenRadius = 0;
        if(ay>by){
            chosenRadius = radiusB;
        } else {
            chosenRadius = radiusA;
        }

        //System.out.println("RADIUS A" +radiusA);


        //System.out.println(distanceX);
        //System.out.println(ayDouble/noOfRings);
        //System.out.println(distanceX/noOfSegments*Math.PI*radiusA);
        //System.out.println(distanceY);

        //System.out.println((radius)*(distanceX/noOfSegments));
        //System.out.println(distanceY*radius/noOfRings); // correct

        double diff = (Math.PI*chosenRadius)*(distanceX/noOfSegments) + distanceY*radius/noOfRings;
        double alternativeDiff = radiusA + radiusB;
        if(diff<alternativeDiff) {
            System.out.println(String.format("%.7f", diff));
        } else {
            System.out.println(alternativeDiff);
        }

    }
}
