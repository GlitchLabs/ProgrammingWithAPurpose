/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        long sideA = (long) Math.pow(a, 2);
        long sideB = (long) Math.pow(b, 2);
        long sideC = (long) Math.pow(c, 2);

        // System.out.println(sideA + " + " + sideB + " (" + (sideA + sideB) + ")" + " == " + sideC);

        boolean result0 = sideA + sideB == sideC;
        boolean result1 = sideA + sideC == sideB;
        boolean result2 = sideB + sideC == sideA;

        System.out.println(
                (sideA > 0 && sideB > 0 && sideC > 0) && (result0 == true || result1 == true
                        || result2 == true));


    }
}
