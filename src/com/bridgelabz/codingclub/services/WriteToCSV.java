package com.bridgelabz.codingclub.services;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.bridgelabz.codingclub.models.Person;

public class WriteToCSV {
	private static final String CSV_HEADER = "FNAME,LNAME,STREET,CITY,STATE,COUNTRY,PHONE,ZIP";
	public static void writeAddCSV(List<Person> person)
	{
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try
		{
			fileWriter = new FileWriter("address_book.csv",true);
			fileReader = new FileReader("address_book.csv");
			if((fileReader.read()) != 0)
			{				
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
			}
			catch(IOException e)
			{
				System.out.println("Flushing/Closing error!!!");
				e.printStackTrace();
			}
		}
	}
	public static void writeFromDelete(List<Person> person)
	{
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try
		{
			fileWriter = new FileWriter("address_book.csv");
			fileReader = new FileReader("address_book.csv");
			if((fileReader.read()) != 0)
			{				
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
			}
			catch(IOException e)
			{
				System.out.println("Flushing/Closing error!!!");
				e.printStackTrace();
			}
		}
	}
	
	public static void writeFromEdit(List<Person> person)
	{
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try
		{
			fileWriter = new FileWriter("address_book.csv");
			fileReader = new FileReader("address_book.csv");
			if((fileReader.read()) != 0)
			{				
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
			}
			catch(IOException e)
			{
				System.out.println("Flushing/Closing error!!!");
				e.printStackTrace();
			}
		}
	}


}
