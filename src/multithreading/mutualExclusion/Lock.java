package multithreading.mutualExclusion;

public interface Lock {

    void requestCriticalSection(int pid);
    void releaseCriticalSection(int pid);
}
