package 工厂模式.抽象工厂模式;

public abstract class 披萨店 {

    public 披萨 订购披萨(String type) {
        披萨 披萨 = 创建披萨(type);
        披萨.准备();
        披萨.烘烤();
        披萨.切片();
        披萨.装盒();
        return 披萨;
    }

    protected abstract 披萨 创建披萨(String type);

}
