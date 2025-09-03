public class Closet {
    private Shirt[] shirts;

    public Closet(int numOfShelves) {
        this.shirts = new Shirt[numOfShelves];
    }

    public Shirt getShirt(int shelf) {
        return new Shirt(shirts[shelf]);
    }

    public Shirt[] getShirtBySize(int size) {

        int counter = 0;
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i] != null && shirts[i].getSize() == size)
                counter++;
        }
        Shirt[] shirtsToReturn = new Shirt[counter];
        int j = 0;
        while (j < counter) {
            if (shirts[j].getSize() == size) {
                shirtsToReturn[j] = new Shirt(shirts[j]);
                j++;
            }
        }
        return shirtsToReturn;


    }
}