package observerPattern;

public class Display1 implements Observer, Dispaly{

    private Subject subject;
    private String displayMsg;

    public Display1(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void display() {
        System.out.println("display1 display " + displayMsg);
    }

    @Override
    public void update(String msg) {
        this.displayMsg = msg;
        display();
    }
}
