/**
* Program Name: 	Borrower.java
* Purpose: 
* Coder: 			Claudia Gonzalez Abrahantes, 0744163
* Date: 			Aug 1, 2016
*/
package Models;

public class Borrower
{
	private int borrowerID;
	private String lastName;
	private String firstName;
	private String emailAddress;
	
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
	/**
	* Method Name: getEmailAddress
	* Purpose:	Allows access to emailAddress
	* Parameters:	none
	* Returns:	String
	*/
	public String getEmailAddress()
	{
		return emailAddress;
	}
	/**
	* Method Name:	setEmailAddress
	* Purpose: Allows Mutation of emailAddress
	* Parameters:	String emailAddress
	* Returns:	void
	*/
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}
	/**
	* Method Name: getBorrowerID
	* Purpose:	Allows access to borrowerID
	* Parameters:	none
	* Returns:	int
	*/
	public int getBorrowerID()
	{
		return borrowerID;
	}
	
	
}
//end class