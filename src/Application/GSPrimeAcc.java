package Application;

import Framework.PrimeAcc;

public class GSPrimeAcc extends	PrimeAcc{
	
	private static final float charges=0;
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges, isPrime);
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Dear Prime member, your product charges are: "+charges);
	}
	
	public String toString()
	{
		return "GSPrimeAcc [toString()=" +super.toString()+ ", getAccNo()="+getAccNo()+", getAccNm()="+getAccNm()+", getCharges()="+getcharges()+", getClass()="+getClass()+", hashCode()="+hashCode()+"]";
	}

}
