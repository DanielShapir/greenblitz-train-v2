package lesson8;

public class Patrick extends Fish implements ProfessionalBasketBallPlayer{

    public Patrick(String name, int age, String favFood) {
        super(name, age, favFood);
    }

    @Override
    public void goToWork() {
        Walk();
    }

    @Override
    public void playBasketBall() {
        System.out.println("im pro frfrfrfr");
    }
}
