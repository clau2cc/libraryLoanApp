/**
* Program Name: 	Books.java
* Purpose: 
* Coder: 			Claudia Gonzalez Abrahantes, 0744163
* Date: 			Aug 1, 2016
*/
package Models;

import java.util.*;

public class Books
{
	private List<Book> books;

	/**
	* Method Name: getBooks
	* Purpose:	Allows access to books
	* Parameters:	none
	* Returns:	List<Book>
	*/
	public List<Book> getBooks()
	{
		return books;
	}

	/**
	* Method Name:	setBooks
	* Purpose: Allows Mutation of books
	* Parameters:	List<Book> books
	* Returns:	void
	*/
	public void setBooks(List<Book> books)
	{
		this.books = books;
	}
	
}
//end class