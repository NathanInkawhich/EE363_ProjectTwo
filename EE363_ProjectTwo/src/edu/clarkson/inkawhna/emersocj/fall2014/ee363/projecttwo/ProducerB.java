package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projecttwo;

public class ProducerB extends ProducerPublisher{

public void populateInventory(String produceAvailable, int quantityAvailable, String freshRipeSpoiled, boolean isOrganic, boolean isGMO){
		
		ProducerEvent event = new ProducerEvent(produceAvailable, quantityAvailable,freshRipeSpoiled, isOrganic, isGMO);
		notifyProducerSubscribers(event);
		
	}
}
