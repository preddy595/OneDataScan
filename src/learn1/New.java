package learn1;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int size;
	    System.out.println("Enter the number of size of array");
	    size = sc.nextInt();
	   
	   int[] ar = new int[size];
	    System.out.println("Enter the array element");
	    
	   
	    for(int i=0;i<size;i++) {
	        ar[i] = sc.nextInt();
	        
	    }
		//int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 ,99, 25, 15, 30, 35, 70}; 
         
 
		int c = 0, t=0,y = 0;
        for (int i = 0; i <ar.length; i++) { 
        	
            if(ar[i]%3==0 ) {
            	
            	
            	System.out.println("CMOS");
            	c++;
            	
            }
           
            else if(ar[i]%5==0 ) {
            	System.out.println("SYSTEM");
            	t++;
            	
             }
            	else if(ar[i]%15==0) {
            		System.out.println("CMOS_SYSTEM");
            	y++;
            }
            else {
            	System.out.println(ar[i]+"Not By 3 or 5 or 15 ");
        } 
       
        }
        System.out.println(c+"(times)=CMOS   "+ t+"(times)=SYSTEM  "+ y+"(times)=CMOS_SYSTEM ");
    	
	}
	}
