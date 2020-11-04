package observerPattern;

import observerPattern.observer.ConcreteObserverOne;
import observerPattern.observer.ConcreteObserverTwo;
import observerPattern.observer.Observer;
import observerPattern.publisher.ConcretePublisher;
import observerPattern.publisher.Publisher;

public class ObserverMain {
    public static void main(String[] args) {

        Observer observerOne = new ConcreteObserverOne();
        Observer observerTwo = new ConcreteObserverTwo();

        Publisher publisher = new ConcretePublisher();

        observerOne.setPublisher(publisher);
        observerOne.addAsObserver();

        observerTwo.setPublisher(publisher);
        observerTwo.addAsObserver();

        State data = new State();
        data.setDataValue("this is the first data value");

        publisher.changeState(data);
        publisher.notifyObservers();

        System.out.println(observerOne.getData().getDataValue());
        System.out.println(observerTwo.getData().getDataValue());

        data.setDataValue("this is the second data value");
        publisher.changeState(data);
        publisher.notifyObservers();

        System.out.println(observerOne.getData().getDataValue());
        System.out.println(observerTwo.getData().getDataValue());

        observerOne.removeAsObserver();
        observerTwo.removeAsObserver();



    }
}
