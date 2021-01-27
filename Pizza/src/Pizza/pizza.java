package Pizza;
import java.util.Scanner;
public class pizza {
private String size;
private int cheeseTopping;
private int pepperoniTopping;
private int mushroomTopping;


// Constructors
//-------------
public pizza(String size)
{
	size = "";
}

public pizza( String sz, int cheese, int pepperoni, int mushroom)
{
	size = sz.toUpperCase();
	cheeseTopping = cheese;
	pepperoniTopping = pepperoni;
	mushroomTopping = mushroom;		
}

// Accessor methods
//-----------------
public String getSize()
{ 
	return size;
}

public int getCheeseTopping()
{
return cheeseTopping;
}

public int getPepperoniTopping()
{
	return pepperoniTopping;
}

public int getMushroomTopping()
{
	return mushroomTopping;
}

//Mutator methods
//---------------
public void setSize(String sz)
{
	size = sz.toUpperCase();
}

public void setCheeseTopping(int cheese)
{
	cheeseTopping = cheese;
}

public void setPepperoniTopping(int pepperoni)
{
	pepperoniTopping = pepperoni;
}

public void setMushroomTopping(int mushroom)
{
	mushroomTopping = mushroom;
}

// Other methods
public int calcCost()
{
	int cost = 0;
	if(size.equals("SMALL"))
		cost = 10;
	else if (size.equals("MEDIUM"))
		cost = 12;
	else if (size.equals("LARGE"))
		cost = 14;
	return cost + (cheeseTopping + pepperoniTopping + mushroomTopping) * 2;	
}

public boolean equals(pizza pizza2)
{
	return size.equals(pizza2.size) && cheeseTopping == pizza2.cheeseTopping
	&& pepperoniTopping == pizza2.pepperoniTopping 
	&& mushroomTopping == pizza2.mushroomTopping;
}

public String toString()
{
	return "A " + size + " pizza with "+ cheeseTopping + " cheese topping(s), " +
	       pepperoniTopping + " pepperoni topping(s) and " + mushroomTopping +
	       " mushroom topping(s) cost $" + calcCost();
}
public static void main(String []args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("Welcome to the Pizza Store !!! ");
	
	System.out.println("Please place order for 1st pizza in the following order .");
	System.out.println("Size : SMALL , LARGER , MEDIUM : ");
	String size1 = s.next();
	pizza obj1 = new pizza(size1);
	System.out.println("Indicate the number of each of the following toppings .  ");
	System.out.println(" Cheese , Pepperoni and Mushroom ");
	int cheese1 = s.nextInt();
	int pepperoni1 = s.nextInt();
	int mushroom1 = s.nextInt();
	pizza obj2 = new pizza(size1,cheese1,pepperoni1,mushroom1);
	
	System.out.println("Please place order for 2nd pizza in the following order .");
	System.out.println("Size : SMALL , LARGER , MEDIUM : ");
	String size2 = s.next();
	pizza obj3 = new pizza(size2);
	System.out.println("Indicate the number of each of the following toppings .  ");
	System.out.println(" Cheese , Pepperoni and Mushroom ");
	int cheese2 = s.nextInt();
	int pepperoni2 = s.nextInt();
	int mushroom2 = s.nextInt();
	pizza obj4 = new pizza(size2,cheese2,pepperoni2,mushroom2);
	
	System.out.println("Please place order for 3rd pizza in the following order .");
	System.out.println("Size : SMALL , LARGER , MEDIUM : ");
	String size3 = s.next();
	pizza obj5 = new pizza(size2);
	System.out.println("Indicate the number of each of the following toppings .  ");
	System.out.println(" Cheese , Pepperoni and Mushroom ");
	int cheese3 = s.nextInt();
	int pepperoni3 = s.nextInt();
	int mushroom3 = s.nextInt();
	pizza obj6 = new pizza(size3,cheese3,pepperoni3,mushroom3);
	
	System.out.println("Here are the three pizzas ");
	pizza obj7 = new pizza(size1,cheese1,pepperoni1,mushroom1);
	System.out.println(obj7.toString());
	pizza obj8 = new pizza(size2,cheese2,pepperoni2,mushroom2);
	System.out.println(obj8.toString());
	pizza obj9 = new pizza(size3,cheese3,pepperoni3,mushroom3);
	System.out.println(obj9.toString());
		
	System.out.println("Result of comparisons ");
	if(obj2.equals(obj4) && obj4.equals(obj6) && obj2.equals(obj6))
	{
		System.out.println("Yes all three Pizzas are same. ");
	}
	else if(obj2.equals(obj4))
	{
		System.out.println("Yes Pizza 1st and 2nd are same. ");
	}
	else if(obj4.equals(obj6))
	{
		System.out.println("Yes Pizza 2nd and 3rd are same. ");
	}
	else if(obj2.equals(obj6))
	{
		System.out.println("Yes Pizza 1st and 3rd are same. ");
	}
	else
	{
		System.out.println("No Pizza are same. ");
	} 
	System.out.println("Modify 1st pizza in the following order .");
	System.out.println("Size : SMALL , LARGER , MEDIUM : ");
	String size4 = s.next();
	pizza obj11 = new pizza(size1);
	System.out.println("Indicate the number of each of the following toppings .  ");
	System.out.println(" Cheese , Pepperoni and Mushroom ");
	int cheese4 = s.nextInt();
	int pepperoni4 = s.nextInt();
	int mushroom4 = s.nextInt();
	pizza obj12 = new pizza(size4,cheese4,pepperoni4,mushroom4);
	
	System.out.println("Here are the three pizzas after modifying 1st pizza");
	System.out.println("Result of comparisons ");		
	if(obj12.equals(obj4))
	{
		System.out.println("Yes Pizza 1st and 2nd are same. ");
	}
	else if(obj4.equals(obj6))
	{
		System.out.println("Yes Pizza 2nd and 3rd are same. ");
	}
	else if(obj12.equals(obj6))
	{
		System.out.println("Yes Pizza 1st and 3rd are same. ");
	}
	else if(obj12.equals(obj4) && obj4.equals(obj6) && obj12.equals(obj6))
	{
		System.out.println("Yes all three Pizzas are same. ");
	}
	else
	{
		System.out.println("No Pizza are same. ");
	}
	System.out.println(obj12.toString());
	System.out.println(obj8.toString());
	System.out.println(obj9.toString());
	
	System.out.println("Enjoy the pizza's and have a great  day!!!");
}

}