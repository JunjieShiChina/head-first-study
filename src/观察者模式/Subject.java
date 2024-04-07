package 观察者模式;

public interface Subject {

    void register(Observer observer);

    void remove(Observer observer);

    void notifyObserver();

}
