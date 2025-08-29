public class Bed {
    private int numOfPillows;
    private double height;
    private String colorOfSheets;

    public Bed(int numOfPillows, double height, String colorOfSheets) {
        this.colorOfSheets = colorOfSheets;
        this.height = height;
        this.numOfPillows = numOfPillows;
    }

    public double getHeight() {
        return height;
    }
    public int getNumOfPillows() {return numOfPillows;}
    public String getColorOfSheets() {return colorOfSheets;}





}
