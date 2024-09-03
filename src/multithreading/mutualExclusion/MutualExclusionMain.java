package multithreading.mutualExclusion;

/***
 * 1 - if process : pi, is accessing a shared resource "critical section"
 *      only this process can access it, no other process [pj .... pn] can access it
 *
 * 2 - there must be a bounded waiting, a limit on the number of times a process can
 *      access a critical section
 */
public class MutualExclusionMain {


    public static void main(String[] args) {
        int numberOfThreads = 2;

        MutualExclusionThread[] mutualExclusionThread = new MutualExclusionThread[numberOfThreads];
        Lock lock = new PetersonAlgorithm();
        for(int i=0; i<numberOfThreads; i++){
            mutualExclusionThread[i] = new MutualExclusionThread(i, lock);
            mutualExclusionThread[i].start();
        }

    }
}
