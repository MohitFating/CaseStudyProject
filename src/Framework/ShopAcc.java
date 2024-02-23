package Framework;

public abstract class ShopAcc {
	
	private int accNo;
	private String accNm;
	private float charges;
	
	public ShopAcc(int accNo, String accNm, float charges)
	{
		super();
		this.accNo = accNo;
		this.accNm =accNm;
		this.charges = charges;
	}
	public int getAccNo()
	{
		return accNo;
	}
	 
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	
	public String getAccNm()
	{
		return accNm;
	}
	public void setAccNm(String accNm)
	{
		this.accNm = accNm;
	}
	public float getcharges()
	{
		return charges;
	}
	public void setcharges(float charges)
	{
		this.charges = charges;
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Product booked and the charges are: "+charges);
	}
	public void item(float charges)
	{
		System.out.println("Item are delivered with charges: "+charges);
	}
	
	public String toString()
	{
		return "ShopAcc [accNo=" +accNo+", accNm=" +accNm+ ", charges="+charges+ ", getAccNo()="+getAccNo()+", getAccNm()="+getAccNm()+", getCharges()="+getcharges()+", getClass()="+ getClass()+", hashcode()="+hashCode()+", toString()="+super.toString()+"]";
	}

}
