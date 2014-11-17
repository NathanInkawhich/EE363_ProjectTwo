package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projecttwo;

public class SupplierEvent {
	
	private String produceAvailable;//Name of what is available(eg. Stringbeans, blueberries)
	private int quantityAvailable; //How much of that product is available
	private String freshRipeSpoiled;
	private boolean isOrganic;
	private boolean isGMO;
	
	public SupplierEvent(String produce, int quantity, String FRS, boolean organic, boolean gmo) {
		
		this.produceAvailable = produce;
		this.quantityAvailable = quantity;
		this.freshRipeSpoiled = FRS;
		this.isOrganic = organic;
		this.isGMO = gmo;
		
	}

	public String getProduceAvailable() {
		return produceAvailable;
	}

	public void setProduceAvailable(String produceAvailable) {
		this.produceAvailable = produceAvailable;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public String getFreshRipeSpoiled() {
		return freshRipeSpoiled;
	}

	public void setFreshRipeSpoiled(String freshRipeSpoiled) {
		this.freshRipeSpoiled = freshRipeSpoiled;
	}

	public boolean getIsOrganic() {
		return isOrganic;
	}

	public void setIsOrganic(boolean isOrganic) {
		this.isOrganic = isOrganic;
	}

	public boolean getIsGMO() {
		return isGMO;
	}

	public void setIsGMO(boolean isGMO) {
		this.isGMO = isGMO;
	}

}
