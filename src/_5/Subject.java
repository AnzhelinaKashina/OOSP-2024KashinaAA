package _5;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(String task);
}