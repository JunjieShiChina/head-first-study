package 工厂模式.抽象工厂模式;

public interface 原料工厂 {

    public 面团 创建面团();

    public 酱料 创建酱料();

    public 蔬菜 创建蔬菜();

    public 奶酪 创建奶酪();

    public 香肠 创建香肠();

    蛤蜊 创建蛤蜊();
}
