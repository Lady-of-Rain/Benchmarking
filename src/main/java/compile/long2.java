package compile;

public class long2 
{
    public static void main( String[] args )
    {
       final long start = System.currentTimeMillis();
       
       
       long sum = 0;
       int max = 1_000_000_000;
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum++;
       }
        
       
       final long finish = System.currentTimeMillis();
       long result_long= finish - start;
       
       System.out.println("Using long: " + sum + "Elapsed milliseconds: " + result_long);

       
       
       
       
       
       
       
       
       final long start_Long = System.currentTimeMillis();
       
       
       Integer sum_Long = 0;
  
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum_Long++;
       }
        
       
       final long finish_Long = System.currentTimeMillis();
       long result_Long=finish_Long - start_Long;
       
       System.out.println("Using Long: " + sum + "Elapsed milliseconds: " + result_Long);
 
       System.out.println("Difference between: " + (result_Long - result_long));
       
       
       
    }
}
