package learn1;

public class duplicates {

	public static void main(String[] args) {
		 int arr[] = {4, 4, 4, 5, 2, 3, 1};
		 dup(arr);

	}
	public static void dup(int arr[]) {
		
	  
	    { 
	    	int c=0;
	    	int a = arr.length;
	        int i, j; 
	        int rep =arr[0]; 
	        System.out.println("Repeated Elements are :"); 
	        for (i = 0; i < a; i++)  
	        { 
	            for (j = i + 1; j < a; j++)  
	            { 
	                if (arr[i] == arr[j])  
	                     rep = arr[i];
	               c++;
	            } 
	        } 
	        System.out.println(rep+"  repeated  "+c);
	      
	    } 
	  
	}

}
