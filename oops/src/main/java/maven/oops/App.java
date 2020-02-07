package maven.oops;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Sweet sone = new Chocolate("Cadbury",120,60,"milk_chocolate");
        Sweet stwo = new Candy("Melody",50,20,"soft_candy");
        Gift gifts = new Gift();
        gifts.add(sone);
        gifts.add(stwo);
        Scanner in = new Scanner(System.in);
        System.out.println("Select one of the options below :");
        System.out.println("1. calculate the net weight ");
        System.out.println("2. print the contents of the gift");
        System.out.println("3. sort the sweets based on cost and price");
        Integer ch = in.nextInt();
        if(ch==1)
        	gifts.Weight();
        else if(ch==2)
        	gifts.list();
        else
        	gifts.sort();
        in.close();
        System.out.println("checking the type of sweets in the gift :");
        System.out.print("the first sweet is a "); sone.dis();
        System.out.print("the first sweet is a "); stwo.dis();
    }
}
interface listing{
	void list();
}