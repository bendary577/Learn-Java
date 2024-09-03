package parallelProgramming.parallelLoops;

import java.util.LinkedList;
import java.util.stream.IntStream;

public class AParallelLoops {

    private static class Salary {
        int value;

        Salary(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
    private final LinkedList<Salary> salaries;

    public AParallelLoops(){
        salaries = new LinkedList<>();
        Salary s1 = new Salary(1500);
        Salary s2 = new Salary( 2000);
        salaries.add(s1);
        salaries.add(s2);
    }

    private int[] loopOnSalaries(){
        return IntStream
                .rangeClosed(0, this.salaries.size()-1)
                .parallel()
                .toArray();
    }
}
