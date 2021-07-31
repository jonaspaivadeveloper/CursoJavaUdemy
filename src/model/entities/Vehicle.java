package model.entities;

public class Vehicle {
	
	private String model;
	
	//cosntrutor padrão
	public Vehicle() {
		
	}
	
	//construtor co argumento
	public Vehicle(String model) {
		this.model = model;
	}
	
	//getter e setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	

}
