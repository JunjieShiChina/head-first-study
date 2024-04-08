package 工厂模式.工厂方法模式;

public class 芝加哥蛤蜊披萨 extends 披萨 {

        public 芝加哥蛤蜊披萨() {
            name = "芝加哥蛤蜊披萨";
            dough = "厚饼";
            sauce = "小番茄酱";
            toppings.add("意大利白干酪");
            toppings.add("新鲜蛤蜊");
        }

        @Override
        public void 切片() {
            System.out.println("将披萨切成方块");
        }
}
