/* 
@Author Naval 
 */
public class HelloGoodbye {

    public static void main(String[] args) {
    	int noOfparam=args.length;
    	switch(noOfparam){
    	    case 0:
    			System.out.println("Hello can you pass your name please!");
    			break;
    		case 1:
    			String param1=args[0];
    			System.out.println("Hello "+param1);
    			System.out.println("Goodbye "+param1);
    			break;
    	    default:
    	        if(noOfparam>=2){
    		        param1=args[0];
				    String param2=args[1];
        		    System.out.println("Hello "+param1+" and "+param2);
        		    System.out.println("Goodbye "+param1+" and "+param2);
    		    } else {
    		        System.out.println("Hello -ve value Exception case fault in system");
    		    }
    	}
    	
    }

}