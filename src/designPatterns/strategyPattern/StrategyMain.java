package designPatterns.strategyPattern;

import designPatterns.strategyPattern.concreteClasses.Animal;
import designPatterns.strategyPattern.concreteClasses.Creature;
import designPatterns.strategyPattern.concreteClasses.Human;
import designPatterns.strategyPattern.encapsulatedBehaviour.parking.HungerParking;
import designPatterns.strategyPattern.encapsulatedBehaviour.talking.Shouting;
import designPatterns.strategyPattern.encapsulatedBehaviour.talking.TalkingLoud;

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