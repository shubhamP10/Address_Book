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

	public static void main(String[] args) throws IOException 
	{
		int choice,i=0; 
		final Helper help = new Helper();
		while(i==0)
		{
			System.out.println("--- Address Book Management ---\n");
			System.out.println("\t--MENU--");
			System.out.println("1: Add New Person      ");
			System.out.println("2: Display Records     ");
			System.out.println("3: Edit Person Record  ");
			System.out.println("4: Search Person Record");
			System.out.println("5: Delete Person Record");
			System.out.println("6: Sort and Display        ");
			System.out.println("7: Exit		       \n");
//			System.out.println(" -----------------------");
			System.out.println("--- Enter Your Choice ---");
			choice = InputUtil.getIntValue();
			switch(choice)
			{
				case 1 :
						help.addRecord();
						break;
				case 2 :
						help.displayRecord();
						break;
				case 3 :
						help.editRecord();
						break;
				case 4 :
						help.searchRecord();
						break;
				case 5 :
						help.deleteRecord();
						break;
				case 6 :
						help.sortRecord();
						break;
				case 7 :
						i=1;
						break;
				default :
						System.out.println("Please Enter Valid Option!!!");
			}
		}
	}
}
