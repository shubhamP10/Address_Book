/*
 *@author: Shubham Pattar
 *main code for address book management
 *this file is the gateway for calling add(), display(), delete(), search(), edit(), sort() methods  
 */
package com.bridgelabz.codingclub.main;
import com.bridgelabz.codingclub.utils.InputUtil;
import com.bridgelabz.codingclub.models.Helper;
import java.io.IOException;

public class AddressBook {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		int choice; 
		final Helper help = new Helper();
		while(true)
		{
			System.out.println("<--- Welcome to Address Book Management --->");
			System.out.println("\t ________________________________________");
			System.out.println("\t | \t 1. Add New Person      \t|");
			System.out.println("\t | \t 2. Display Records     \t|");
			System.out.println("\t | \t 3. Delete Person Record\t|");
			System.out.println("\t | \t 4. Search Person Record\t|");
			System.out.println("\t | \t 5. Edit Person Record  \t|");
			System.out.println("\t | \t 6. Sort By Name        \t|");
			System.out.println("\t | \t 7. Exit 		\t|");
			System.out.println("\t ----------------------------------------");
			System.out.println("\t\t <--- Enter Your Choice --->");
			choice = InputUtil.getIntValue();
			switch(choice)
			{
				case 1 :
						help.addRecord();
//						System.out.println("Welcome to Add Person Page");
						break;
				case 2 :
					help.displayRecord();
//					System.out.println("Welcome to Display Page");
					break;
				case 3 :
					System.out.println("Welcome to Delete Page");
					break;
				case 4 :
					System.out.println("Welcome to Search Page");
					break;
				case 5 :
					System.out.println("Welcome to Edit Page");
					break;
				case 6 :
					System.out.println("Welcome to Sort Page");
					break;
				case 7 :
					return;
				default :
					System.out.println("Please Enter Valid Option!!!");
			}
		}
	}
}
