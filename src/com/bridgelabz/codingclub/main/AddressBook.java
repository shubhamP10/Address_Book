/*
 *@author: Shubham Pattar
 *main code for address book management
 *this file is the gateway for calling add(), display(), delete(), search(), edit(), sort() methods  
 */
package com.bridgelabz.codingclub.main;
import com.bridgelabz.codingclub.utils.InputUtil;
import java.io.IOException;

public class AddressBook {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		int choice; 
//		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("<--- Welcome to Address Book Management --->");
			System.out.println("1. Add New Person");
			System.out.println("2. Display Records");
			System.out.println("3. Delete Person Record");
			System.out.println("4. Search Person Record");
			System.out.println("5. Edit Person Record");
			System.out.println("6. Sort By Name");
			System.out.println("7. Exit");
			System.out.println("<--- Enter Your Choice --->");
			choice = InputUtil.getIntValue();
			switch(choice)
			{
				case 1 :
						System.out.println("Welcome to Add Person Page");
						break;
				case 2 :
					System.out.println("Welcome to Display Page");
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
