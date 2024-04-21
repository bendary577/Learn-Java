package designPatterns.strategyPattern.concreteClasses;

import designPatterns.strategyPattern.encapsulatedBehaviour.parking.Parking;
import designPatterns.strategyPattern.encapsulatedBehaviour.talking.Talking;

public class Creature {

    private float weight;
    private float speed;

    private Talking talkingBehaviour;
    private Parking parkingBehaviour;

    public Creature(){

    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Talking getTalkingBehaviour() {
        return talkingBehaviour;
    }

    public void setTalkingBehaviour(Talking talkingBehaviour) {
        this.talkingBehaviour = talkingBehaviour;
    }

    public Parking getParkingBehaviour() {
        return parkingBehaviour;
    }

    public void setParkingBehaviour(Parking parkingBehaviour) {
        this.parkingBehaviour = parkingBehaviour;
    }

    public void move(){
        System.out.println("the creature is moving");
    }

    public void eat(){
        System.out.println("the creature is eating");
    }

    public void performTalkingBehaviour(){
        talkingBehaviour.talk();
    }

    public void performParkingBehaviour(){
        parkingBehaviour.park();
    }
}
