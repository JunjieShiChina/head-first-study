package 工厂模式.工厂方法模式;

public class 纽约披萨店 extends 披萨店 {

        @Override
        protected 披萨 创建披萨(String type) {
            if (type.equals("奶酪")) {
                return new 纽约奶酪披萨();
            } else if (type.equals("蛤蜊")) {
                return new 纽约蛤蜊披萨();
            } else if (type.equals("胡椒")) {
                return new 纽约胡椒披萨();
            } else {
                return null;
            }
        }
}
