package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projecttwo;

public class Main {

	public static void main(String[] args){
		
		ProducerPublisher prodA = new ProducerA();
		ProducerPublisher prodB = new ProducerB();
		SupplierA supA = new SupplierA();
		SupplierB supB = new SupplierB();
		CustomerA cusA = new CustomerA();
		CustomerB cusB = new CustomerB();
		prodA.registerProducerSubscriber(supA);
		prodA.registerProducerSubscriber(supB);
		prodA.populateInventory("BEANS", 100, "FRESH", true, true);
		prodB.populateInventory("BLUEBERRIES", 200, "RIPE", true, false);
		
		
	}

}
