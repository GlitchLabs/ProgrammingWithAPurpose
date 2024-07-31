public class WorldMap {
    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(width,height);
        StdDraw.setXscale(0,width);
        StdDraw.setYscale(0,height);
        String regionName;

        while (!StdIn.isEmpty()) {
            //now we deal with regions
            regionName = StdIn.readString();
            int vertAmount = StdIn.readInt();
            double[]xCoords = new double[vertAmount];
            double[]yCoords = new double[vertAmount];
            for(int i = 0; i < vertAmount; i++){
                xCoords[i] = StdIn.readDouble();
                yCoords[i]= StdIn.readDouble();

            }
                StdDraw.polygon(xCoords, yCoords);
        }
    }
}
