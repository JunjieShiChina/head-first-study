package 观察者模式;

import java.util.Observable;

public class NDisplay2 implements java.util.Observer, Dispaly{

    private Observable observable;
    private String displayMsg;

    public NDisplay2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("display2 display " + displayMsg);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof NWeatherData) {
            NWeatherData nWeatherData = (NWeatherData) o;
            this.displayMsg = nWeatherData.getMsg();
            display();
        }
    }
}
