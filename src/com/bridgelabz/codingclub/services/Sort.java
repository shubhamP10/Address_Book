package com.bridgelabz.codingclub.services;
import java.util.Collections;
import java.util.List;

import com.bridgelabz.codingclub.models.Person;

public class Sort 
{
	public static void sortByZip(List<Person> person)
	{
		Collections.sort(person, Person.zipCodeSorting);
		for(Person p: person)
		{
			System.out.println(p);
		}
	}
	
	public static void sortByName(List<Person> person)
	{
		Collections.sort(person, Person.firstNameSorting);
		for(Person p: person)
		{
			System.out.println(p);
		}
	}
}
