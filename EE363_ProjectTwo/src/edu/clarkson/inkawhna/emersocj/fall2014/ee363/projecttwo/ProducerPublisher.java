package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projecttwo;

import java.util.List;
import java.util.ArrayList;

public abstract class ProducerPublisher {

	private List<ProducerSubscriber> subscribers = new ArrayList<ProducerSubscriber>();
	
	public void registerProducerSubscriber(ProducerSubscriber ps){
		subscribers.add(ps);
	}
	
	public void notifyProducerSubscribers(ProducerEvent e){
		for(ProducerSubscriber ps : subscribers){
			ps.handleProducerEvent(e);
		}
	}
	//SHOULD THIS BE HERE OR SHOULD THIS BE LOCAL TO EVERY PUBLISHER
	public abstract void populateInventory(String produceAvailable, int quantityAvailable, String freshRipeSpoiled, boolean isOrganic, boolean isGMO);
	
	//SHOULD THIS BE HERE
		//public void populateInventory(String produceAvailable, int quantityAvailable, String freshRipeSpoiled, boolean isOrganic, boolean isGMO){
	 		//ProducerEvent event = new ProducerEvent(produceAvailable, quantityAvailable,freshRipeSpoiled, isOrganic, isGMO);
	 		//notifyProducerSubscribers(event);
	 	//}
}
