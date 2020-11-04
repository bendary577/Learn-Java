package strategyPattern.encapsulatedBehaviour.parking;

import strategyPattern.encapsulatedBehaviour.parking.Parking;

public class HungerParking implements Parking {
    @Override
    public void park() {
        System.out.println("i'm parking due to hunger ....");
    }
}
