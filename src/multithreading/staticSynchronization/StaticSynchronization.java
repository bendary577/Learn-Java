package multithreading.staticSynchronization;

public class StaticSynchronization {

    public StaticSynchronization(){}

    //the monitor in this case is : StaticSynchronization.class (behaviour is synchronized across all objects of this class)
    public static synchronized void a(){
        System.out.println("StaticSynchronization.a");
    }

}