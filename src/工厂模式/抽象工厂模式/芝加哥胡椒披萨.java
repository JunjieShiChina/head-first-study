package 工厂模式.抽象工厂模式;

public class 芝加哥胡椒披萨 extends 披萨 {

    private 原料工厂 原料工厂;

    public 芝加哥胡椒披萨(原料工厂 原料工厂) {
        name = "芝加哥胡椒披萨";
        this.原料工厂 = 原料工厂;
    }

    @Override
    public void 准备() {
        System.out.println("准备 " + name);
        面团 = 原料工厂.创建面团();
        酱料 = 原料工厂.创建酱料();
        toppings.add(原料工厂.创建奶酪());
        toppings.add(原料工厂.创建蔬菜());
        toppings.add(原料工厂.创建香肠());
        toppings.add(原料工厂.创建蛤蜊());
    }

    @Override
    public void 切片() {
        System.out.println("将披萨切成方块");
    }
}
