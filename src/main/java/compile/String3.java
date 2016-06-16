package compile;

public class String3 {
	public static void main(String[] args) {
		final long start = System.currentTimeMillis();

		String string = "a";
		int max = 1_000_000;

		for (int i = 0; i < max; i = i + 1) {
			string = string.concat("b");
		}

		final long finish = System.currentTimeMillis();
		long result = finish - start;

		System.out.println("Using String, elapsed milliseconds: " + result);

	}
}