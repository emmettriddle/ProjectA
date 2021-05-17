package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		
		Converter c= new Converter();
		System.out.println("Please make a Selection: " + 
				"\n" + "1. Volume Conversions " + 
				"\n" + "2. Distance Conversions " + 
				"\n" + "3. Quit" + "\n");
		Scanner input = new Scanner(System.in);
		String msg = input.nextLine();
		int menuSelection= Integer.valueOf(msg);

		
		
		while (menuSelection != 3) {
			
			if (menuSelection == 1) {
				Scanner volume = new Scanner(System.in);
				String msgV = volume.nextLine();
				System.out.println("Volume Conversions Select One:");
				System.out.println("1. Cups to Teaspoons: ");
				System.out.println("2. Teaspoons to Cups: ");
				System.out.println("3. US Gallon to Imperial Gallon: ");
				System.out.println("4. Imperial Gallon to US Gallon: ");
				System.out.println("5. Exit Conversion: ");
				float volCon= Float.valueOf(msgV);
				
				switch(menuSelection) {
				
				case 1:{
					System.out.println("Cups to Teaspoons: \nPlease enter an Integer value to convert:\n" + volCon);
					c.cupToTeaspoon(volCon);
					System.out.println(volCon + " Cups is equivilent to " + volCon + "2 Teaspoons");
					
					break;}
				case 2:{
					System.out.println("Teaspoons to Cups: \nPlease enter an Integer value to convert: \n" + volCon);
					c.teaspoonToCup(volCon);
					System.out.println(volCon + " Teaspoons is equivilent to " + volCon + " Cups");
					
					break;}
				case 3:{
					System.out.println("US Gallon to Imperial Gallon: \nPlease enter an Integer value to convert:\n" + volCon);
					c.usGalToImpGal(volCon);
					System.out.println(volCon + " US Gallons is equivilent to " + volCon + " Imperial Gallons");
					
					break;}
				case 4:{
					System.out.println("Cups to Teaspoons: \nPlease enter an Integer value to convert:\n" + volCon);
					c.impGalToUsGal(volCon);
					System.out.println(volCon + " Imperial Gallons is equivilent to " + volCon + " US Gallons");
					
					break;}
				case 5:{
					if(volCon>=5){menuSelection = 3;}
					break;}
				
				}
				
				
			}//code block for volume conversion
			else if (menuSelection == 2) {
				Scanner distance = new Scanner(System.in);
				String msgD = distance.nextLine();
				System.out.println("Distance Conversions Select One");
				System.out.println("1. Miles to Kilometers: ");
				System.out.println("2. Kilometers to Miles: ");
				System.out.println("3. Exit Conversion: ");
				float distCon= Float.valueOf(msgD);				
				
				switch(menuSelection) {
				case 1:{
					System.out.println("Miles to Kilometers: \nPleast enter an Integer value to convert:\n" + distCon);
					c.milesToKm(distCon);
					System.out.println(distCon + " Miles is equivilent to " + distCon + " Kilometers");
					
					break;
				}
				case 2:{
					System.out.println("Kilometers to Miles: \nPleast enter an Integer value to convert:\n" + distCon);
					c.milesToKm(distCon);
					System.out.println(distCon + " Kilometers is equivilent to " + distCon + " Miles");
					
					break;
				}
				case 3:{if(distCon>=3) {menuSelection = 3;}}
				}
				
			}//code block for distance conversion
			
			else {System.out.println("Invalid Input!");
			menuSelection = 3;}
		}// end of while loop
						
		
	}// end of main
	
	public float cupToTeaspoon(float vol) {
		vol *= 48;
		return vol;
	}
	
	public float usGalToImpGal(float vol) {
		vol *= 0.832674;
		return vol;
	}
	
	public float teaspoonToCup(float vol) {
		vol /= 48;
		return vol;
	}
	
	public float impGalToUsGal(float vol) {
		vol /= 0.832674;
		return vol;
	}
	
	public float milesToKm(float dist) {
		dist *= 1.60934;
		return dist;
	}
	
	public float kmToMiles(float dist) {
		dist /= 1.60934;
		return dist;
	}

}// end of class Converter
