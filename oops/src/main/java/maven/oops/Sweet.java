package maven.oops;
//import java.util.Collections;
public class Sweet extends Gift {
	  private String name;
	  private Integer price;
	  int weight;
	  Sweet(String sweetName, Integer weightOfSweet, Integer cost) {
	        this.name = sweetName;
	        this.weight = weightOfSweet;
	        this.price = cost;
	    }
	  public Sweet(String name,int price,int weight){
	        this.name = name;
	        this.price = price;
	        this.weight = weight;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Integer getPrice() {
	        return price;
	    }

	    public void setPrice(Integer price) {
	        this.price = price;
	    }

	    public int getWeight() {
	        return weight;
	    }

	    public void setWeight(int weight) {
	        this.weight = weight;
	    }
       public void dis()
       {
       System.out.println("sweet");
       }
}
