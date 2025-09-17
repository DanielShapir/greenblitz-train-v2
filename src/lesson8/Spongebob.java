package lesson8;

public class Spongebob extends Fish{


    public Spongebob(String name, int age, String favFood) {
        super(name, age, favFood);
    }

    @Override
    public void goToWork() {
      takeTheTrain();
    }
}
