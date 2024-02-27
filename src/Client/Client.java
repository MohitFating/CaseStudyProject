package Client;

import Application.GSNormalAcc;
import Application.GSPrimeAcc;
import Application.GSShopeFactory;
import Framework.PrimeAcc;
import Framework.ShopFactory;
import Framework.NormalAcc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFactory sf=new GSShopeFactory();
		
		PrimeAcc pa = new GSPrimeAcc(321,"Mohit",1000,true);
		pa.bookProduct(pa.getcharges());
		pa.toString();
		
		NormalAcc na=new GSNormalAcc(121,"Neha",2000,100);
		na.bookProduct(na.getDeliveryCharge());
		na.toString();

	}

}
