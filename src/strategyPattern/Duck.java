package strategyPattern;

public abstract class Duck {

    // 抽象行为
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    /**
     * 委托飞
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 委托叫
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("鸭子在游泳");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
