package observerPattern;

import java.util.Observable;

public class NWeatherData extends Observable {
    private String msg;

    private void msgChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMsg(String msg) {
        this.msg = msg;
        msgChanged();
    }

    public String getMsg() {
        return msg;
    }
}
