package 策略模式;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子不能发声");
    }
}
