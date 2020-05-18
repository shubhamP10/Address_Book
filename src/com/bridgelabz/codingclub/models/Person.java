package com.bridgelabz.codingclub.models;

import java.util.Comparator;

public class Person 
{
	private String fname, lname, street, city, state, country, phone,zip;
	
	public Person(String fname, String lname, String street, String city, String state, String country, String phone, String zip)
	{
		this.fname = fname;
		this.lname = lname;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone = phone;
		this.zip = zip;
	}
	
	public String getFname()
	{
		return fname;
	}
	
	public void setFname(String fname)
	{
		this.fname = fname;
	}
	
	public String getLname()
	{
		return lname;
	}
	
	public void setLname(String lname)
	{
		this.fname = lname;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public String getZip()
	{
		return zip;
	}
	
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	
	// Sort By Zip Code 
	public static Comparator<Person> zipCodeSorting = new Comparator<Person>() {
		
		
		@Override
		public int compare(Person p1, Person p2) 
		{
			String zip1 = p1.getZip();
			String zip2 = p2.getZip();
			// ascending order
			return zip1.compareTo(zip2);
		}
	};
	
	// Sort By First Name 
	public static Comparator<Person> firstNameSorting = new Comparator<Person>() {
		
		
		@Override
		public int compare(Person p1, Person p2) 
		{
			String fname1 = p1.getFname();
			String fname2 = p2.getFname();
			// ascending order
			return fname2.compareTo(fname1);
		}
	};
	
	@Override
	public String toString() {
		return "Person [ fname=" + fname + "   lname=" + lname + "   street=" + street + "   city=" + city + "   state="
				+ state + "   country=" + country + "   phone=" + phone + "   zip=" + zip + " ]";
	}
	
}
