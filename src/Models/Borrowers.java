/**
* Program Name: 	Borrowers.java
* Purpose: 
* Coder: 			Claudia Gonzalez Abrahantes, 0744163
* Date: 			Aug 1, 2016
*/
package Models;

import java.util.*;

public class Borrowers
{
	private List<Borrower> borrowers;

	/**
	* Method Name: getBorrowers
	* Purpose:	Allows access to borrowers
	* Parameters:	none
	* Returns:	List<Borrower>
	*/
	public List<Borrower> getBorrowers()
	{
		return borrowers;
	}

	/**
	* Method Name:	setBorrowers
	* Purpose: Allows Mutation of borrowers
	* Parameters:	List<Borrower> borrowers
	* Returns:	void
	*/
	public void setBorrowers(List<Borrower> borrowers)
	{
		this.borrowers = borrowers;
	}
}
//end class