package strategyPattern;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("鸭子不能飞");
    }
}
