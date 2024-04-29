package parallelProgramming.forkJoin;

import java.util.concurrent.RecursiveTask;

public class ARecursiveTask
        extends RecursiveTask<Integer>{ //part of Fork/Join framework : used when the task needs to return a result after computation

    private final int lowerBound;
    private final int higherBound;
    private final int[] array;

    public ARecursiveTask(int lowerBound, int higherBound, int[] array){
        this.lowerBound = lowerBound;
        this.higherBound = higherBound;
        this.array = array;
    }

    @Override
    protected Integer compute() {
        if(lowerBound > higherBound) return 0;
        else if(lowerBound == higherBound) return array[0];
        else{
            int mid = (lowerBound + higherBound) / 2;
            ARecursiveTask left = new ARecursiveTask(lowerBound, higherBound, array);
            ARecursiveTask right = new ARecursiveTask(mid, higherBound, array);
            //left and right tasks are performed in parallel
            right.fork(); //run in parallel
            return left.compute() + right.join(); //wait for the right part asynchronous task returned value
        }
    }
}
