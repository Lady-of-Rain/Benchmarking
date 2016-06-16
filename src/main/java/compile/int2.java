package compile;

public class int2 
{
    public static void main( String[] args )
    {
       final long start = System.currentTimeMillis();
       
       
       int sum = 0;
       int max = 1_000_000_000;
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum=sum+1;
       }
        
       
       final long finish = System.currentTimeMillis();
       long result_int=finish-start;
       
       System.out.println("Using int: " + sum + "Elapsed milliseconds: " + result_int);

       
       
       
       
       
       
       
       
       final long start_Integer = System.currentTimeMillis();
       
       
       Integer sum_Integer = 0;
  
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum_Integer=sum_Integer+1;
       }
        
       
       final long finish_Integer = System.currentTimeMillis();
       long result_Integer=finish_Integer - start_Integer;
       
       System.out.println("Using Integer: " + sum + "Elapsed milliseconds: " + result_Integer);
 
       System.out.println("Difference between: " + (result_Integer - result_int));
       
       
       
    }
}
