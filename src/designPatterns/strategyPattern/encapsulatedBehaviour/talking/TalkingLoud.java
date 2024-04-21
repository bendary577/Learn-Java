package designPatterns.strategyPattern.encapsulatedBehaviour.talking;

public class TalkingLoud implements Talking {
    @Override
    public void talk() {
        System.out.println("i'm talking ....");
    }
}
