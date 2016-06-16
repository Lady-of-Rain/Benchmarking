package compile;

public class StringBuffer3 
{
    public static void main( String[] args )
    {
    	final long start = System.currentTimeMillis();

		StringBuffer string = new StringBuffer ("a");
		int max = 1_000_000;

		for (int i = 0; i < max; i = i + 1) {
			string = string.append("b");
		}

		final long finish = System.currentTimeMillis();
		long result = finish - start;

		System.out.println("Using StringBuffer, elapsed milliseconds: " + result);
}
}