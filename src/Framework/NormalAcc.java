package Framework;

public abstract class NormalAcc extends ShopAcc {

protected final float deliveryCharge;

public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge)
{
	super(accNo, accNm, charges);
	this.deliveryCharge = deliveryCharge;
}

public float getDeliveryCharge()
{
	return deliveryCharge;
}
public void bookProduct(float deliveryCharge)
{
	System.out.println("delivery charge are: "+ deliveryCharge);
}

public String toString()
{
	return "NormaAcc [deliveryCharges="+deliveryCharge+ ", getAccNo()="+getAccNo()+", getAccNm()="+getAccNm()+", getCharges()="+getcharges()+", getClass()="+ getClass()+", hashcode()="+hashCode()+", toString()="+super.toString()+"]";
	}
}
	
