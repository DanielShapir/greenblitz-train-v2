package lesson8;

public class Spongebob extends Fish implements ProfessionalBasketBallPlayer {


    public Spongebob(String name, int age, String favFood) {
        super(name, age, favFood);
    }

    @Override
    public void goToWork() {
        takeTheTrain();
    }

    @Override
    public void playBasketBall() {
        System.out.println("im a pro frfr");
    }
}
