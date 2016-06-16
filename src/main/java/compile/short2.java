package compile;

public class short2 
{
    public static void main( String[] args )
    {
       final long start = System.currentTimeMillis();
       
       
       short sum = 0;
       int max = 1_000_000_000;
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum++;
       }
        
       
       final long finish = System.currentTimeMillis();
       long result_short=finish-start;
       
       System.out.println("Using int: " + sum + "Elapsed milliseconds: " + result_short);

       
       
       
       
       
       
       
       
       final long start_Short = System.currentTimeMillis();
       
       
       Short sum_Short = 0;
  
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum_Short++;
       }
        
       
       final long finish_Short = System.currentTimeMillis();
       long result_Short=finish_Short - start_Short;
       
       System.out.println("Using Short: " + sum + "Elapsed milliseconds: " + result_Short);
       
       
       
 
       System.out.println("Difference between: " + (result_Short - result_short));
       
       
       
    }
}
