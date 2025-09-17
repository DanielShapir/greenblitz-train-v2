package lesson8;

public class MrCrabs extends Fish {

    public MrCrabs(String name, int age, String favFood) {
        super(name, age, favFood);
    }

    @Override
    public void goToWork() {
        takeTheCar();
    }
}
