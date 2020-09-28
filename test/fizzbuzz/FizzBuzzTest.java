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

		@Test
		public void 引数に22を与えたら22を返す() {
			assertEquals("22", fizzbuzz.response(22));
		}

		@Test
		public void 引数に508を与えたら508を返す() {
			assertEquals("508", fizzbuzz.response(508));
		}

		@Test
		public void 引数に8888を与えたら8888を返す() {
			assertEquals("8888", fizzbuzz.response(8888));
		}

		@Test
		public void 引数に70001を与えたら70001を返す() {
			assertEquals("70001", fizzbuzz.response(70001));
		}
	}

	public static class 引数が3のみの倍数 {
		FizzBuzz fizzbuzz = new FizzBuzz();

		@Test
		public void 引数3を与えたらFizzを返す() {
			assertEquals("Fizz", fizzbuzz.response(3));
		}

		@Test
		public void 引数33を与えたらFizzを返す() {
			assertEquals("Fizz", fizzbuzz.response(33));
		}

		@Test
		public void 引数999を与えたらFizzを返す() {
			assertEquals("Fizz", fizzbuzz.response(999));
		}

		@Test
		public void 引数6666を与えたらFizzを返す() {
			assertEquals("Fizz", fizzbuzz.response(6666));
		}

		@Test
		public void 引数99999を与えたらFizzを返す() {
			assertEquals("Fizz", fizzbuzz.response(99999));
		}
	}

	public static class 引数が5のみの倍数 {
		FizzBuzz fizzbuzz = new FizzBuzz();

		@Test
		public void 引数5を与えたらBuzzを返す() {
			assertEquals("Buzz", fizzbuzz.response(5));
		}

		@Test
		public void 引数20を与えたらBuzzを返す() {
			assertEquals("Buzz", fizzbuzz.response(20));
		}

		@Test
		public void 引数500を与えたらBuzzを返す() {
			assertEquals("Buzz", fizzbuzz.response(500));
		}

		@Test
		public void 引数5555を与えたらBuzzを返す() {
			assertEquals("Buzz", fizzbuzz.response(5555));
		}

		@Test
		public void 引数70000を与えたらBuzzを返す() {
			assertEquals("Buzz", fizzbuzz.response(70000));
		}

	}

	public static class 引数が3と5の倍数 {
		FizzBuzz fizzbuzz = new FizzBuzz();

		@Test
		public void 引数15を与えたらFizzBuzzを返す() {
			assertEquals("FizzBuzz", fizzbuzz.response(15));
		}

		@Test
		public void 引数60を与えたらFizzBuzzを返す() {
			assertEquals("FizzBuzz", fizzbuzz.response(60));
		}

		@Test
		public void 引数150を与えたらFizzBuzzを返す() {
			assertEquals("FizzBuzz", fizzbuzz.response(150));
		}

		@Test
		public void 引数9000を与えたらFizzBuzzを返す() {
			assertEquals("FizzBuzz", fizzbuzz.response(9000));
		}

		@Test
		public void 引数60000を与えたらFizzBuzzを返す() {
			assertEquals("FizzBuzz", fizzbuzz.response(60000));
		}
	}

	public static class 引数が無効境界値 {
		FizzBuzz fizzbuzz = new FizzBuzz();

		@Test(expected = IllegalArgumentException.class)
		public void 引数0を与えたらエラーとなる() {
			fizzbuzz.response(0);
		}
	}
}