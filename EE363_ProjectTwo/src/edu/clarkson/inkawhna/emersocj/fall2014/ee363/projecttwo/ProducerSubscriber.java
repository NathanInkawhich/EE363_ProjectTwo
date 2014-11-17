package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projecttwo;

public interface ProducerSubscriber {
	
	/**
	 * This method is how the suppliers make purchases from the producers
	 * @param e 
	 */
	public void handleProducerEvent(ProducerEvent e);
	
}
