package parallelProgramming.memoization;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/*
* memoisation is an optimization technique used primarily to speed up computer programs
* by storing the results of expensive function calls to pure functions and returning
* the cached result when the same inputs occur again
* */
public class Amemoization {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    public Amemoization() {
        Function<Integer, Integer> fibonacci = Amemoization::memoizedFibonacci;
        System.out.println(fibonacci.apply(10)); // Call the function
    }

    public static int memoizedFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (!cache.containsKey(n)) {
            cache.put(n, memoizedFibonacci(n - 1) + memoizedFibonacci(n - 2));
        }
        return cache.get(n);
    }
}
