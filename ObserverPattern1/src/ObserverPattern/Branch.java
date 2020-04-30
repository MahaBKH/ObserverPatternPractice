package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Branch implements Subject {
	private List<Customer> customers = new ArrayList<>();
	String item;
	
	@Override
	public void registerCustomer(Customer customer) {
		customers.add(customer);
	}
	@Override
	public void unRegisterCustomer(Observer customer) {
		customers.remove(customer);
	}
	@Override
	public void notifyCustomers() {
		for(Observer customer : customers) {
			customer.updateCustomers();
	}
		}
		@Override
		public void itemArrival(String item)
		{
			this.item = item;
			notifyCustomers();
	
		
		}
}


