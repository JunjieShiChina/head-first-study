package strategyPattern;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("鸭子在CC叫");
    }
}
