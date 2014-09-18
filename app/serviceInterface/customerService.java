package serviceInterface;

import models.Customer;
import models.Asset;

public interface customerService {

	public Customer addCustomer(Customer customer);
	public boolean deleteCustomer(String customerId);
	public void addResource(Asset resource, Customer customer);
}
