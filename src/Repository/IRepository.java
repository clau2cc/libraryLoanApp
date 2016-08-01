package Repository;

import java.util.List;
import Models.*;

/**
 * Coder: Kyle Howley
 * Program Name: IRepository.java
 * Purpose: 
 * Date: Aug 1, 2016
 */

/**
 *
 */
public interface IRepository
{
	public void AddAuthor();
	public void AddBook();
	public void AddBorrower();
	public void BookLoan();
	public List<Book> GetAllBooks();
	public List<Book> GetBooksByStatus();
	public List<Book> GetBooksBySubject();
	public List<Borrower> GetAllBorrowers();
	public List<Borrower> GetBorrowersByStatus();
	public List<BookLoan> GetAllLoans();
}
