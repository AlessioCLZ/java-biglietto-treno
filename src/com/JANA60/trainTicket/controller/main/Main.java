package com.JANA60.trainTicket.controller.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{

		final double TICKETBASEPRICE = 0.21;
		final int YOUNGAGE = 18;
		final int OLDAGE = 65;
		
		Scanner keyboard = new Scanner(System.in);
		
		int distance, age;
		double totalPrice=0;
		
		System.out.println("Welcome to the ticket generator!");
		
		System.out.println("Please insert how many km you need to travel:");
		
		distance= Integer.parseInt(keyboard.nextLine());
		
		System.out.println("Please insert your age:");
		
		age= Integer.parseInt(keyboard.nextLine());
		
		if (age<0 || distance <0)
			System.out.println("The system cannot process negative age or distances");
		else
		{
			
			if (age<YOUNGAGE)
			{
				totalPrice = ((distance * TICKETBASEPRICE)/20)*100;
			}
			if (age>OLDAGE)
			{
				totalPrice = ((distance * TICKETBASEPRICE)/40)*100;
			}
			if (age<OLDAGE && age>YOUNGAGE)
			{
				totalPrice = distance * TICKETBASEPRICE;
			}	
			
			
		}
		
		System.out.println("The price of your ticket is: " +totalPrice);

		
		
		
		
		
		
		
		keyboard.close();
		
	}

}
