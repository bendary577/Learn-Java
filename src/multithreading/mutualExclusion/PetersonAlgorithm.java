package multithreading.mutualExclusion;

public class PetersonAlgorithm implements Lock{

    Boolean[] wantCriticalSection = new Boolean[]{false, false};
    int turn = 1;

    @Override
    public void requestCriticalSection(int pid) {
        int j;
        do{
            j = 1 - pid;
            wantCriticalSection[pid] = true;
            turn = j;
        }while(wantCriticalSection[j] && turn == j); //wait while the condition is true, break if false
    }

    @Override
    public void releaseCriticalSection(int pid) {
        turn = 1-pid;
    }
}
