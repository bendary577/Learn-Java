package strategyPattern.encapsulatedBehaviour.talking;

public class Shouting implements Talking {
    @Override
    public void talk() {
        System.out.println("i'm shouting ...");
    }
}
