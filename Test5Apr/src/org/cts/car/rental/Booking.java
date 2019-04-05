package org.cts.car.rental;

import org.cts.customer.Customer;
import org.cts.vehicle.Bus;
import org.cts.vehicle.Vehicle;

public class Booking {
	Customer customer;
	Vehicle vehicle;
	String fromCity;
	String toCity;
	Double distance;
	Integer noofPassangers;
	Double bookingCost;
	/*
	 * Const of Booking class
	 */
	public Booking(Customer customer, Vehicle vehicle, String fromCity,
			String toCity, Double distance, Integer noofPassangers) {
		super();
		this.customer = customer;
		this.vehicle = vehicle;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.distance = distance;
		this.noofPassangers = noofPassangers;

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Integer getNoofPassangers() {
		return noofPassangers;
	}

	public void setNoofPassangers(Integer noofPassangers) {
		this.noofPassangers = noofPassangers;
	}

	public Double getBookingCost() {
		return bookingCost;
	}

	public void setBookingCost(Double bookingCost) {
		this.bookingCost = bookingCost;
	}

	public Double calculateBooking(int maxSeatLimit,boolean isReserverd ,Double standardRate)
	{ 

		if(vehicle.getaC_nonAC().equals("AC")){
			standardRate= standardRate+2;
		}
		if(vehicle.getFuleType().equals("Diesel")){
			standardRate= standardRate-1;
		}
		if(this.noofPassangers>maxSeatLimit)
		{
			int excessPassanger= noofPassangers-maxSeatLimit;
			standardRate=standardRate+(1*excessPassanger);
		}
		if( vehicle instanceof Bus )
		{
			standardRate= standardRate-(standardRate*20)/100; //Discount on Bus
		}
		bookingCost= standardRate*getDistance();

		return bookingCost;

	}

	@Override
	public String toString() {
		String Vech=vehicle.getVehicleType()+vehicle.getVin()+vehicle.getaC_nonAC()+vehicle.getMaker()+vehicle.getFuleType()+vehicle.getModel();
		return "Booking [  vehicle=" + vehicle.toString()
				+ "\nfromCity=" + fromCity + ", toCity=" + toCity
				+ "\ndistance=" + distance + ", noofPassangers="
				+ noofPassangers + ", bookingCost=" + bookingCost +"]";
	}


}
