
public class FactorialIterative implements Factorial {
	public int factorial(int n) {
		int total = 1;
		
		if (n == 0)
			return total;
		
		for (int i = n; i > 0; i--) {
			total = total * i;
		}
		
		return total;
	}
}
