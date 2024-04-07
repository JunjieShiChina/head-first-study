package 装设者模式;

public class 牛奶 extends 调料装设者 {
    饮料 饮料;

    public 牛奶(饮料 饮料) {
        this.饮料 = 饮料;
    }

    @Override
    public String getDescription() {
        return 饮料.getDescription() + ", 牛奶";
    }

    @Override
    public double cost() {
        return 0.10 + 饮料.cost();
    }
}
