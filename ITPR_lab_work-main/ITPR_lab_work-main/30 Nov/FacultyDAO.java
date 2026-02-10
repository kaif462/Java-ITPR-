package com.knmodicollege.collegemanagement.dao;

import java.util.ArrayList;
import com.knmodicollege.collegemanagement.model.Faculty;

public interface FacultyDAO {

	// method to insert new faculty data
	int save(Faculty facultyData);

	// method to update faculty status
	int updateFacultyStatus(String facultyId, String status);
	
	// method to update qualification
	int updateQualification(String facultyId, String qualification);

	// method to delete a faculty
	int delete(String facultyId);

	// method to fetch all faculty list
	ArrayList<Faculty> findAll();

	// method to fetch a particular faculty
	Faculty findByFacultyId(String facultyId);
}
