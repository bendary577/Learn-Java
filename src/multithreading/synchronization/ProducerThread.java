package multithreading.synchronization;

import multithreading.MultiThreadingMain;
import java.util.Random;

public class ProducerThread extends Thread{

    public ProducerThread(String name){
        super(name);
    }

    @Override
    public void run() {
        try{
            Random r = new Random();
            while(true){
                synchronized (MultiThreadingMain.bucket){
                    if(MultiThreadingMain.bucket.size() < 100){
                        int n = r.nextInt(1000);
                        MultiThreadingMain.bucket.add(n);
                        MultiThreadingMain.bucket.notifyAll();
                        System.out.println(Thread.currentThread().getName()
                                + " added value " + n + " to the bucket");
                    }else{
                        MultiThreadingMain.bucket.wait();
                    }
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
