package Framework;

public abstract class PrimeAcc extends ShopAcc 
{
private boolean isPrime;
private static final float deliveryCharge=0;

public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
{
	super(accNo, accNm, charges);
	this.isPrime = isPrime;
}
public void bookProduct(float charges)
{
	System.out.println("charge are: "+charges);
}
public String toString()
{
	return "PrimeAcc [isPrime="+isPrime+ ", getAccNo()="+getAccNo()+", getAccNm()="+getAccNm()+", getCharges()="+getcharges()+", getClass()="+ getClass()+", hashcode()="+hashCode()+", toString()="+super.toString()+"]";
}
}
