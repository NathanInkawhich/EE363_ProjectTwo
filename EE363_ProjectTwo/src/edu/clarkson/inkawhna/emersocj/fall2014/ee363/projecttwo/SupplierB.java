package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projecttwo;

public class SupplierB implements ProducerSubscriber{

	@Override
	public void handleProducerEvent(ProducerEvent e) {
		
		System.out.println("+++++++++++");
		System.out.println("Message from SUPPLIER B");
		System.out.println("We got: " + e.getProduceAvailable());
		System.out.println("Quantity: " + e.getQuantityAvailable());
		System.out.println("Fresh/Ripe/Spoiled: " + e.getFreshRipeSpoiled());
		System.out.println("Is Organic: " + e.getIsOrganic());
		System.out.println("Is GMO: " + e.getIsGMO());
		System.out.println("+++++++++++");
		System.out.println();

	}

}
