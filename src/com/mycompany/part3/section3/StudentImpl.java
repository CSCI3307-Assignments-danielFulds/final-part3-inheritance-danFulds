package com.mycompany.part3.section3;
/**
 * 
 */


/**
 * @author Dan Fulds
 *
 */
public class StudentImpl extends PersonBaseImpl implements Student
{
	String takenCourseTitle;
	
	StudentImpl(String _name, String _takenCourseTitle) 
	{
		super(_name);
		name = _name;
		takenCourseTitle = _takenCourseTitle;
	}

	public String studiesFor() 
	{
		return takenCourseTitle;
	}

	public String getDetails() 
	{
		return "Student";
	}

}
