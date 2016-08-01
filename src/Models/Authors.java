/**
* Program Name: 	Authors.java
* Purpose: 
* Coder: 			Claudia Gonzalez Abrahantes, 0744163
* Date: 			Aug 1, 2016
*/
package Models;

import java.util.*;

public class Authors
{
	private List<Author> authors;

	/**
	* Method Name: getAuthors
	* Purpose:	Allows access to authors
	* Parameters:	none
	* Returns:	List<Author>
	*/
	public List<Author> getAuthors()
	{
		return authors;
	}

	/**
	* Method Name:	setAuthors
	* Purpose: Allows Mutation of authors
	* Parameters:	List<Author> authors
	* Returns:	void
	*/
	public void setAuthors(List<Author> authors)
	{
		this.authors = authors;
	}
	
}
//end class