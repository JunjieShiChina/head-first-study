package 装设者模式;

public class 蒸馏咖啡 extends 饮料 {

    public 蒸馏咖啡() {
        description = "蒸馏咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
