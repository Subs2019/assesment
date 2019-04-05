package org.cts.vehicle;
/*
 * Bus Class   with this properties.
 */
public class Bus extends Vehicle {

	int maxSeatLimit;
	boolean isReserverd ;
	Double standardRate;
	
	

	public Bus(String vehicleType, String fuleType, Integer vin,
			String aC_nonAC, String maker, String model) {
		super(vehicleType, fuleType, vin, aC_nonAC, maker, model);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Const of Bus class
	 */
	public Bus(String vehicleType, String fuleType, Integer vin,
			String aC_nonAC, String maker, String model, int maxSeatLimit,
			boolean isReserverd, Double standardRate) {
		super(vehicleType, fuleType, vin, aC_nonAC, maker, model);
		this.maxSeatLimit = maxSeatLimit;
		this.isReserverd = isReserverd;
		this.standardRate = standardRate;
	}

	public boolean isReserverd() {
		return isReserverd;
	}

	public void setReserverd(boolean isReserverd) {
		this.isReserverd = isReserverd;
	}

	public int getMaxSeatLimit() {
		return maxSeatLimit;
	}

	public void setMaxSeatLimit(int maxSeatLimit) {
		this.maxSeatLimit = maxSeatLimit;
	}

	public Double getStandardRate() {
		return standardRate;
	}

	public void setStandardRate(Double standardRate) {
		this.standardRate = standardRate;
	}
	/*
	 * (non-Javadoc)
	 * @see org.cts.vehicle.Vehicle#toString()
	 */
	@Override
	public String toString() {
		return "Bus [maxSeatLimit=" + maxSeatLimit + ", isReserverd="
				+ isReserverd + ", standardRate=" + standardRate
				+ ", vehicleType=" + vehicleType + ", fuleType=" + fuleType
				+ ", vin=" + vin + ", aC_nonAC=" + aC_nonAC + ", maker="
				+ maker + ", model=" + model + "]";
	}





}
