package observerPattern;

public class Display2 implements Observer,Dispaly{
    private Subject subject;
    private String displayMsg;

    public Display2(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void display() {
        System.out.println("display2 display " + displayMsg);
    }

    @Override
    public void update(String msg) {
        this.displayMsg = msg;
        display();
    }
}
