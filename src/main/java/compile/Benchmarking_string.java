package compile;

public class Benchmarking_string 
{
    public static void main( String[] args )
    {
    	System.out.println("\n Benchmarking String:");
        String3.main(args);
        System.out.println("\n Benchmarking StringBuffer:");
        StringBuffer3.main(args);
        System.out.println("\n Benchmarking StringBuilder:");
        StringBuilder3.main(args);
       
    }
}