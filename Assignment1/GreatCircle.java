/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        // get the coordinates on the sphere in degrees from the command line
        double x1 = Double.parseDouble(args[0]);
        double x2 = Double.parseDouble(args[1]);
        double y1 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        // mean radius of Earth in Kilometers
        double RADIUS = 6371.0;
        double x2MinusX1 = x2 - x1;
        double sinX = Math.sin(Math.toRadians(x2MinusX1) / 2);
        double sinXSquared = Math.pow(sinX, 2.0);

        double sinY = Math.sin(Math.toRadians(y2 - y1) / 2);
        double sinYSquared = Math.pow(sinY, 2.0);

        double cosX1 = Math.cos(Math.toRadians(x1));
        double cosX2 = Math.cos(Math.toRadians(x2));
        double underSquareRoot = sinXSquared + (cosX1 * cosX2 * sinYSquared);
        double squareRoot = Math.sqrt(underSquareRoot);
        double arcSin = Math.asin(Math.toRadians(squareRoot));
        double distance = RADIUS * 2 * arcSin;

        // Great-circle distance in Kilometers
        // distance = (2 * RADIUS) * (Math.asin(
        //         Math.sqrt(((Math.sin((x2 - x1) / 2) * Math.sin((x2 - x1) / 2)) +
        //                 (Math.cos(x1) * Math.cos(x2) * (Math.sin(
        //                         (y2 - y1) / 2) * (Math.sin(
        //                         (y2 - y1) / 2)))))
        //         )));
        System.out.println(distance + " Kilometers");
    }
}
