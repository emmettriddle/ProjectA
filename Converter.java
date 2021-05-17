package main;

import java.util.Scanner;

public class Converter {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
		int menuSelection=0;
		float volCon=0;
		float distCon=0;
		
		while (menuSelection != 3) {
			
			Converter c= new Converter();
			System.out.println("Please make a Selection: " + 
					"\n" + "1. Volume Conversions " + 
					"\n" + "2. Distance Conversions " + 
					"\n" + "3. Quit" + "\n");
			Scanner input = new Scanner(System.in);			
			menuSelection= input.nextInt();
			
			if (menuSelection == 1) {
				
				System.out.println("Volume Conversions Select One:");
				System.out.println("1. Cups to Teaspoons: ");
				System.out.println("2. Teaspoons to Cups: ");
				System.out.println("3. US Gallon to Imperial Gallon: ");
				System.out.println("4. Imperial Gallon to US Gallon: ");
				System.out.println("5. Exit Conversion: ");
				menuSelection= input.nextInt();
								
				switch(menuSelection) {
				
				case 1:{
					System.out.println("Cup(s) to Teaspoons: \nPlease enter an Integer value to convert:\n");
					volCon= input.nextFloat();
					System.out.println(volCon + " Cup(s) is equivilent to " + c.cupToTeaspoon(volCon) + " Teaspoon(s)\n");
					break;}
				case 2:{
					System.out.println("Teaspoon(s) to Cup(s): \nPlease enter an Integer value to convert: \n");
					volCon= input.nextFloat();
					System.out.println(volCon + " Teaspoon(s) is equivilent to " + c.teaspoonToCup(volCon) + " Cup(s)\n");
					break;}
				case 3:{
					System.out.println("US Gallon(s) to Imperial Gallon(s): \nPlease enter an Integer value to convert:\n");
					volCon= input.nextFloat();
					System.out.println(volCon + " US Gallon(s) is equivilent to " + c.usGalToImpGal(volCon) + " Imperial Gallon(s)\n");
					break;}
				case 4:{
					System.out.println("Imperial Gallon(s) to US Gallon(s): \nPlease enter an Integer value to convert:\n");
					volCon= input.nextFloat();
					System.out.println(volCon + " Imperial Gallon(s) is equivilent to " + c.impGalToUsGal(volCon) + " US Gallon(s)\n");
					break;}
				case 5:{volCon= input.nextFloat();
					if(volCon>=5){break;}
					}
				
				}
								
			}//code block for volume conversion
			else if (menuSelection == 2) {
				
				System.out.println("Distance Conversions Select One");
				System.out.println("1. Miles to Kilometers: ");
				System.out.println("2. Kilometers to Miles: ");
				System.out.println("3. Exit Conversion: ");
				menuSelection= input.nextInt();
				
				switch(menuSelection) {
				case 1:{
					System.out.println("Mile(s) to Kilometer(s): \nPleast enter an Integer value to convert:\n");
					distCon= input.nextFloat();
					System.out.println(distCon + " Mile(s) is equivilent to " + c.milesToKm(distCon) + " Kilometer(s)\n");					
					break;
				}
				case 2:{
					System.out.println("Kilometer(s) to Mile(s): \nPleast enter an Integer value to convert:\n");
					distCon= input.nextFloat();
					System.out.println(distCon + " Kilometer(s) is equivilent to " + c.kmToMiles(distCon) + " Mile(s)\n");
					break;
				}
				case 3:{if(distCon>=3) {menuSelection = 3;}}
				}
				
			}//code block for distance conversion
			
			else {System.out.println("You have chosen to Exit");
			menuSelection = 3;}
		}// end of while loop
								
	}// end of main
	// methods for arithmetic of conversions
	public float cupToTeaspoon(float vol) {return vol *= 48;}
	
	public float usGalToImpGal(float vol) {return vol *= 0.832674;}
	
	public float teaspoonToCup(float vol) {return vol /= 48;}
	
	public float impGalToUsGal(float vol) {return vol /= 0.832674;}
	
	public float milesToKm(float dist) {return dist *= 1.60934;}
	
	public float kmToMiles(float dist) {return dist /= 1.60934;}

}// end of class Converter
