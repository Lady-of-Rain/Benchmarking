package compile;

public class StringBuilder3 
{
    public static void main( String[] args )
    {
    	final long start = System.currentTimeMillis();

		StringBuilder string = new StringBuilder ("a");
		int max = 1_000_000;

		for (int i = 0; i < max; i = i + 1) {
			string = string.append("b");
		}

		final long finish = System.currentTimeMillis();
		long result = finish - start;

		System.out.println("Using StringBuilder, elapsed milliseconds: " + result);
    }
}