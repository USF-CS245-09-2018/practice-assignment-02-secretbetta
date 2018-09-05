
public class FactorialRecursive implements Factorial {
	public int factorial(int n) {
		int total = 1;
		
		if (n == 0)
			return total;
		
		return factorial(n - 1) * n;
	}
}
