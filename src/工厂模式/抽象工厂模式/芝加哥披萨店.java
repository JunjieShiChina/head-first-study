package 工厂模式.抽象工厂模式;

public class 芝加哥披萨店 extends 披萨店 {

    @Override
    protected 披萨 创建披萨(String type) {
        原料工厂 原料工厂 = new 芝加哥原料工厂();
        if (type.equals("奶酪")) {
            return new 芝加哥奶酪披萨(原料工厂);
        } else if (type.equals("蛤蜊")) {
            return new 芝加哥蛤蜊披萨(原料工厂);
        } else if (type.equals("胡椒")) {
            return new 芝加哥胡椒披萨(原料工厂);
        } else {
            return null;
        }
    }
}
