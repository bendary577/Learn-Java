package multithreading.synchronization;

import multithreading.MultiThreadingMain;

public class ConsumerThread extends Thread{

    public ConsumerThread(String name){
        super(name);
    }

    @Override
    public void run() {
        try{
            while(true){
                synchronized (MultiThreadingMain.bucket){
                    if(!MultiThreadingMain.bucket.isEmpty()){
                        int n = MultiThreadingMain.bucket.get(0);
                        MultiThreadingMain.bucket.remove(0);    //remove first element
                        MultiThreadingMain.bucket.notifyAll();       //notify all waiting threads to be Runnable (so the JVM can choose one of them to start running)
                        System.out.println(Thread.currentThread().getName()
                                + " took out the value " + n + " from the bucket");
                    }else{
                        MultiThreadingMain.bucket.wait();           //order the current thread accessing the resource to wait
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}