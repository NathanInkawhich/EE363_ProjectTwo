package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projecttwo;

import java.util.Random;

public class SupplierB implements ProducerSubscriber{

	@Override
	public void handleProducerEvent(ProducerEvent e) {
		
		System.out.println("+++++++++++");
		System.out.println("Message From Producer to Supplier B");
		System.out.println("We got: " + e.getProduceAvailable());
		System.out.println("Quantity: " + e.getQuantityAvailable());
		System.out.println("Fresh/Ripe/Spoiled: " + e.getFreshRipeSpoiled());
		System.out.println("Is Organic: " + e.getIsOrganic());
		System.out.println("Is GMO: " + e.getIsGMO());
		System.out.println("+++++++++++");
		System.out.println();
		
		
		int quantity = e.getQuantityAvailable();
		Random rn = new Random();
		int desiredQuantity = rn.nextInt(quantity) + 1;
		System.out.println("SUPPLIER B just bought " + desiredQuantity + " " + e.getProduceAvailable());
		e.setQuantityAvailable(quantity-desiredQuantity);
		System.out.println("There are " + e.getQuantityAvailable() + " left");

	}

}
