package maven.oops;

public class Candy extends Sweet {
    String brand;

    public Candy(String name, int price, int weight, String brand) {
        super(name, price, weight);
        this.brand = brand;
    }
   
public void dis()
{
	System.out.println("candy");
}
}
