package multithreading.mutualExclusion;

public class MutualExclusionThread extends Thread {
    int pid;
    Lock lock;

    public MutualExclusionThread(int pid, Lock lock){
        this.pid = pid;
        this.lock = lock;
    }

    public void criticalSection() throws InterruptedException {
        System.out.println(pid + " is in critical section");
        Thread.sleep(1000); //do some stuff
    }

    public void nonCriticalSection() throws InterruptedException {
        System.out.println(pid + " is in non critical section");
        Thread.sleep(1000);
    }

    @Override
    public void run(){
        while(true){
            try {
                lock.requestCriticalSection(this.pid); //acquire lock and go next
                criticalSection();
                lock.releaseCriticalSection(this.pid);
                nonCriticalSection();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
