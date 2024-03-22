package strategyPattern;

public class TestClass {

    public static void main(String[] args) {
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.swim();
        toyDuck.performFly();
        toyDuck.performQuack();
    }

}
