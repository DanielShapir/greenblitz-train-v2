package lesson8;

public class SpongebobTheCook extends Spongebob {

    public SpongebobTheCook(String name, int age, String favFood) {
        super(name, age, favFood);
        super.playBasketBall();
    }

    @Override
    public void playBasketBall() {
        System.out.println("ive cooked the ball");
    }
}

