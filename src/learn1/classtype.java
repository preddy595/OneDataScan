package learn1;

import java.sql.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class classtype {

	
	String str1 = "Java";
	String str2 = "UNIX";
	
	Thread trd1 = new Thread("My Thread 1"){
		public void run(){
			while(true){
				synchronized(str1){
					synchronized(str2){
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};
	
	Thread trd2 = new Thread("My Thread 2"){
		public void run(){
			while(true){
				synchronized(str2){
					synchronized(str1){
						System.out.println(str2 + str1);
					}
				}
			}
		}
	};
	
	public static void main(String a[]){
		classtype mdl = new classtype();
		mdl.trd1.start();
		mdl.trd2.start();     

	}

}
