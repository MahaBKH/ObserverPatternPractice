package ObserverPattern;

public class Customer implements Observer {
	private String name;
	private Branch branch = new Branch();
	public Customer(String name) {
			super();
			this.name = name;
	}
	
	@Override
	public void marketBranch(Branch br) {
		branch = br;
	}
			
	
	@Override
	public void updateCustomers()
	{
		System.out.println("Dear "+ name + ": new item," + branch.item + ", has arrived. " );
	}
	

}
