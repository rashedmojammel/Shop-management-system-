package Classes;
public class Product
{
	private String prdname;
	private String prdid;
	private String price;
	
	public Product()
	{

	}
	public Product(String prdname,String prdid,String price)
	{
		this.prdname = prdname;
		this.prdid=prdid;
		this.price=price;
	}

	
	public String getProductName(){return prdname;}
	public String getProductHolderName(){return prdid;}
	public String getPrice(){return price;}
	
}