package com.mycompany.part3.section3;
/**
 * 
 */


/**
 * @author Dan Fulds
 *
 */
public abstract class PersonBaseImpl implements Person 
{
	public String name;
	
	PersonBaseImpl(String _name)
	{
		name = _name;
	}
	@Override
	public String getName()
	{
		return name;
	}
}
