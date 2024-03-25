package observerPattern;

import java.util.Observable;

public class NDisplay1 implements java.util.Observer, Dispaly{

    private Observable observable;
    private String displayMsg;

    public NDisplay1(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("display1 display " + displayMsg);
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
