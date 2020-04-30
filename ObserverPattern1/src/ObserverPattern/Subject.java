package ObserverPattern;

public interface Subject {

	void registerCustomer(Customer customer);

	void unRegisterCustomer(Observer customer);

	void notifyCustomers();

	void itemArrival(String item);

}