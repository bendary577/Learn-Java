package observerPattern.publisher;

import observerPattern.State;
import observerPattern.observer.ConcreteObserverOne;
import observerPattern.observer.Observer;

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
    public void removeObserver(Observer observer) {
        if(observer instanceof ConcreteObserverOne){
            System.out.println("removing observer one ....");
        }else{
            System.out.println("removing observer two ...");
        }
        int index = observers.indexOf(observer);
        if (index > 0) {
            observers.remove(observer);
        }
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
