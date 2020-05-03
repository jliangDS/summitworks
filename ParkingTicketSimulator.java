// REMOVE DURING UPLOAD
package com.test;
import java.util.*;

class ParkedCar {
	String make;
	String model;
	String color;
	String licenseNumber;
	int numberOfMinutes;
	
	public ParkedCar(String mk, String mo, String co, String li, int mi) {
		make = mk;
		model = mo;
		color = co;
		licenseNumber = li;
		numberOfMinutes = mi;
	}
}

class ParkingMeter {
	// TO KNOW THE NUMBER OF MINUTES OF PARKING TIME THAT HAS BEEN PURCHASED
	int minutesPurchased;
	String licenseNumber;
	
	public ParkingMeter(int dr, String li) {
		minutesPurchased = dr;
		licenseNumber = li;
	}
}

class PoliceOfficer {
	String name;
	int badgeNumber;
	
	public PoliceOfficer(String na, int nu) {
		name = na;
		badgeNumber = nu;
	}
	
	public void examine(String make, String model, String color, String licenseNumber, int numberOfMinutes, int minutesPurchased) {
		// TO EXAMINE A PARKEDCAR OBJ AND PARKINGMETER OBJ, AND DETERMINE WHETHER THE CAR'S TIME HAS EXPIRED
		if(numberOfMinutes > minutesPurchased) {
			int overPurchasedMinutes = numberOfMinutes - minutesPurchased;
			int overSixtyMinutes;
			int fine = 0;
			if (overPurchasedMinutes <= 60) {
				fine += 25;
			}
			else {
				fine += 25;
				overSixtyMinutes = overPurchasedMinutes - 60;
				while(overSixtyMinutes > 0) {
					fine += 10;
					overSixtyMinutes -= 60;
				}
			}
			issue(make, model, color, licenseNumber, fine, name, badgeNumber);
		}
		else {
			System.out.println("Parking Ticket Not Issued");
		}
	}
	public void issue(String make, String model, String color, String licenseNumber, int fine, String name, int badgeNumber) {
		// TO ISSUE A PARKING TICKET(GENERATE A PARKING TICKET OBJ) IF THE CAR'S TIME HAS EXPIRED
		ParkingTicket ticket = new ParkingTicket(make, model, color, licenseNumber, fine, name, badgeNumber);
		
		System.out.println("Parking Ticket Issued");
		System.out.println("Fined amount: " + "$" + fine);
		System.out.println("Car issued to: " + color + " " + make + " " + model +  " license #: " + licenseNumber);
		System.out.println("Issued by officer: " + name + ", badge #: " + badgeNumber);
	}
}

class ParkingTicket {
	String make;
	String model;
	String color;
	String licenseNumber;
	int fine;
	String name;
	int badgeNumber;
	
	public ParkingTicket(String ma, String mo, String co, String li, int fi, String na, int nu){
		make = ma;
		model = mo;
		color = co;
		licenseNumber = li;
		fine = fi;
		name = na;
		badgeNumber = nu;
	}
}

public class ParkingTicketSimulator {

	public static void main(String[] args) {
		System.out.println("Enter car make: ");
		Scanner mk = new Scanner(System.in);
		String a = mk.nextLine();

		System.out.println("Enter car model: ");
		Scanner mo = new Scanner(System.in);
		String b = mo.nextLine();
		
		System.out.println("Enter car color: ");
		Scanner co = new Scanner(System.in);
		String c = co.nextLine();
		
		System.out.println("Enter car license number: ");
		Scanner li = new Scanner(System.in);
		String d = li.nextLine();
		
		System.out.println("Enter minutes car has parked: ");
		Scanner mi = new Scanner(System.in);
		int e = mi.nextInt();
		
		// PARKEDCAR OBJ
		ParkedCar car = new ParkedCar(a,b,c,d,e);

		System.out.println("Meter Data");
		System.out.println("Enter minutes purchased by driver: ");
		Scanner dr = new Scanner(System.in);
		int f = dr.nextInt();
		
		// PARKINGMETER OBJ
		ParkingMeter meter = new ParkingMeter(f, d);

		
		System.out.println("PO Data");
		System.out.println("Enter police officer's name: ");
		Scanner na = new Scanner(System.in);
		String g = na.nextLine();
		
		System.out.println("Enter police officer's badge number: ");
		Scanner nu = new Scanner(System.in);
		int h = nu.nextInt();
		
		// POLICEOFFICER OBJ
		PoliceOfficer officer = new PoliceOfficer(g, h);
		officer.examine(car.make, car.model, car.color, car.licenseNumber, car.numberOfMinutes, meter.minutesPurchased);
		
	}

}
