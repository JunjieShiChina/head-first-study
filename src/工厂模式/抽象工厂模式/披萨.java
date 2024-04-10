package 工厂模式.抽象工厂模式;

import java.util.ArrayList;

public abstract class 披萨 {
    String name;
    面团 面团;
    酱料 酱料;
    ArrayList<原料> toppings = new ArrayList<原料>();

    abstract void 准备();

    void 烘烤() {
        System.out.println("烘烤 25 分钟");
    }

    void 切片() {
        System.out.println("披萨切片");
    }

    void 装盒() {
        System.out.println("披萨装盒");
    }

    public String getName() {
        return name;
    }
}
