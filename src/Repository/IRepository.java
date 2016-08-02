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
	public int AddAuthor(Author author);
	public int AddBook(Book book);
	public void AddBorrower(Borrower borrower);
	public void BookLoan(BookLoan bookLoan);
	public List<Book> GetAllBooks();
	public List<Book> GetBooksByStatus(boolean status);
	public List<Book> GetBooksBySubject(String subject);
	public List<Borrower> GetAllBorrowers();
	public List<Borrower> GetBorrowersByStatus(boolean status);
	public List<BookLoan> GetAllLoans();
}
