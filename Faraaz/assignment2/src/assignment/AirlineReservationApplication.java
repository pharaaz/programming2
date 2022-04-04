package assignment;

/*
 * This class will read a txt file, extracting desired information relating to the flight. Use this information 
 *  to determine availability of seats for different airlines. 
 *  Once done the class will update the text file with new data regarding the new reservations. 
 * @author Mohammed Faraaz Khan 17985055
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AirlineReservationApplication {
	private static ArrayList<Flight> flights= new ArrayList<Flight>();
	private static ArrayList<Airline> airlines= new ArrayList<Airline>();
	private static ArrayList<String> updateR= new ArrayList<String>();
	private static Scanner keyboard = new Scanner(System.in);
	
	/*
	 * reads a txt file, extracting desired information relating to the flight. Also throws necessary exceptions. 
	 * @return void 
	 * @author 17985055
	 */
	
	public static void setup() throws NumberFormatException, IOException{
		try {
			BufferedReader reader = new BufferedReader(new FileReader("flights.txt"));
			while(reader.ready()) {
				
				if(reader.readLine().contains("@F_info")  ){
					String info = reader.readLine();
					String[] split = info.split(",");
					//flightName.add("hello");
					
					//flights.add(g.);
					String flightIdentifier = split[0];
					String originCity=split[1];
					String destCity=split[2];
					String departureTime=split[3];
					SeatMap seatmapType;
					
					BoeingSeatMap boeingMap = new BoeingSeatMap();
					AirBusSeatMap airBusMap = new AirBusSeatMap();
					
					if(split[4].contains("Boeing") ==true) {
						seatmapType = boeingMap;
					}else  {
						seatmapType = airBusMap;
					}
					flights.add(new Flight(flightIdentifier,originCity,destCity,departureTime,seatmapType));
					
					
					if(reader.readLine().contains("@F_R_Seats")==true) {
						if(reader.readLine().contains("@@")==false) {
							String rSeat = reader.readLine();
							String[] individual = rSeat.split(",");
							for(int i = 0; i< individual.length; i++) {
								updateR.add(individual[i]);
								
							}
						}
						
					}
				
					
					
				}
			}
			reader.close();
		}catch (NumberFormatException e) {
			System.err.println("Error: Integer	parsing	fails");
		}catch(IOException e) {
			System.err.println("Error: Cannot read from file");
		}
		
	}
	
	/*
	 * Method will update the text file with new data regarding the new reservations. 
	 * @author 17985055
	 */
	
	public static void update() throws IOException{
		try {
			PrintWriter out = new PrintWriter(new FileWriter("flights.txt"));
			out.println("2");
			out.println("@Flight");
			out.println("@F_info");
			out.println("AC123,Ottawa,London,17:00h,Airbus");
			out.println("@F_R_Seats");
			out.println();
			out.println("@@");
			out.println("@Flight");
			out.println("@F_info");
			out.println("AC789,Auckland,Sydney,08:00h,Boeing");
			out.println("@F_R_Seats");
			out.println();
			out.println("@@");
			
			out.close();
		} catch (IOException e) {
			System.out.println("Error: Cannot write to file");
		}
		
	}
	
	/*
	 * From read data form the text file, method will use this information 
	 * to determine availability of seats for different airlines.  
	 * @author 17985055
	 */
	
	public static void main(String[] args)throws IOException,InputMismatchException {
		try{
			BoeingSeatMap boeingMap = new BoeingSeatMap();
		
		AirBusSeatMap airBusMap = new AirBusSeatMap();
		SimpleWay companySimpleWay = new SimpleWay("SimpleWay");
		SmartLine companySmartLine = new SmartLine("SmartLine");
		
		airlines.add(companySimpleWay);
		airlines.add(companySmartLine);

		int pickFlight = 2;
		int key = 0;
		Seat pickedSeat;// = null;
		//char column = pickedSeat.getSeatposition().getColumn();
		
		int mapType =0;
		
		
		setup();
		
		System.out.println("*****Welcome to Airline Reservation Application*****");
		System.out.println("Which airline would you like to travel with?");
		System.out.println("(Select a number or write \"quit\" if you want to quit the application!)");
		System.out.println("1: SimpleWay Airline");
		System.out.println("2: SmartLine Airline");
	
		
		
		int airlinePick = keyboard.nextInt();
		if(airlinePick ==1) {
			
			System.out.println(companySimpleWay);
			
		}
		else if(airlinePick ==2) {
			
			System.out.println(companySmartLine);

		}
		System.out.println("Which flight would you like to reserve a seat on?(choose a number)");
		System.out.println("1: " +flights.get(0));
		System.out.println("2: " +flights.get(1));
		int input = keyboard.nextInt();
		if(input==1) {
			System.out.println("Booking seats for Flight: " +flights.get(0));
			System.out.println(airBusMap);
			pickFlight = 0;
			mapType=1;
		}
		else if(input==2) {
			System.out.println("Booking seats for Flight: " +flights.get(1));
			System.out.println(boeingMap);
			pickFlight = 1;
			mapType=2;
		}
		
		while(key!=4) {
			
			System.out.println("\n1. Reserve First Class");
			System.out.println("2. Reserve Economy Class");
			System.out.println("3. Show Seating Map");
			System.out.println("4. Quit");
			int pick = keyboard.nextInt();
			
			if(pick == 1) {
				
				
				System.out.println("Which seat type?");
				System.out.println("1. WINDOW");
				System.out.println("2. AISLE");
				System.out.println("3. MIDDLE");
				input = keyboard.nextInt();
				
				if(input == 1) {
					if(airlinePick==1) {
						pickedSeat = companySimpleWay.reserveFirstClass(flights.get(pickFlight), SeatType.WINDOW);
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
					else if(airlinePick==2) {
						pickedSeat = companySmartLine.reserveFirstClass(flights.get(pickFlight), SeatType.WINDOW);
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
				}
				else if(input == 2) {
					if(airlinePick==1) {
						pickedSeat = companySimpleWay.reserveFirstClass(flights.get(pickFlight), SeatType.AISLE);
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
					else if(airlinePick==2) {
						pickedSeat = companySmartLine.reserveFirstClass(flights.get(pickFlight), SeatType.AISLE);
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
				}
				else if(input == 3) {
					if(airlinePick==1) {
						pickedSeat = companySimpleWay.reserveFirstClass(flights.get(pickFlight), SeatType.MIDDLE);
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
					else if(airlinePick==2) {
						pickedSeat = companySmartLine.reserveFirstClass(flights.get(pickFlight), SeatType.MIDDLE);
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
				}
			}
			else if(pick == 2) {
				
				System.out.println("Which seat type?");
				System.out.println("1. WINDOW");
				System.out.println("2. AISLE");
				System.out.println("3. MIDDLE");
				input = keyboard.nextInt();
				
				if(input==1) {
					if(airlinePick==1) {
						pickedSeat = companySimpleWay.reserveEconomy(flights.get(pickFlight), SeatType.WINDOW);
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
					else if(airlinePick==2) {
						pickedSeat = companySmartLine.reserveEconomy(flights.get(pickFlight), SeatType.WINDOW);
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
				}
				else if(input == 2) {
					if(airlinePick==1) {
						pickedSeat = companySimpleWay.reserveEconomy(flights.get(pickFlight), SeatType.AISLE);
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
					else if(airlinePick==2) {
						pickedSeat = companySmartLine.reserveEconomy(flights.get(pickFlight), SeatType.AISLE);
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
				}
				else if(input == 3) {
					if(airlinePick==1) {
						pickedSeat = companySimpleWay.reserveEconomy(flights.get(pickFlight), SeatType.MIDDLE);
						System.out.println(pickedSeat.getSeatposition().getColumn());
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
					else if(airlinePick==2) {
						pickedSeat =  companySmartLine.reserveEconomy(flights.get(pickFlight), SeatType.MIDDLE);
						System.out.println(flights.get(pickFlight).getSeating());
						System.out.println("Seat reservation: "+pickedSeat.toDescription());
					}
					
				}
			}
			else if(pick == 3) {
				System.out.println(flights.get(pickFlight).getSeating());
			}
			else if(pick == 4) {
				System.out.println("Goodbye.");
				key =4;
			}
		}
		
		update();
		}catch(InputMismatchException e) {

            System.err.println("Error: InputMismatchException raised");

        }
	}
}
