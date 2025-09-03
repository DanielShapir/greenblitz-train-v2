public class Closet {
    private Shirt[] shirts;

public Closet (int numOfShelves){
    this.shirts = new Shirt[numOfShelves];
}
public Shirt getShirt(int shelf ){
    return new Shirt(shirts[shelf]);
}

}
