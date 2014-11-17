package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projecttwo;

public class CustomerB implements SupplierSubscriber {

	@Override
	public void handleSupplierEvent(SupplierEvent e) {
		System.out.println("This is from Customer B");

	}

}
