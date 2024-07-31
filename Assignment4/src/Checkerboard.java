public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);
        boolean colorSwap = false;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                double halfLength = 0.5;
                if (colorSwap) {
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                } else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                }
                StdDraw.filledSquare(row + halfLength, col + halfLength, halfLength);
                colorSwap = !colorSwap;
            }
            if (n % 2 == 0)
                colorSwap = !colorSwap;
        }
    }
}
