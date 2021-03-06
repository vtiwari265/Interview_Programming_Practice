package problems;
import java.util.*;

public class Super_Ugly_Number_Problem {
	
	static int superUglyDP(int[] primes, int n) {
		HashSet<Integer> prime = new HashSet<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < primes.length; i++) prime.add(primes[i]);
		
		int counter = 1;
		Integer[] temp;
		boolean allPrime = true;
		while (result.size() < n) {
			allPrime = true;
			temp = findPrimeFactors(counter);
			for (int i = 0; i < temp.length; i++) {
				if (!prime.contains(temp[i])) {
					allPrime = false;
				}
			}
			if (allPrime) result.add(counter);
			counter++;
		}
		return result.get(result.size() - 1);
	}
	
	static Integer[] findPrimeFactors(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (n%i == 0 && checkPrime(i)) factors.add(i);
		}
		Integer[] result = new Integer[factors.size()];
		factors.toArray(result);
		return result;
	}
	
	static boolean checkPrime(int number) {
        boolean status = true;
        if (number <= 1) status = false;
        for (int i = 2; i < number - 1; i++) {
            if (number%i == 0) status = false;
        }
        return status;
    }
}
