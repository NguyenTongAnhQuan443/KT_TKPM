package vn.edu.iuh.fit.design.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean change;
    private final Object MUTEX = new Object();

    public Topic(List<Observer> observers) {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null) throw  new NullPointerException("observer is null");
        synchronized (MUTEX) {
            if(!observer.)
        }
    }

    @Override
    public void unregister(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public Object getUpdate(Observer observer) {
        return null;
    }
}
