package 装设者模式;

public class 首选咖啡 extends 饮料 {

        public 首选咖啡() {
            description = "首选咖啡";
        }

        @Override
        public double cost() {
            return 0.89;
        }
}
