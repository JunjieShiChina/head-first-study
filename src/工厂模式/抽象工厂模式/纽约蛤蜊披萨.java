package 工厂模式.抽象工厂模式;

public class 纽约蛤蜊披萨 extends 披萨 {
    private 原料工厂 原料工厂;

    public 纽约蛤蜊披萨(原料工厂 原料工厂) {
        name = "纽约蛤蜊披萨";
        this.原料工厂 = 原料工厂;
    }

    @Override
    public void 准备() {
        System.out.println("准备 " + name);
        面团 = 原料工厂.创建面团();
        酱料 = 原料工厂.创建酱料();
        toppings.add(原料工厂.创建蛤蜊());
        toppings.add(原料工厂.创建蔬菜());
        toppings.add(原料工厂.创建香肠());
    }

    @Override
    public void 烘烤() {
        System.out.println("纽约蛤蜊披萨烘烤中");
    }

    @Override
    public void 切片() {
        System.out.println("纽约蛤蜊披萨切片中");
    }

    @Override
    public void 装盒() {
        System.out.println("纽约蛤蜊披萨装盒中");
    }
}
