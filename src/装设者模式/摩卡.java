package 装设者模式;

public class 摩卡 extends 调料装设者 {
    饮料 饮料;

    public 摩卡(饮料 饮料) {
        this.饮料 = 饮料;
    }

    @Override
    public String getDescription() {
        return 饮料.getDescription() + ", 摩卡";
    }

    @Override
    public double cost() {
        return 0.20 + 饮料.cost();
    }
}
