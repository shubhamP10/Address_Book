package com.bridgelabz.codingclub.services;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.codingclub.models.Person;
import com.bridgelabz.codingclub.utils.InputUtil;

public class Search 
{
	public static void searchItem(List<Person> person) 
	{
		String search = null;
		int flag = 0;
		List<Person> matches = new ArrayList<Person>();
		System.out.println("Search by...\n"
						+ "1: First Name\n"
						+ "2: Last Name\n"
						+ "3: City\n"
						+ "4: State\n"
						+ "5: Zip Code\n"
						+ "6: Phone Number");
		int choice = InputUtil.getIntValue();
		switch (choice) 
		{
		case 1:
			System.out.println("Enter First Name to search : ");
			search = InputUtil.getStringValue();
			for(Person p: person)
			 {
				 if(p.getFname().equalsIgnoreCase(search))
				 {
					 
					 flag = 1;
					 matches.add(p); 
//					 System.out.println(person.indexOf(p));
				 }
			 }
			 if(flag == 1)
			 {
				 System.out.println("...Match Found...");
				 for(Person p: matches)
				 {
					 System.out.println(p);
				 }
			 }
			 else
			 {
				 System.out.println("Match Not Found!!!");
			 }
			break;
		case 2:
			System.out.println("Enter Last Name to search : ");
			search = InputUtil.getStringValue();
			for(Person p: person)
			 {
				 if(p.getLname().equalsIgnoreCase(search))
				 {
					 
					 flag = 1;
					 matches.add(p);
				 }
			 }
			 if(flag == 1)
			 {
				 System.out.println("...Match Found...");
				 for(Person p: matches)
				 {
					 System.out.println(p);
				 }
			 }
			 else
			 {
				 System.out.println("Match Not Found!!!");
			 }
			break;
		case 3 :
			System.out.println("Enter City Name to search : ");
			search = InputUtil.getStringValue();
			for(Person p: person)
			 {
				 if(p.getCity().equalsIgnoreCase(search))
				 {
					 
					 flag = 1;
					 matches.add(p);
				 }
			 }
			 if(flag == 1)
			 {
				 System.out.println("...Match Found...");
				 for(Person p: matches)
				 {
					 System.out.println(p);
				 }
			 }
			 else
			 {
				 System.out.println("Match Not Found!!!");
			 }
			break;
		case 4 :
			System.out.println("Enter State Name to search : ");
			search = InputUtil.getStringValue();
			for(Person p: person)
			 {
				 if(p.getState().equalsIgnoreCase(search))
				 {
					 
					 flag = 1;
					 matches.add(p);
				 }
			 }
			 if(flag == 1)
			 {
				 System.out.println("...Match Found...");
				 for(Person p: matches)
				 {
					 System.out.println(p);
				 }
			 }
			 else
			 {
				 System.out.println("Match Not Found!!!");
			 }
			break;
		case 5 :
			System.out.println("Enter Zip Code to search : ");
			search = InputUtil.getStringValue();
			for(Person p: person)
			 {
				 if(p.getZip().equalsIgnoreCase(search))
				 {
					 
					 flag = 1;
					 matches.add(p);
				 }
			 }
			 if(flag == 1)
			 {
				 System.out.println("...Match Found...");
				 for(Person p: matches)
				 {
					 System.out.println(p);
				 }
			 }
			 else
			 {
				 System.out.println("Match Not Found!!!");
			 }
			break;
		case 6:
			System.out.println("Enter Phone Number to search : ");
			search = InputUtil.getStringValue();
			for(Person p: person)
			 {
				 if(p.getPhone().equalsIgnoreCase(search))
				 {
					 
					 flag = 1;
					 matches.add(p);
				 }
			 }
			 if(flag == 1)
			 {
				 System.out.println("...Match Found...");
				 for(Person p: matches)
				 {
					 System.out.println(p);
				 }
			 }
			 else
			 {
				 System.out.println("Match Not Found!!!");
			 }
			break;
		default:
			System.out.println("Please Enter Valid Option");
			break;
		}
			
		
		
		
		
		
	}
}
