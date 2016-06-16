package compile;

public class byte2 
{
    public static void main( String[] args )
    {
       final long start = System.currentTimeMillis();
       
       
       byte sum = 0;
       int max = 1_000_000_000;
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum++;
       }
        
       
       final long finish = System.currentTimeMillis();
       long result_byte=finish-start;
       
       System.out.println("Using byte: " + sum + "Elapsed milliseconds: " + result_byte);

       
       
       
       
       
       
       
       
       final long start_Byte = System.currentTimeMillis();
       
       
       Integer sum_Byte = 0;
  
       
       for (int i = 0; i < max; i=i+1)
       {
    	   sum_Byte++;
       }
        
       
       final long finish_Byte = System.currentTimeMillis();
       long result_Byte = finish_Byte - start_Byte;
       
       System.out.println("Using Byte: " + sum + "Elapsed milliseconds: " + result_Byte);
 
       System.out.println("Difference between: " + (result_Byte - result_byte));
       
       
       
    }
}
