package com.mycompany.part3.section3;
/**
 * 
 */


/**
 * @author Dan Fulds
 *
 */
public class MainEntry 
{
	public static void main(String[] args) 
	{
		Person p1, p2;
		Teacher t = new TeacherImpl("ilker", "java");
		Student s = new StudentImpl("Dan", "java");
		p1 = t;
		p2 = s;
		System.out.println("p1 = " + p1.getName() + ", " + p1.getDetails());
		System.out.println("p2 = " + p2.getName() + ", " + p2.getDetails());
	}

}
