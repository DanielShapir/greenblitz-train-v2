package lesson8;

public class Main {
    public static void main(String[] args) {
    }

    public static void q5(ProfessionalBasketBallPlayer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Fish) {
                ((Fish) arr[i]).goToWork(); // ask nitay about the  ((Fish)
                arr[i].playBasketBall();
            } else {
                arr[i].playBasketBall();

            }
        }
    }
}

