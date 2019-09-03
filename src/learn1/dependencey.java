package learn1;

interface d {

		
		void understand(); 
	} 
	class Topic1 implements d { 
	public void understand() 
	    { 
	        System.out.println("Got it"); 
	    } 
	} 
	class Topic2 implements d{ 
	

	@Override
	public void understand() {
		// TODO Auto-generated method stub
		 System.out.println("understand"); 
	}

	
	} 
	public class dependencey { 
	public static void main(String[] args) 
	    { 
	        Topic1 t = new Topic1(); 
	        Topic2 t1 = new Topic2();
	        t1.understand(); 
	    } 
	}
	


