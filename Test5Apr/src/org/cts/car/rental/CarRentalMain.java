package org.cts.car.rental;

import org.cts.customer.Customer;
import org.cts.vehicle.Bus;
import org.cts.vehicle.Car;
import org.cts.vehicle.SUV;

 /*
public class CarRentalMain {
	
	public static void main(String[] args) {

		Car car1= new Car("Car","Petrol", 12345,"AC","Hundai","i20",5,false,15.0);  
		Car car2= new Car("Car","Petrol", 12312,"NON/AC","Hundai","i10",5,false,15.0); 
		SUV suv1= new SUV("SUV","Diesel", 17645,"AC","Honda","CRV",7,false,14.0);  
		Bus bus1= new Bus("BUS","Diesel", 11245,"AC","VOLVO","A1",40,false,14.0);  
		Bus bus2= new Bus("BUS","Diesel", 23423,"NON/AC","TATA","BT",60,false,14.0); 

		Customer cust= new Customer ("Subrat","Chaudhary","Male","Pune","9096875978");
		// Book for SUV from Pune to Mumbai with 5 Passangers 
		Booking bookingCar = new Booking(cust,car1,"Pune","Mumbai",200.0,5 );
		bookingCar.calculateBooking(car1.getMaxSeatLimit(),car1.isReserverd(),car1.getStandardRate());
		System.out.println(bookingCar.toString()+"\n\n");
		
		// Book for SUV from Pune to Bangalore with 6 Passangers (excess=1)
		Booking bookingCar2 = new Booking(cust,car2,"Pune","Bangalore",1000.0,6 );
		bookingCar2.calculateBooking(car2.getMaxSeatLimit(),car2.isReserverd(),car2.getStandardRate()) ;
		System.out.println(bookingCar2.toString()+"\n\n");
		
		// Book for SUV from Mumbai to Delhi with 5 Passangers 
		Booking bookingsuv1 = new Booking(cust,suv1,"Mumbai","Delhi",2600.0,5 );
		bookingsuv1.calculateBooking(suv1.getMaxSeatLimit(),suv1.isReserverd(),suv1.getStandardRate()) ;
		System.out.println(bookingsuv1.toString()+"\n\n"); 
		
		// Book for Bus from Mumbai to Delhi with 35 Passangers
		Booking bookingbus1 = new Booking(cust, bus1,"Mumbai","Delhi",2600.0,35 );
		bookingbus1.calculateBooking(bus1.getMaxSeatLimit(),bus1.isReserverd(),bus1.getStandardRate()) ;
		System.out.println(bookingbus1.toString()+"\n\n");
		
		// Book for Bus from Mumbai to Chennai with 70 Passangers(excess=10)
		Booking bookingbus2 = new Booking(cust, bus2,"Mumbai","Chennai",1600.0,70 );
		bookingbus2.calculateBooking(bus2.getMaxSeatLimit(),bus2.isReserverd(),bus2.getStandardRate()) ;
		System.out.println(bookingbus2.toString()+"\n\n");
	}

} */

