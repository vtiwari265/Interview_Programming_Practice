package prime;

public class Check_Prime {
	static boolean checkPrime(int number) {
        boolean status = true;
        if (number <= 1) status = false;
        for (int i = 2; i < number - 1; i++) {
            if (number%i == 0) status = false;
        }
        return status;
    }
}