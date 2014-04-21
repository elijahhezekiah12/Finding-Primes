public class DivisiblityAlgorithm {

	public static void main(String[] args) {
		System.out.println(isPrime(353));
	}

	public static boolean isPrime(int n) {
		// Input: Integer n
		// Output: true, it n is prime; false otherwise.
		if (n == 2) {
			return true;
		} else {
			if (n % 2 == 0) {
				return false;
			} else {
				for (int i = 1; i <= (Math.sqrt(n)/ 2); i++) {
					if (n % ((2 * i) + 1) == 0) {
						return false;
					} else {
						return true;
					}
				}
				
			}
		}
		return false;

	}

}
