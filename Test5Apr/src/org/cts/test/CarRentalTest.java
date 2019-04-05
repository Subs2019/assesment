package org.cts.test;

import org.cts.car.rental.Booking;
import org.cts.customer.Customer;
import org.cts.vehicle.Bus;
import org.cts.vehicle.Car;
import org.cts.vehicle.SUV;
import org.junit.Test;

import junit.framework.TestCase;

public class CarRentalTest extends TestCase {

	Booking bookingCar, bookingsuv1,bookingbus1,bookingbus2 ;
	Car car1,car2;
	SUV suv1;
	Bus bus1,bus2;
	// assigning the values
	protected void setUp(){
		car1= new Car("Car","Petrol", 12345,"AC","Hundai","i20",5,false,15.0);  
		car2= new Car("Car","Petrol", 12312,"NON/AC","Hundai","i10"); 
		suv1= new SUV("SUV","Diesel", 17645,"AC","Honda","CRV",7,false,15.0);  
		bus1= new Bus("BUS","Diesel", 11245,"AC","VOLVO","A1",40,false,15.0);  
		bus2= new Bus("BUS","Diesel", 23423,"NON/AC","TATA","BT" ); 
	 
		car2.setVehicleType("Car");
		car2.setFuleType("Petrol");
		car2.setVin(12312);
		car2.setaC_nonAC("NON/AC");
		car2.setMaker("Hundai");
		car2.setModel("i10");
		car2.setMaxSeatLimit(5);
		car2.setReserverd(false);
		car2.setStandardRate(15.0);
		
		suv1.setMaxSeatLimit(7);
		suv1.setReserverd(false);
		suv1.setStandardRate(15.0);
		
		bus2.setMaxSeatLimit(60);
		bus2.setReserverd(false);
		bus2.setStandardRate(15.0);


		Customer cust= new Customer ("Subrat","Chaudhary","Male","Pune","9096875978");

		bookingCar = new Booking(cust,car1,"Pune","Mumbai",200.0,5 );
		bookingsuv1 = new Booking(cust,suv1,"Mumbai","Delhi",2600.0,5 );
		bookingbus1 = new Booking(cust, bus1,"Mumbai","Delhi",2600.0,35 );
		bookingbus2 = new Booking(cust, bus2,"Mumbai","Chennai",1600.0,70 );
		bookingCar.setCustomer(cust);
		bookingCar.setVehicle(car1);
		bookingCar.setFromCity("Pune");
		bookingCar.setToCity("Mumbai");
		bookingCar.setDistance(200.0);
		bookingCar.setNoofPassangers(5);
		bookingCar.setBookingCost(0.0);


	}
	@Test
	public void testCalculateCarBooking()
	{
		Double rtnVal=bookingCar.calculateBooking(car1.getMaxSeatLimit(),car1.isReserverd(),car1.getStandardRate());
		System.out.println(bookingCar.toString()+"\n\n");
		bookingCar.getCustomer().getFirstName();
		bookingCar.getCustomer().getLastName();
		bookingCar.getCustomer().getGender();
		bookingCar.getCustomer().getLocation();
		bookingCar.getCustomer().getContact();
		bookingCar.getVehicle();
		bookingCar.getFromCity();
		bookingCar.getToCity();
		bookingCar.getDistance();
		bookingCar.getNoofPassangers();
		bookingCar.getBookingCost();
		assertEquals(3400.0, rtnVal, 0);
	}
	@Test
	public void testCalculateSUVBooking()
	{

		Double rtnVal=bookingsuv1.calculateBooking(suv1.getMaxSeatLimit(),suv1.isReserverd(),suv1.getStandardRate()) ;
		System.out.println(bookingsuv1.toString()+"\n\n"); 
		assertEquals(41600.0, rtnVal, 0);


	}
	@Test
	public void testCalculateBusBooking()
	{


		Double rtnVal=bookingbus1.calculateBooking(bus1.getMaxSeatLimit(),bus1.isReserverd(),bus1.getStandardRate()) ;
		System.out.println(bookingbus1.toString()+"\n\n");
		assertEquals(33280.0, rtnVal, 0);


	}
	@Test
	public void testCalculateBus2Booking()
	{


		Double rtnVal=bookingbus2.calculateBooking(bus2.getMaxSeatLimit(),bus2.isReserverd(),bus2.getStandardRate()) ;
		System.out.println(bookingbus2.toString()+"\n\n");
		assertEquals(30720.0, rtnVal, 0);


	}
}
