package strategyPattern;

/**
 * 玩具鸭子
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("我是一只玩具鸭子");
    }
}
