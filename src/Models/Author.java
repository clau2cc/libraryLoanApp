/**
* Program Name: 	Author.java
* Purpose: 
* Coder: 			Claudia Gonzalez Abrahantes, 0744163
* Date: 			Aug 1, 2016
*/
package Models;


public class Author
{
	private int authorID;
	private String lastName;
	private String firstName;
	
	/**
	* Method Name: getAuthorID
	* Purpose:	Allows access to authorID
	* Parameters:	none
	* Returns:	int
	*/
	public int getAuthorID()
	{
		return authorID;
	}
	
	/**
	* Method Name: getLastName
	* Purpose:	Allows access to lastName
	* Parameters:	none
	* Returns:	String
	*/
	public String getLastName()
	{
		return lastName;
	}
	/**
	* Method Name:	setLastName
	* Purpose: Allows Mutation of lastName
	* Parameters:	String lastName
	* Returns:	void
	*/
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	/**
	* Method Name: getFirstName
	* Purpose:	Allows access to firstName
	* Parameters:	none
	* Returns:	String
	*/
	public String getFirstName()
	{
		return firstName;
	}
	/**
	* Method Name:	setFirstName
	* Purpose: Allows Mutation of firstName
	* Parameters:	String firstName
	* Returns:	void
	*/
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
}
//end class