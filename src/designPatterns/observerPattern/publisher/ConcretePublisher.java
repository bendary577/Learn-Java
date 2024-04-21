package designPatterns.observerPattern.publisher;

import designPatterns.observerPattern.State;
import designPatterns.observerPattern.observer.ConcreteObserverOne;
import designPatterns.observerPattern.observer.Observer;

import java.util.ArrayList;

public class ConcretePublisher implements Publisher {
    private ArrayList<Observer> observers;
    private State data;


    public ConcretePublisher() {
        observers = new ArrayList<>();
        data = new State();
    }

    @Override
    public void addObserver(Observer observer) {
        if(observer instanceof ConcreteObserverOne){
            System.out.println("adding observer one ....");
        }else{
            System.out.println("adding observer two ...");
        }
        observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        if(observer instanceof ConcreteObserverOne){
            System.out.println("removing observer one ....");
        }else{
            System.out.println("removing observer two ...");
        }
        boolean deleted = observers.indexOf(observer) > 0 ? observers.remove(observer) : false ;
        return deleted;
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    @Override
    public void changeState(State data) {
        setData(data);
    }

    public State getData() {
        return data;
    }

    public void setData(State data) {
        this.data = data;
    }
}
