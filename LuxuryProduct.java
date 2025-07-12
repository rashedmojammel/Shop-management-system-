package Classes;
import Interfaces.*;
import java.util.*;
import java.lang.*;

public class LuxuryProduct extends Product
{
	private String productLuxury;

	public void setProductLux(String productLuxury)
	{
		this.productLuxury =  productLuxury;
	}
	public String getProductLux()
	{
		return productLuxury;
	}

	public void showProductDetails()
	{
		System.out.println("Product ID: "+ productID);
		System.out.println("Product Name: "+productName);
		System.out.println("Price: "+ productPrice);
		System.out.println("Luxury Product Category:"+productLuxury+"\n");

	}


}