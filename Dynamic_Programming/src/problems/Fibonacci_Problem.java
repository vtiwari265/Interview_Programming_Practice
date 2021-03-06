package problems;

public class Fibonacci_Problem {
    
	static long fibonacciRecucrsion(int n) {
	    if (n <= 0) return 0;
	    if (n == 1) return 1;
	    return fibonacciRecucrsion(n-1) + fibonacciRecucrsion(n-2);
	}
	
	static long[] memo;
	static long fibonacciMemoization(int n) {
	    if (n <= 0) return 0;
	    if (memo[n - 1] != 0) return memo[n - 1];
	    
	    memo[n - 1] = fibonacciMemoization(n-1) + fibonacciMemoization(n-2);
	    return memo[n - 1];
	}
	
	static long fibonacciDP(int n) {
	    long[] memoDP = new long[n];
	    memoDP[0] = 1;
	    memoDP[1] = 1;
	    
	    for (int i = 2; i < n; i++) {
	        memoDP[i] = memoDP[i-1] + memoDP[i-2];
	    }
	    
	    return memoDP[n - 1];
	}
}