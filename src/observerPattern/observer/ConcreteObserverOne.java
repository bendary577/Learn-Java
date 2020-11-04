package observerPattern.observer;

import observerPattern.State;
import observerPattern.publisher.Publisher;

public class ConcreteObserverOne  implements Observer{
    private State data;
    private Publisher publisher;

    public ConcreteObserverOne(){}

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
