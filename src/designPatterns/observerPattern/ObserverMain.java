package designPatterns.observerPattern;

import designPatterns.observerPattern.observer.ConcreteObserverOne;
import designPatterns.observerPattern.observer.ConcreteObserverTwo;
import designPatterns.observerPattern.observer.Observer;
import designPatterns.observerPattern.publisher.ConcretePublisher;
import designPatterns.observerPattern.publisher.Publisher;

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
