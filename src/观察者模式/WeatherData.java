package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private String msg;

    private List<Observer> observerList;

    public WeatherData () {
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(msg);
        }
    }

    private void msgChanged() {
        notifyObserver();
    }

    public void setMsg(String msg) {
        this.msg = msg;
        msgChanged();
    }
}
