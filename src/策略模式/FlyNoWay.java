package 策略模式;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("鸭子不能飞");
    }
}
