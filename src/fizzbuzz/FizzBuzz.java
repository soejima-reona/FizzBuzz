package fizzbuzz;

public class FizzBuzz {

	public String response(int num) {

		StringBuilder result = new StringBuilder();

		//不正な引数をメソッドに渡した場合のエラー
		if (num < 1) {
			throw new IllegalArgumentException();
		}

		//FizzBuzzの条件
		//3と5の倍数ならFizzBuzzと連結して出力
		if (num % 3 == 0) {
			result.append("Fizz");
		}

		if (num % 5 == 0) {
			result.append("Buzz");
		}

		//3と5の倍数でない場合
		if (result.length() == 0) {
			result.append(String.valueOf(num));
		}
		return result.toString();
	}

}
