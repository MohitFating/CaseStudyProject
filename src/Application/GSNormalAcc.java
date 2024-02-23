package Application;

import Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{

public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge)
{
	super(accNo, accNm, charges, deliveryCharge);
}

public void bookProduct(float deliveryCharge)
{
	System.out.println("Dear Normal User, your charges are: "+getcharges()+"and delivery charge is "+ deliveryCharge);
}

public String toString() 
{
	return"GSNormalAcc [getDeliveryCharge()="+getDeliveryCharge()+", getAccNo()="+getAccNo()+", getAccNm()="+getAccNm()+", getCharges()="+getcharges()+", getClass()="+ getClass()+", hashcode()="+hashCode()+", toString()="+super.toString()+"]";
}
}
