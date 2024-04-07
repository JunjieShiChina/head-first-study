package 装设者模式;

public class 中杯 extends 杯型装设者 {
    饮料 饮料;

    public 中杯(饮料 饮料) {
        this.饮料 = 饮料;
    }

    @Override
    public String getDescription() {
        return 饮料.getDescription() + ", 中杯";
    }

    @Override
    public double cost() {
        return 0.1 + 饮料.cost();
    }
}
