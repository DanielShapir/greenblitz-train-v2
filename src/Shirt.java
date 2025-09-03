public class Shirt {
    public int size;
    public String color;

    public Shirt(String color, int size) {
        this.color = color;
        this.size = size;
    }
    // copy constructor needed for closetS
    public Shirt(Shirt other){
        this.color = other.color;
        this.size = other.size;

    }
    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

}
