package org.cts.vehicle;

public class Vehicle {

	String vehicleType;
	String fuleType;
	Integer vin;
	String aC_nonAC;
	String maker, model;


	/*
	 * Const. for Vehicle classs with all the required parameters.
	 */
	public Vehicle(String vehicleType, String fuleType, Integer vin,
			String aC_nonAC, String maker, String model) {
		super();
		this.vehicleType = vehicleType;
		this.fuleType = fuleType;
		this.vin = vin;
		this.aC_nonAC = aC_nonAC;
		this.maker = maker;
		this.model = model;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Integer getVin() {
		return vin;
	}

	public void setVin(Integer vin) {
		this.vin = vin;
	}

	public String getaC_nonAC() {
		return aC_nonAC;
	}

	public void setaC_nonAC(String aC_nonAC) {
		this.aC_nonAC = aC_nonAC;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuleType() {
		return fuleType;
	}

	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}

	


}
