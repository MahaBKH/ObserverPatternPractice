package ObserverPattern;

public class Market {
	public static void main(String[] args)
	{
		Branch UpTown = new Branch();
		Branch DownTown = new Branch();
		Branch LincolnPark = new Branch();
		
		Customer a = new Customer("Chris");
		Customer b = new Customer("Zain");
		Customer c = new Customer("John");
		Customer d = new Customer("Ash");
		Customer e = new Customer("Smith");
		Customer f = new Customer("Jun");
		Customer g = new Customer("Ali");
		Customer h = new Customer("Donna"); 
		
		UpTown.registerCustomer(a);
		UpTown.registerCustomer(b);
		UpTown.registerCustomer(c);
		UpTown.registerCustomer(d);
		DownTown.registerCustomer(e);
		DownTown.registerCustomer(f);
		LincolnPark.registerCustomer(g);
		LincolnPark.registerCustomer(h);
		
		
		UpTown.unRegisterCustomer(d);
		LincolnPark.unRegisterCustomer(h);
		
		a.marketBranch(UpTown);
		b.marketBranch(UpTown);
		c.marketBranch(UpTown);
		d.marketBranch(UpTown);
		e.marketBranch(DownTown);
		f.marketBranch(DownTown);
		g.marketBranch(LincolnPark);
		h.marketBranch(LincolnPark);
		
		UpTown.itemArrival(" Clorox wipes");
		DownTown.itemArrival(" Toilet paper");
		LincolnPark.itemArrival(" Pasta");
		
		
	}
	

}
