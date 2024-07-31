public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        //tdOut.print("give me a sequence of numbers between 1.0000 and " + m);
        int counter = 0;
        int[] freq = new int[m + 1];
        while (!StdIn.isEmpty()) {
            int number = StdIn.readInt();
            if (number > m) {
                //StdOut.println(number + " greater than " + m + " choose one smaller than " + m);
            } else {
                freq[number] += 1;
                //StdOut.println(number + " " + freq[number] + " ");
                counter++;
            }
        }
        double[] pOfI = new double[m + 1];
        double H = 0;
        for (int i = 0; i < freq.length; ++i) {
            //StdOut.println(i + " shows up " + freq[i] + " Times)");
            if (freq[i] == 0) {
                pOfI[i] = 0;
            } else {

                double denominator = (double) counter / freq[i];
                //StdOut.println((double) counter + "/" + freq[i] + " = " + denominator);
                pOfI[i] = 1 / denominator;
                //StdOut.println("pi of " + i + " = 1/" + (int) denominator);
                double negPofI = (-(pOfI[i]));
                double logResult = Math.log(pOfI[i]) / Math.log(2);
                H += (negPofI * (logResult));
                //StdOut.printf("%.4f\n H = ", H);
            }
        }
        //StdOut.printf("%.4f", "H = " + H);
        StdOut.printf("%.4f", H);
    }
}
