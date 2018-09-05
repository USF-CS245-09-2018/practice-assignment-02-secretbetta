
public class FibonacciIterative implements Fibonacci {
	public int fibonacci(int n) {
		int total = 0;
		int curr = 1;
		int prev = 0;
		
		if (n == 0 || n == 1)
			return n;
		
		for (int i = 1; i < n; i++) {
			total = curr + prev;
			prev = curr;
			curr = total;
		}
		
		return total;
	}
}
