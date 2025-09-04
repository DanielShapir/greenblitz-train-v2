package lesson4;

public class Bed {
    private final double defaultPrice = 100;
    private int numOfPillows;
    private double height;
    private String colorOfSheets;
    private double price;

    public Bed(int numOfPillows, double height, String colorOfSheets, double price) {
        this.colorOfSheets = colorOfSheets;
        this.height = height;
        this.numOfPillows = numOfPillows;
        this.price = price;
    }

    public Bed(double height, String colorOfSheets) {
        this.colorOfSheets = colorOfSheets;
        this.height = height;
        numOfPillows = 1;
        this.price = defaultPrice;
    }

    public double getHeight() {
        return height;
    }

    public int getNumOfPillows() {
        return numOfPillows;
    }

    public String getColorOfSheets() {
        return colorOfSheets;
    }

    public void changeColorOfSheets(String colorOfSheets) {
        this.colorOfSheets = colorOfSheets;
    }
}
