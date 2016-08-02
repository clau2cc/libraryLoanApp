/**
 * Coder: Kyle Howley
 * Program Name: Book.java
 * Purpose: 
 * Date: Aug 1, 2016
 */

/** Purpose: Contains information of a book.
 * 	Date: 2016-08-01
 */
package Models;

public class Book
{
	private int bookID;
	private String title;
	private String isbn;
	
	/**this we should change so we don't need to do validation later. it should be a char,
	 *  in the db is a 3 three char field but according to bill's description 
	 *  is going to be just 1 or 2 or 3 so a char is going to work */
	private String editionNumber;
	private String subject;
	
	/**kyle i changed this because in the db is an int, mysql doesn't support boolean**/
	private int available;
	
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn()
	{
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	/**
	 * @return the editionNumber
	 */
	public String getEditionNumber()
	{
		return editionNumber;
	}
	/**
	 * @param editionNumber the editionNumber to set
	 */
	public void setEditionNumber(String editionNumber)
	{
		this.editionNumber = editionNumber;
	}
	/**
	 * @return the subject
	 */
	public String getSubject()
	{
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject)
	{
		this.subject = subject;
	}
	/**
	 * @return the available
	 */
	public int getAvailable()
	{
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(int av)
	{
		available = av;
	}
	/**
	 * @return the bookID
	 */
	public int getBookID()
	{
		return bookID;
	}
}
