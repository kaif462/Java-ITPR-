package com.knmodicollege.collegemanagement.controller;

import java.util.Scanner;

import com.knmodicollege.collegemanagement.model.Faculty;
import com.knmodicollege.collegemanagement.service.FacultyService;
import com.knmodicollege.collegemanagement.service.impl.FacultyServiceImpl;

public class FacultyController 
{
	private FacultyService facultyService;
	
	//constructor
	public FacultyController()
	{
		//to initailize service
		facultyService = new FacultyServiceImpl();
	}
	
	//user interface for registration of new faculty
	public void registerFacultyUI()
	{
		Scanner sc = new Scanner(System.in);
		
		//input of faculty data
		System.out.print("Enter Faculty Id (e.g., FAC101) : ");
		String facultyId = sc.nextLine();
		
		System.out.print("Enter Faculty Name : ");
		String facultyName = sc.nextLine();
		
		System.out.print("Enter Qualification : ");
		String qualification = sc.nextLine();
		
		System.out.print("Enter Status (e.g., Active/Inactive) : ");
		String status = sc.nextLine();
		
		//closing scanner
		sc.close();
		
		//calling register method
		facultyService.registerFaculty(
				new Faculty(facultyId, facultyName, qualification, status)
		);
	}
}
