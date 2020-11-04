package strategyPattern;

import strategyPattern.concreteClasses.Animal;
import strategyPattern.concreteClasses.Creature;
import strategyPattern.concreteClasses.Human;
import strategyPattern.encapsulatedBehaviour.parking.HungerParking;
import strategyPattern.encapsulatedBehaviour.talking.Shouting;
import strategyPattern.encapsulatedBehaviour.talking.TalkingLoud;

public class StrategyMain {

    public static void main(String[] args) {

        Creature human = new Human();
        Creature animal = new Animal();

        human.setTalkingBehaviour(new TalkingLoud());
        human.performTalkingBehaviour();

        animal.setParkingBehaviour(new HungerParking());
        animal.performParkingBehaviour();

        human.setTalkingBehaviour(new Shouting());
        human.performTalkingBehaviour();

    }

}