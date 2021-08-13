/* 
@Author Naval 
 */
public class HelloGoodbye {

    public static void main(String[] args) {
    	 
    	if(args.length>=2)
    	{
    		String param1=args[0];
		    String param2=args[1];    	
		    System.out.println("Hello "+param1+" and "+param2);
		    System.out.println("Goodbye "+param1+" and "+param2);
		} 
		else 
		{
			System.out.println("Hello pass at least two name please.");
    	}
    	
    }

}