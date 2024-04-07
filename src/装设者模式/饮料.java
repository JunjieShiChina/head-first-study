package 装设者模式;

public abstract class 饮料 {

    String description = "未知饮料";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
