package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projecttwo;

public class Main {

	public static void main(String[] args){
		
		ProducerA prodA = new ProducerA();
		ProducerB prodB = new ProducerB();
		SupplierA supA = new SupplierA();
		SupplierB supB = new SupplierB();
		prodA.registerProducerSubscriber(supA);
		prodB.registerProducerSubscriber(supB);
		prodA.populateInventory("BEANS", 100, "FRESH", true, true);
		prodB.populateInventory("BLUEBERRIES", 200, "RIPE", true, false);
		
		
	}

}
