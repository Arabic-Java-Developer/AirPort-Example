package com.codingelab.somy.airport.main;

import java.util.Scanner;

import com.codingelab.somy.airport.airport.Airport;
import com.codingelab.somy.airport.plane.Plane;

public class Demo {

	public static void main(String[] args) {

		Airport airport = new Airport();

		// =============== plane 1==================== //
		Plane plane1 = new Plane();
		plane1.setDay(airport.getDays()[0]);
		plane1.setPlaneNumber("PLANE-1");
		plane1.setTravelNumber(2020);

		plane1.setFirstTrip("Egypt");
		plane1.setSecondTrip("Italy");
		plane1.setThirdTrip("Japan");

		// =============== plane 2==================== //
		Plane plane2 = new Plane();
		plane2.setDay(airport.getDays()[1]);
		plane2.setPlaneNumber("PLANE-2");
		plane2.setTravelNumber(2025);

		plane2.setFirstTrip("Afghanistan");
		plane2.setSecondTrip("Albania");
		plane2.setThirdTrip("Algeria");

		// =============== plane 3==================== //
		Plane plane3 = new Plane();
		plane3.setDay(airport.getDays()[2]);
		plane3.setPlaneNumber("PLANE-3");
		plane3.setTravelNumber(2030);

		plane3.setFirstTrip("Andorra");
		plane3.setSecondTrip("Angola");
		plane3.setThirdTrip("Antigua and Barbuda");

		// =============== plane 4==================== //
		Plane plane4 = new Plane();
		plane4.setDay(airport.getDays()[2]);
		plane4.setPlaneNumber("PLANE-4");
		plane4.setTravelNumber(2030);

		plane4.setFirstTrip("Andorra");
		plane4.setSecondTrip("Angola");
		plane4.setThirdTrip("Antigua and Barbuda");

		// =============== plane 5==================== //
		Plane plane5 = new Plane();
		plane5.setDay(airport.getDays()[2]);
		plane5.setPlaneNumber("PLANE-5");
		plane5.setTravelNumber(2035);
		plane5.setFirstTrip("The Bahamas");
		plane5.setSecondTrip("Bahrain");
		plane5.setThirdTrip("Bangladesh");

		// =============== plane 6==================== //
		Plane plane6 = new Plane();
		plane6.setDay(airport.getDays()[4]);
		plane6.setPlaneNumber("PLANE-6");
		plane6.setTravelNumber(2040);
		plane6.setFirstTrip("Bolivia");
		plane6.setSecondTrip("Botswana");
		plane6.setThirdTrip("Brazil");

		// =============== plane 7==================== //
		Plane plane7 = new Plane();
		plane7.setDay(airport.getDays()[5]);
		plane7.setPlaneNumber("PLANE-7");
		plane7.setTravelNumber(2045);
		plane7.setFirstTrip("Cabo Verde");
		plane7.setSecondTrip("Cambodia");
		plane7.setThirdTrip("Cameroon");

		// =============== plane 8==================== //
		Plane plane8 = new Plane();
		plane8.setDay(airport.getDays()[6]);
		plane8.setPlaneNumber("PLANE-8");
		plane8.setTravelNumber(2050);
		plane8.setFirstTrip("El Salvador");
		plane8.setSecondTrip("Egypt");
		plane8.setThirdTrip("Ecuador");

		// =============== plane 9==================== //
		Plane plane9 = new Plane();
		plane9.setDay(airport.getDays()[5]);
		plane9.setPlaneNumber("PLANE-9");
		plane9.setTravelNumber(2050);
		plane9.setFirstTrip("Ethiopia");
		plane9.setSecondTrip("Egypt");
		plane9.setThirdTrip("Ecuador");

		// =============== plane 10==================== //
		Plane plane10 = new Plane();
		plane10.setDay(airport.getDays()[0]);
		plane10.setPlaneNumber("PLANE-10");
		plane10.setTravelNumber(2050);
		plane10.setFirstTrip("Bolivia");
		plane10.setSecondTrip("Botswana");
		plane10.setThirdTrip("Brazil");

		// set planes number
		String planes[] = new String[10];

		planes[0] = plane1.getPlaneNumber();
		planes[1] = plane2.getPlaneNumber();
		planes[2] = plane3.getPlaneNumber();
		planes[3] = plane4.getPlaneNumber();
		planes[4] = plane5.getPlaneNumber();
		planes[5] = plane6.getPlaneNumber();
		planes[6] = plane7.getPlaneNumber();
		planes[7] = plane8.getPlaneNumber();
		planes[8] = plane9.getPlaneNumber();
		planes[9] = plane10.getPlaneNumber();
		airport.setPlans(planes);

		// set planes travels
		int travels[] = new int[10];
		travels[0] = plane1.getTravelNumber();
		travels[1] = plane2.getTravelNumber();
		travels[2] = plane3.getTravelNumber();
		travels[3] = plane4.getTravelNumber();
		travels[4] = plane5.getTravelNumber();
		travels[5] = plane6.getTravelNumber();
		travels[6] = plane7.getTravelNumber();
		travels[7] = plane8.getTravelNumber();
		travels[8] = plane9.getTravelNumber();
		travels[9] = plane10.getTravelNumber();

		airport.setTravels(travels);

		boolean flag = true;

		Scanner input = new Scanner(System.in);
		int option = 0;

		while (flag) {
			System.out.println("1 : Print Planes Number and Planes Traveled last Monday .");
			System.out.println("2 : Print Third Plane Informations .");
			System.out.println("3 : Print Second  Trip For Planes That flew in last saturday and last thursday");
			System.out.println("4 : Change Trip Number  that travel next Sunday");
			System.out.println("5 : Exit!!");

			// user insert option number
			System.out.print("Enter option Number: ");
			 option = input.nextInt(); 
			
			if (option >= 1 && option <= 5) {
				switch (option) {
				case 1:
					System.out.println("Planes Number and Planes Traveled last Monday ");

					for (int i = 0; i < airport.getPlans().length; i++) {
						if (Plane.getPlanes()[i].getDay() == "Monday") {
							System.out.println("Plane Number : " + airport.getPlans()[i]);
							System.out.println("Plane Travel : " + airport.getTravels()[i]);
						}
					}
					System.out.println();

					break;

				case 2:
					System.out.println("Plane Number Three Information is : ");
					Plane.getPlanes()[2].getPlaneInfo();
					break;

				case 3:
					for(int i = 0 ; i < Plane.getPlanes().length ; i ++) {
						if(Plane.getPlanes()[i].getDay() == "Saturday" || Plane.getPlanes()[i].getDay() == "Thursday") {
							System.out.println(Plane.getPlanes()[i].getSecondTrip());
						}
					}
					break;

				case 4:
					int newTripNumber;
					System.out.print("Enter Trip Number : ");
					newTripNumber = input.nextInt(); 
					for(int i = 0 ; i < Plane.getPlanes().length ; i ++) {
						if(Plane.getPlanes()[i].getDay() == "Sunday") {
							Plane.getPlanes()[i].setTravelNumber(newTripNumber);
							System.out.println("Done!!");
							System.out.println("Plane Infor After Change :");
							Plane.getPlanes()[i].getPlaneInfo();
							
						}
					}
					
					break;
				case 5:
					break;
				default:
					System.out.println("Not Valid Value!!! ");

				}

				if (option == 5) {
					break;
				}

			}else {
				System.out.println("Enter number between 1 : 5");
			}
		}

		System.out.println("The End!!");

	}// end main
}// end class
