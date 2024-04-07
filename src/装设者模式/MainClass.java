package 装设者模式;

import java.io.*;

public class MainClass {

        public static void main(String[] args) throws IOException {
            饮料 饮料 = new 蒸馏咖啡();
            System.out.println(饮料.getDescription() + " 价格：" + 饮料.cost());

            饮料 = new 中杯(new 摩卡(饮料));
            System.out.println(饮料.getDescription() + " 价格：" + 饮料.cost());
            饮料 = new 牛奶(饮料);
            System.out.println(饮料.getDescription() + " 价格：" + 饮料.cost());

            饮料 饮料2 = new 大杯(new 糖(new 摩卡(new 牛奶(new 蒸馏咖啡()))));
            System.out.println(饮料2.getDescription() + " 价格：" + 饮料2.cost());

            int c;
            InputStream in = new 小写转换输入流(new BufferedInputStream(new FileInputStream("test.txt")));
            while( (c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        }
}
