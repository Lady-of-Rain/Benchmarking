package compile;

public class float2 
{
    public static void main( String[] args )
    {
       final long start = System.currentTimeMillis();
       
       
       float sum = 0.0F;
       int max = 1_000_000_000;
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum++;
       }
        
       
       final long finish = System.currentTimeMillis();
       long result_float=finish-start;
       
       System.out.println("Using float: " + sum + "Elapsed milliseconds: " + result_float);

       
       
       
       
       
       
       
       
       final long start_Float = System.currentTimeMillis();
       
       
       Float sum_Float = 0.0F;
  
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum_Float++;
       }
        
       
       final long finish_Float = System.currentTimeMillis();
       long result_Float=finish_Float - start_Float;
       
       System.out.println("Using Float: " + sum + "Elapsed milliseconds: " + result_Float);
 
       System.out.println("Difference between: " + (result_Float - result_float));
       
       
       
    }
}
