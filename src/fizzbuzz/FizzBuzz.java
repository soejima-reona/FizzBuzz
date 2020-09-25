package fizzbuzz;

public class FizzBuzz {

	public String response(int num) {
		StringBuilder result = new StringBuilder();

		if (num < 1) {
			throw new IndexOutOfBoundsException();
		}

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("FizzBuzz");
			result.append("FizzBuzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
			result.append("Fizz");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
			result.append("Buzz");
		} else {
			System.out.println(num);
		}

		if (result.length() == 0) {
			result.append(String.valueOf(num));
		}

		return result.toString();
	}
}
