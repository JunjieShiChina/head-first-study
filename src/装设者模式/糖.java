package 装设者模式;

public class 糖 extends 调料装设者 {
    饮料 饮料;

    public 糖(饮料 饮料) {
        this.饮料 = 饮料;
    }

    @Override
    public String getDescription() {
        return 饮料.getDescription() + ", 糖";
    }

    @Override
    public double cost() {
        return 0.05 + 饮料.cost();
    }
}
