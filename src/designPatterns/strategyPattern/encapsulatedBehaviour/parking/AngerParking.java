package designPatterns.strategyPattern.encapsulatedBehaviour.parking;

public class AngerParking implements Parking {

    @Override
    public void park() {
        System.out.println("i'm parking due to anger ....");
    }
}
