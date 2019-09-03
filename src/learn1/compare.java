package learn1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

 public class compare implements Comparable<compare> {
int id;
String name;
int age;

	public compare(int id,String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		// TODO Auto-generated constructor stub
	}
	
	public int compareTo(compare abj) {
		// TODO Auto-generated method stub
		if(id==abj.id) {
		return 0;
		}
		else if (id>abj.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
	



 }
	
  class compares {
		
		public static void main(String[] args) {
			
		        ArrayList<compare> ad = new ArrayList<compare>();
				ad.add(new compare(1,"a", 21));
				ad.add(new compare(2,"z", 24));
				ad.add(new compare(0,"f", 23));
				 //Collection.sort(ad);
				 
				Collections.sort(ad);
				for(compare v: ad) {
					System.out.println(v.age+"  "+v.id+" as in"
							+ "         "+v.name);
					
				}
			
		}
  }

		



