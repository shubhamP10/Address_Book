package com.bridgelabz.codingclub.models;
import com.bridgelabz.codingclub.utils.InputUtil;
import com.bridgelabz.codingclub.services.Search;
import com.bridgelabz.codingclub.services.Sort;
import com.bridgelabz.codingclub.services.WriteToCSV;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Helper 
{
	private static final int PERSON_FNAME = 0;
	private static final int PERSON_LNAME = 1;
	private static final int PERSON_STREET = 2;
	private static final int PERSON_CITY = 3;
	private static final int PERSON_STATE = 4;
	private static final int PERSON_COUNTRY = 5;
	private static final int PERSON_PHONE = 6;
	private static final int PERSON_ZIP = 7;
//	private static final String CSV_HEADER = "FNAME,LNAME,STREET,CITY,STATE,COUNTRY,PHONE,ZIP";
	
//	GLOBAL METHOD TO GET CONTACTS LIST FROM CSV FILE
	private List<Person> getDataInList() 
	{
		BufferedReader br = null;
		FileReader fr = null;	
		List<Person> person = new ArrayList<Person>();
		try
		{
			String line = "";
			fr = new FileReader("address_book.csv");
			br = new BufferedReader(fr);
		
			while((line = br.readLine()) != null)
			{
				String[] tokens = line.split(",");
				if(tokens.length > 0)
				{
					Person person1 = new Person(
							tokens[PERSON_FNAME],
							tokens[PERSON_LNAME],
							tokens[PERSON_STREET],
							tokens[PERSON_CITY],
							tokens[PERSON_STATE],
							tokens[PERSON_COUNTRY],
							tokens[PERSON_PHONE],
							tokens[PERSON_ZIP]
							);
					person.add(person1);
				}
			}
		}
		catch (IOException e) 
		{
			System.out.println("Reading CSV Error!!!");
			e.printStackTrace();
		}
		finally
		{
			try {
			fr.close();
			}
			catch (IOException e) {
				System.out.println("Closing File Reader error!!!");
				e.printStackTrace();
			}
		}
		return person;
	} //END OF getDataInList()
	
//	ADD METHOD
	public void addRecord() throws IOException
	{
		final String fname, lname, street, city, state, country, phone,zip;
		
		System.out.print("Enter First Name : ");
		fname = InputUtil.getStringValue();
		System.out.print("Enter Last Name : ");
		lname = InputUtil.getStringValue();
		System.out.print("Enter Phone Number : ");
		phone = InputUtil.getStringValue();
		System.out.print("Enter Street : ");
		street = InputUtil.getStringValue();
		System.out.print("Enter city : ");
		city = InputUtil.getStringValue();
		System.out.print("Enter zip : ");
		zip = InputUtil.getStringValue();
		System.out.print("Enter state : ");
		state = InputUtil.getStringValue();
		System.out.print("Enter Country : ");
		country = InputUtil.getStringValue();
		
		List<Person> person = Arrays.asList(
				new Person(fname,lname,street,city,state,country,phone,zip)
				);
		WriteToCSV.writeAddCSV(person);
	} // END of addRecord()
	
//	DISPLAY METHOD 
	public void displayRecord() throws IOException
	{
		List<Person> person = getDataInList();
		for(Person p: person)
		{
			System.out.println(p);
		}
		
	} // END OF displayRecord
	
//	EDIT METHOD
	public void editRecord() throws IOException
	{
		final List<Person> person = getDataInList();
		int id,choice = 0, i=0;
		String fname,lname,street,city,state,country,phone,zip;
		for(Person p: person)
		{	
			System.out.println("ID: #"+person.indexOf(p)+" : "+p);			
		}
		System.out.print("\nEnter #ID to Edit Contact : ");
		id = InputUtil.getIntValue();
		System.out.println(person.get(id));
		while(i==0) {
			System.out.println("What You Want to edit...\n"
							+ "\t1: First Name\n"
							+ "\t2: Last Name\n"
							+ "\t3: Street\n"
							+ "\t4: city\n"
							+ "\t5: State\n"
							+ "\t6: Country\n"
							+ "\t7: Phone\n"
							+ "\t8: Zip Code\n"
							+ "\t9. Save And Exit\n");
			choice = InputUtil.getIntValue();
			switch (choice) {
			case 1:
				System.out.print("Enter new First Name : ");
				fname = InputUtil.getStringValue();
				person.get(id).setFname(fname);
				break;
			case 2:
				System.out.print("Enter new Last Name : ");
				lname = InputUtil.getStringValue();
				person.get(id).setLname(lname);
				break;
			case 3:
				System.out.print("Enter new Street : ");
				street = InputUtil.getStringValue();
				person.get(id).setStreet(street);
				break;
			case 4:
				System.out.print("Enter new City : ");
				city = InputUtil.getStringValue();
				person.get(id).setCity(city);
				break;
			case 5:
				System.out.print("Enter new State : ");
				state = InputUtil.getStringValue();
				person.get(id).setState(state);
				break;
			case 6:
				System.out.print("Enter new Country : ");
				country = InputUtil.getStringValue();
				person.get(id).setCountry(country);
				break;
			case 7:
				System.out.print("Enter new Phone : ");
				phone = InputUtil.getStringValue();
				person.get(id).setPhone(phone);
				break;
			case 8:
				System.out.print("Enter new Zip Code : ");
				zip = InputUtil.getStringValue();
				person.get(id).setZip(zip);
				break;
			case 9: 
				WriteToCSV.writeFromEdit(person);
				i=1;
				break;
			default:
				System.out.println("Please Enter Valid Option");
			}
			System.out.println(person.get(id));
		}
	}
	
// SEARCH METHOD
	public void searchRecord() throws IOException
	{
		List<Person> person = getDataInList();
		Search.searchItem(person);
	}
	
//	DELETE METHOD
	public void deleteRecord() throws IOException
	{
		final List<Person> person = getDataInList();
		int id;
		for(Person p: person)
		{	
			System.out.println("ID: #"+person.indexOf(p)+" : "+p);			
		}
		System.out.print("\nEnter #ID to delete Contact : ");
		id = InputUtil.getIntValue();
		person.remove(id);
		WriteToCSV.writeFromDelete(person);	
		
	}
	
//	SORT METHOD
	public void sortRecord() throws IOException
	{
		List<Person> person = getDataInList();
		System.out.println("Sort By...\n"
						+ "1: First Name\n"
						+ "2: Zip Code");
		int choice = InputUtil.getIntValue();
		switch (choice) 
		{
		case 1:
			Sort.sortByName(person);
			break;
		case 2 :
			Sort.sortByZip(person);
			break;
		default:
			System.out.println("Please Enter Valid Option...");
		}
	}
	
}
