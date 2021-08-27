//Loosely Coupled
//Reference Tipleri

public class CustomerManager implements CustomerService {
	CustomerDalService customerDalService;
	
	public CustomerManager(CustomerDalService customerDalService) {
		super();
		this.customerDalService = customerDalService;
	}

	public void Add() {
		customerDalService.Add();
	}

}
