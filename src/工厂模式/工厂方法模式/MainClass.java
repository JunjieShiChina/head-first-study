package 工厂模式.工厂方法模式;

public class MainClass {
    public static void main(String[] args) {
        披萨店 纽约披萨店 = new 纽约披萨店();
        纽约披萨店.订购披萨("奶酪");
        纽约披萨店.订购披萨("蛤蜊");

        System.out.println("=====================================");

        披萨店 芝加哥披萨店 = new 芝加哥披萨店();
        芝加哥披萨店.订购披萨("奶酪");
        芝加哥披萨店.订购披萨("蛤蜊");

    }
}
