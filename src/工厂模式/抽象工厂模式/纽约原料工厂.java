package 工厂模式.抽象工厂模式;

public class 纽约原料工厂 implements 原料工厂 {

    @Override
    public 面团 创建面团() {
        return new 纽约薄皮面团();
    }

    @Override
    public 酱料 创建酱料() {
        return new 纽约番茄酱();
    }

    @Override
    public 蔬菜 创建蔬菜() {
        return new 纽约大蒜();
    }

    @Override
    public 奶酪 创建奶酪() {
        return new 纽约高级奶酪();
    }

    @Override
    public 香肠 创建香肠() {
        return new 纽约高级香肠();
    }

    @Override
    public 蛤蜊 创建蛤蜊() {
        return new 纽约蛤蜊();
    }
}
