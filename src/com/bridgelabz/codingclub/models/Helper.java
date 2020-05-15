package com.bridgelabz.codingclub.models;
import com.bridgelabz.codingclub.utils.InputUtil;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Helper 
{
	private static final int PERSON_ID = 0;
	private static final int PERSON_FNAME = 1;
	private static final int PERSON_LNAME = 2;
	private static final int PERSON_STREET = 3;
	private static final int PERSON_CITY = 4;
	private static final int PERSON_STATE = 5;
	private static final int PERSON_COUNTRY = 6;
	private static final int PERSON_PHONE = 7;
	private static final int PERSON_ZIP = 8;
	private static final String CSV_HEADER = "ID,FNAME,LNAME,STREET,CITY,STATE,COUNTRY,PHONE,ZIP";
	
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
				new Person("1",fname,lname,street,city,state,country,phone,zip)
				); 
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try
		{
			fileWriter = new FileWriter("address_book.csv");
			fileReader = new FileReader("address_book.csv");
			if((fileReader.read()) != 0)
			{
//				fileWriter.append(CSV_HEADER);
//				fileWriter.append("\n");
				
				
				for(Person p: person)
				{
					fileWriter.append(p.getId());
					fileWriter.append(",");
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
					fileWriter.append(p.getId());
					fileWriter.append(",");
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
		BufferedReader fileReader = null;
		
		try
		{
			List<Person> person = new ArrayList<Person>();
			String line = "";
			fileReader = new BufferedReader(new FileReader("address_book.csv"));
		
			while((line = fileReader.readLine()) != null)
			{
				String[] tokens = line.split(",");
				if(tokens.length > 0)
				{
					Person person1 = new Person(
							tokens[PERSON_ID],
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
			
			for(Person p: person)
			{
				System.out.println(p);
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
			fileReader.close();
			}
			catch (IOException e) {
				System.out.println("Closing File Reader error!!!");
				e.printStackTrace();
			}
		}
	}
}
