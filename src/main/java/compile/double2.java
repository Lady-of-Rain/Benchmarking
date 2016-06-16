package compile;

public class double2 
{
    public static void main( String[] args )
    {
       final long start = System.currentTimeMillis();
       
       
       double sum = 0;
       int max = 1_000_000_000;
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum++;
       }
        
       
       final long finish = System.currentTimeMillis();
       long result_double=finish-start;
       
       System.out.println("Using double: " + sum + "Elapsed milliseconds: " + result_double);

       
       
       
       
       
       
       
       
       final long start_Double = System.currentTimeMillis();
       
       
       Double sum_Double = 0.0d;
  
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum_Double++;
       }
        
       
       final long finish_Double = System.currentTimeMillis();
       long result_Double=finish_Double - start_Double;
       
       System.out.println("Using Double: " + sum + "Elapsed milliseconds: " + result_Double);
 
       System.out.println("Difference between: " + (result_Double - result_double));
       
       
       
    }
}
