package designPatterns.observerPattern.observer;

import designPatterns.observerPattern.State;
import designPatterns.observerPattern.publisher.Publisher;

public class ConcreteObserverTwo implements Observer{

    private State data;
    private Publisher publisher;

    public ConcreteObserverTwo(){}

    @Override
    public State getData() {
        return data;
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void addAsObserver(){
        publisher.addObserver(this);
    }

    @Override
    public void removeAsObserver(){
        publisher.removeObserver(this);
    }

    @Override
    public void update(State data) {
        this.data = data;
    }
}
