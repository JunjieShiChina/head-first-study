package 工厂模式.抽象工厂模式;

public class 纽约披萨店 extends 披萨店 {

        @Override
        protected 披萨 创建披萨(String type) {
            原料工厂 原料工厂 = new 纽约原料工厂();
            if (type.equals("奶酪")) {
                return new 纽约奶酪披萨(原料工厂);
            } else if (type.equals("蛤蜊")) {
                return new 纽约蛤蜊披萨(原料工厂);
            } else if (type.equals("胡椒")) {
                return new 纽约胡椒披萨(原料工厂);
            } else {
                return null;
            }
        }
}
