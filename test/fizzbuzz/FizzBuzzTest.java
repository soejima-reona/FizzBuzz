package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
* @author 副島
*
*/

@RunWith(Enclosed.class)
public class FizzBuzzTest {

	public static class 引数が3と5の倍数でない {
		FizzBuzz fizzbuzz = new FizzBuzz();

		@Test
		public void 引数に1を与えたら1を返す() {
			assertEquals("1", fizzbuzz.response(1));
		}
	}

	public static class 引数が3のみの倍数 {
		FizzBuzz fizzbuzz = new FizzBuzz();

		@Test
		public void 引数3を与えたらFizzを返す() {
			assertEquals("Fizz", fizzbuzz.response(3));
		}
	}

	public static class 引数が5のみの倍数 {
		FizzBuzz fizzbuzz = new FizzBuzz();

		@Test
		public void 引数5を与えたらBuzzを返す() {
			assertEquals("Buzz", fizzbuzz.response(5));
		}
	}

	public static class 引数が3と5の倍数 {
		FizzBuzz fizzbuzz = new FizzBuzz();

		@Test
		public void 引数15を与えたらFizzBuzzを返す() {
			assertEquals("FizzBuzz", fizzbuzz.response(15));
		}
	}

	public static class 引数が無効境界値 {
		FizzBuzz fizzbuzz = new FizzBuzz();

		@Test(expected = IndexOutOfBoundsException.class)
		public void 引数0を与えたらエラーとなる() {
			fizzbuzz.response(0);
		}
	}
}