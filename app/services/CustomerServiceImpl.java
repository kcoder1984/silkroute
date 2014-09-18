package services;

import play.Logger;
import models.Customer;
import models.Asset;
import serviceInterface.customerService;

public class CustomerServiceImpl implements customerService{

	@Override
	public Customer addCustomer(Customer customer) {
		customer.save();
		return customer;
	}

	@Override
	public boolean deleteCustomer(String customerId) {
		
		Customer customer = Customer.findById(customerId);
		
		if(customer != null){
			customer.delete();
		}else{
			Logger.error("Customer %s not found.", customerId);
		}
		
		return false;
	}

	@Override
	public void addResource(Asset resource, Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
	

}
