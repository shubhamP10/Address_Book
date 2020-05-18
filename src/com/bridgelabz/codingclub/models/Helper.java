package com.bridgelabz.codingclub.models;
import com.bridgelabz.codingclub.utils.InputUtil;
import com.bridgelabz.codingclub.services.Search;
import com.bridgelabz.codingclub.services.Sort;

import java.io.FileWriter;
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
	private static final String CSV_HEADER = "FNAME,LNAME,STREET,CITY,STATE,COUNTRY,PHONE,ZIP";
	
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
	}
	
	
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
		
//		id = IdGenertor.generateId();
		List<Person> person = Arrays.asList(
				new Person(fname,lname,street,city,state,country,phone,zip)
				); 
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try
		{
			fileWriter = new FileWriter("address_book.csv",true);
			fileReader = new FileReader("address_book.csv");
			if((fileReader.read()) != 0)
			{
//				fileWriter.append(CSV_HEADER);
//				fileWriter.append("\n");
				
				
				for(Person p: person)
				{
					fileWriter.append(p.getFname());
					fileWriter.append(",");
					fileWriter.append(p.getLname());
					fileWriter.append(",");
					fileWriter.append(p.getStreet());
					fileWriter.append(",");
					fileWriter.append(p.getCity());
					fileWriter.append(",");
					fileWriter.append(p.getState());
					fileWriter.append(",");
					fileWriter.append(p.getCountry());
					fileWriter.append(",");
					fileWriter.append(p.getPhone());
					fileWriter.append(",");
					fileWriter.append(p.getZip());
					fileWriter.append("\n");
				}
			}
			else
			{
				fileWriter.append(CSV_HEADER);
				fileWriter.append("\n");
				
				
				for(Person p: person)
				{
					fileWriter.append(p.getFname());
					fileWriter.append(",");
					fileWriter.append(p.getLname());
					fileWriter.append(",");
					fileWriter.append(p.getStreet());
					fileWriter.append(",");
					fileWriter.append(p.getCity());
					fileWriter.append(",");
					fileWriter.append(p.getState());
					fileWriter.append(",");
					fileWriter.append(p.getCountry());
					fileWriter.append(",");
					fileWriter.append(p.getPhone());
					fileWriter.append(",");
					fileWriter.append(p.getZip());
					fileWriter.append("\n");
				}
			}
			System.out.println("...Data Added...");
		}
		catch(IOException e)
		{
			System.out.println("Writing CSV error!!!");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fileWriter.flush();
				fileWriter.close();
				fileReader.close();
			}
			catch(IOException e)
			{
				System.out.println("Flushing/Closing error!!!");
				e.printStackTrace();
			}
		}
		
		return;
		
	}
	public void displayRecord() throws IOException
	{
		List<Person> person = getDataInList();
		for(Person p: person)
		{
			System.out.println(p);
		}
		
	}
	
	public void editRecord() throws IOException
	{
		
	}
	
	public void searchRecord() throws IOException
	{
		List<Person> person = getDataInList();
		Search.searchItem(person);
	}
	
	public void deleteRecord() throws IOException
	{
		
	}
	
	public void sortRecord() throws IOException
	{
		List<Person> person = getDataInList();
		System.out.println("Sort By...\n"
						+ "1. First Name\n"
						+ "2. Zip Code");
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
