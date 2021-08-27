
public class Main {

	public static void main(String[] args) {
		
		//Ioc Container // Ninject, AutoFac, Structure Map , Castle Windsor

		CustomerManager customerManager = new CustomerManager(new EfCustomerDal()); 
		customerManager.Add();
	}

}
