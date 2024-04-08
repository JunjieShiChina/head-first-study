package 工厂模式.工厂方法模式;

public class 纽约奶酪披萨 extends 披萨 {

        public 纽约奶酪披萨() {
            name = "纽约奶酪披萨";
            dough = "薄皮面团";
            sauce = "大蒜番茄酱";
            toppings.add("意大利Reggiano高级干酪");
        }

        @Override
        public void 切片() {
            System.out.println("把披萨切成长条");
        }
}
