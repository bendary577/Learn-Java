package designPatterns.strategyPattern.encapsulatedBehaviour.parking;

public class HungerParking implements Parking {
    @Override
    public void park() {
        System.out.println("i'm parking due to hunger ....");
    }
}
