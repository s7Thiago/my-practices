package objects;																						

public class Product {
	
	private String name;
	private String description;
	private int code;
	private float value;
	private String vality;
	private String vendor;
	private int quantity;
	private boolean avaliable;

	public Product(String name, String description, 
	int code, float value, String vality, String vendor, 
	int quantity, boolean avaliable){
		this.name = name;
		this.description = description;
		this.code = code;
		this.value = value;
		this.vality = vality;
		this.vendor = vendor;
		this.quantity = quantity;
		this.avaliable = avaliable;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDescription()
	{
		return description;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public int getCode()
	{
		return code;
	}

	public void setValue(float value)
	{
		this.value = value;
	}

	public float getValue()
	{
		return value;
	}

	public void setVality(String vality)
	{
		this.vality = vality;
	}

	public String getVality()
	{
		return vality;
	}

	public void setVendor(String vendor)
	{
		this.vendor = vendor;
	}

	public String getVendor()
	{
		return vendor;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setAvaliable(boolean avaliable)
	{
		this.avaliable = avaliable;
	}

	public boolean isAvaliable()
	{
		return avaliable;
	}
}
