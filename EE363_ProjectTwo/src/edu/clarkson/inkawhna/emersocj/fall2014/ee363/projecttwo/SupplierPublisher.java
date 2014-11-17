package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projecttwo;
import java.util.List;
import java.util.ArrayList;

public abstract class SupplierPublisher {

		private List<SupplierSubscriber> subscribers = new ArrayList<SupplierSubscriber>();
		
		public void registerSupplierSubscriber(SupplierSubscriber ss){
			subscribers.add(ss);
		}
		
		public void notifySupplierSubscribers(SupplierEvent e){//aka notify customers
			for(SupplierSubscriber ss : subscribers){
				ss.handleSupplierEvent(e);
			}
		}
		
	}
