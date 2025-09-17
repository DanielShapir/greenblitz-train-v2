package lesson8;

public abstract class Fish {
    private int age;
    private String name;
    private String favFood;

    public Fish(String name, int age, String favFood) {
        this.age = age;
        this.name = name;
        this.favFood = favFood;
    }

    public int getAge() {
        return age;
    }

    public String getFavFood() {
        return favFood;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeTheCar() {
        System.out.println(" took the car");

    }

    public void Walk() {
        System.out.println(" i walked");

    }

    public void takeTheTrain() {
        System.out.println(" took the train");

    }

    public abstract void goToWork();
}
