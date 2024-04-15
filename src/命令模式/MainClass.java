package 命令模式;

public class MainClass {

    public static void main(String[] args) {
        // 创建一个灯对象
        Light light = new Light();
        // 创建一个打开灯的命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        // 创建一个遥控器
        RemoteControl remoteControl = new RemoteControl();
        // 设置命令
        remoteControl.setCommand(lightOnCommand);
        // 打开灯
        remoteControl.buttonOn();
        // 关闭灯
        remoteControl.buttonOff();
    }

}
