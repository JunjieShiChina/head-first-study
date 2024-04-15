package 命令模式;

public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonOn() {
        command.execute();
    }

    public void buttonOff() {
        command.undo();
    }

}
