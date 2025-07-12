package Classes;
import Interfaces.*;
import java.util.*;
import java.lang.*;

public class NecessaryProduct extends Product
{
	private String productNecessary;

	public void setProductNec(String productNecessary)
	{
		this.productNecessary =  productNecessary;
	}
	public String getProductNec()
	{
		return productNecessary;
	}

	public void showProductDetails()
	{
		System.out.println("Product ID: "+ productID);
		System.out.println("Product Name: "+productName);
		System.out.println("Price: "+ productPrice);
		System.out.println("Necessary Product Category:"+productNecessary+"\n");

	}


}