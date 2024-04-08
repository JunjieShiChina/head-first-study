package 工厂模式.工厂方法模式;

public class 纽约胡椒披萨 extends 披萨 {

            @Override
            public void 准备() {
                System.out.println("准备纽约胡椒披萨的原材料");
            }

            @Override
            public void 烘烤() {
                System.out.println("纽约胡椒披萨烘烤中");
            }

            @Override
            public void 切片() {
                System.out.println("纽约胡椒披萨切片中");
            }

            @Override
            public void 装盒() {
                System.out.println("纽约胡椒披萨装盒中");
            }
}
