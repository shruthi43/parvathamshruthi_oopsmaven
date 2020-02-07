package maven.oops;

public class Chocolate extends Sweet {
    String type;

    public Chocolate(String name, int price, int weight, String type) {
        super(name, price, weight);
        this.type = type;
    }
    public void dis()
    {
    	System.out.println("chocolate");
    }
}
