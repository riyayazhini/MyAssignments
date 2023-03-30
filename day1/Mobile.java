package week1.day1;

public class Mobile {
	    public String sendSms() {
	    	float weight = 125.456f;
	    	String model = "iphone14";
	    	
	    	System.out.println(model);
	    			
	    	System.out.println(weight);
		    System.out.println("I am sending SMS to my friend");
		    return model;
	    }

		public void makeCall() {
			boolean fullCharged= false ;
			int mobileCost = 800000;
			 System.out.println(fullCharged);
	         System.out.println("Calling my friend");
	         System.out.println(mobileCost);
		}  
	         

	    public static void main(String[] args) {
	    	
	    	//ClassName object = new ClassName();
	    	
	    	
	     	Mobile apple = new Mobile();
	    	
	    	String modelName = apple.sendSms();
	    	apple.makeCall();
	    	
	    	System.out.println("This is my phone"+ modelName);

	    	
		
	}

}
