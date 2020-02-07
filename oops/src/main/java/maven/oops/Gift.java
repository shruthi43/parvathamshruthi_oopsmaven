package maven.oops;
import java.util.ArrayList;
import java.util.Collections;
public class Gift implements listing{
	 ArrayList<Sweet> gifts = new ArrayList<Sweet>();
	 public void add(Sweet sweet)
	 {
	        gifts.add(sweet);
	 }
	 public void Weight(){
	        int w = 0;
	        for(int i=0;i<gifts.size();i++){
	            w += gifts.get(i).getWeight();
	        }
	        System.out.print("the net weight is:");
	        System.out.println(w);
	    }

	    public void list() {
	     
	    	System.out.println("The list of sweets in the object are:");
	        for(int i=0;i<this.gifts.size();i++){
	            System.out.println(gifts.get(i).getName());
	        }
	    }
	    public void sort()
	    { int temp;
	    int a[]=new int[this.gifts.size()];
	    int k=0;
	    for (int i = 0; i < this.gifts.size(); i++)
	    	a[k++]=gifts.get(i).getWeight();
	    	System.out.println("Sorted sweets according to their costs:");
	    	for (int i = 0; i < this.gifts.size(); i++) {
	            for (int j = 1; j <(this.gifts.size()-i); j++) {
	                if (a[j-1] > a[j]) {
	                    temp = a[j-1];
	                    a[j-1] = a[j];
	                    a[j] = temp;
	                }

	            }  
	        }
	    	for (int i = 0; i < this.gifts.size(); i++)
	    	{
	    		for (int j = 0; j < this.gifts.size(); j++)
	    		  if(a[i]==gifts.get(j).getWeight())
	    			  System.out.println(gifts.get(j).getName());
	    	}
	    	sort1();
	   
	    }
	    public void sort1()
	    {
	    	//int temp;
	    	System.out.println("sorting using prices :");
	    	ArrayList<Integer> a = new ArrayList<Integer>();
		   // int k=0;
		    for (int i = 0; i < this.gifts.size(); i++)
		    	a.add(gifts.get(i).getWeight());
		    Collections.sort(a);
		    for (int i = 0; i < this.gifts.size(); i++)
	    	{
	    		for (int j = 0; j < this.gifts.size(); j++)
	    		  if(a.get(i)==gifts.get(j).getWeight())
	    			  System.out.println(gifts.get(j).getName());
	    	}
	    }
}





