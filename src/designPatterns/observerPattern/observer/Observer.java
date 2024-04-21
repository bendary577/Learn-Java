package designPatterns.observerPattern.observer;

import designPatterns.observerPattern.State;
import designPatterns.observerPattern.publisher.Publisher;

public interface Observer {

    public void update(State data);
    public void addAsObserver();
    public void removeAsObserver();
    public Publisher getPublisher();
    public void setPublisher(Publisher publisher);
    public State getData();
}
