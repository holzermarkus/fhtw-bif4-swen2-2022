package at.fhtw.swen2.patterns.observer;

import com.google.common.collect.Sets;

import java.util.Collection;

public abstract class Observable {

    private final Collection<Observer> observers = Sets.newHashSet();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
    public void notifyObservers(Object object) {
        observers.forEach(o -> o.update(this, object));
    }

}
