package org.cts.vehicle;
/*
 *  SUV class  with this properties.
 */
public class SUV extends Vehicle {

	int maxSeatLimit;
	boolean isReserverd ;
	Double standardRate;

	/*
	 * Const. of the SUV class
	 */
	public SUV(String vehicleType, String fuleType, Integer vin,
			String aC_nonAC, String maker, String model, int maxSeatLimit,
			boolean isReserverd, Double standardRate) {
		super(vehicleType, fuleType, vin, aC_nonAC, maker, model);
		this.maxSeatLimit = maxSeatLimit;
		this.isReserverd = isReserverd;
		this.standardRate = standardRate;
	}


	public int getMaxSeatLimit() {
		return maxSeatLimit;
	}


	public void setMaxSeatLimit(int maxSeatLimit) {
		this.maxSeatLimit = maxSeatLimit;
	}


	public void setStandardRate(Double standardRate) {
		this.standardRate = standardRate;
	}

	public boolean isReserverd() {
		return isReserverd;
	}

	public void setReserverd(boolean isReserverd) {
		this.isReserverd = isReserverd;
	}


	public Double getStandardRate() {
		return standardRate;
	}


	@Override
	public String toString() {
		return "SUV [maxSeatLimit=" + maxSeatLimit + ", isReserverd="
				+ isReserverd + ", standardRate=" + standardRate
				+ ", vehicleType=" + vehicleType + ", fuleType=" + fuleType
				+ ", vin=" + vin + ", aC_nonAC=" + aC_nonAC + ", maker="
				+ maker + ", model=" + model + "]";
	}



}
