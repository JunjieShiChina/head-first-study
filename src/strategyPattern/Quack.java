package strategyPattern;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("鸭子在呱呱叫");
    }
}
