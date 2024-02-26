package Application;
import Framework.NormalAcc;
import Framework.PrimeAcc;
import Framework.ShopFactory;

public class GSShopeFactory extends ShopFactory
{

	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm,float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return gsprime;
		
	}
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm,float charges, float deliveryCharge) {
		GSNormalAcc gsnormal= new GSNormalAcc(accNo,  accNm, charges,  deliveryCharge);
		return gsnormal;
		
	}
}