package 工厂模式.工厂方法模式;

import java.util.ArrayList;

public abstract class 披萨 {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void 准备() {
        System.out.println("准备 " + name);
        System.out.println("揉面团...");
        System.out.println("添加酱料...");
        System.out.println("添加配料: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

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
