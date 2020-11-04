package observerPattern.observer;

import observerPattern.State;
import observerPattern.publisher.Publisher;

public interface Observer {

    public void update(State data);
    public void addAsObserver();
    public void removeAsObserver();
    public Publisher getPublisher();
    public void setPublisher(Publisher publisher);
    public State getData();
}
