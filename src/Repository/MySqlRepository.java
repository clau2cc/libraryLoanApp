package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.table.TableModel;

import Models.*;

/**
 * Coder: Kyle Howley
 * Program Name: MySqlRepository.java
 * Purpose: 
 * Date: Aug 1, 2016
 */

/**
 *
 */
public class MySqlRepository implements IRepository
{
	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRslt = null;
	PreparedStatement myPrepStmt = null;
	
	String url = "jdbc:mysql://localhost:3306/info5051_books";
	String user = "root";
	String password = "password";
	
	/* (non-Javadoc)
	 * @see Repository.IRepository#AddAuthor(Models.Author)
	 */
	@Override
	public int AddAuthor(Author author)
	{
		int returnValue = 0;
		try
		{
		//create the Connection object
			myConn = DriverManager.getConnection(url,user,password);
								
			//create a Statement 
			myPrepStmt = myConn.prepareStatement("INSERT INTO author (Last_Name, First_Name) VALUES (? , ?)");
			
			//pass in the parameters needed by the myPrepStmt object.
			myPrepStmt.setString(1, author.getLastName());
			myPrepStmt.setString(2, author.getFirstName());
			
			returnValue = myPrepStmt.executeUpdate();
			
			return returnValue;
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught, message is " + ex.getMessage());
			ex.printStackTrace();
			return returnValue;
		}
		finally
		{
			//boilerplate clean-up code
			//CLose the objects in the reverse order that you created them
			try
			{
				if(myRslt != null)
				{
					myRslt.close();
				}
				if(myStmt != null)
				{
					myStmt.close();
				}
				if(myConn != null)
				{
					myConn.close();
				}
			}
			catch(SQLException ex)
			{
				System.out.println("SQLException caught, message is " + ex.getMessage() );
				ex.printStackTrace();
			}				
		
		}//end finally	
		
	}

	/* (non-Javadoc)
	 * @see Repository.IRepository#AddBook(Models.Book)
	 */
	@Override
	public int AddBook(Book book)
	{
		int returnValue = 0;
		try
		{
			//create the Connection object
			myConn = DriverManager.getConnection(url,user,password);
								
			//create a Statement 
			myPrepStmt = myConn.prepareStatement("INSERT INTO book (Title, ISBN, Edition_Number, Subject, Available) VALUES (? , ?, ?, ?, ?)");
			
			//pass in the parameters needed by the myPrepStmt object.
			myPrepStmt.setString(1, book.getTitle());
			myPrepStmt.setString(2, book.getIsbn());
			myPrepStmt.setString(3, book.getEditionNumber());
			myPrepStmt.setString(4, book.getSubject());
			myPrepStmt.setInt(5, book.getAvailable());
			
			returnValue = myPrepStmt.executeUpdate();
			
			return returnValue;
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught, message is " + ex.getMessage());
			ex.printStackTrace();
			return returnValue;
		}
		finally
		{
			//boilerplate clean-up code
			//CLose the objects in the reverse order that you created them
			try
			{
				if(myRslt != null)
				{
					myRslt.close();
				}
				if(myStmt != null)
				{
					myStmt.close();
				}
				if(myConn != null)
				{
					myConn.close();
				}
			}
			catch(SQLException ex)
			{
				System.out.println("SQLException caught, message is " + ex.getMessage() );
				ex.printStackTrace();
			}				
		
		}//end finally	
		
	}

	/* (non-Javadoc)
	 * @see Repository.IRepository#AddBorrower(Models.Borrower)
	 */
	@Override
	public void AddBorrower(Borrower borrower)
	{
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see Repository.IRepository#BookLoan(Models.BookLoan)
	 */
	@Override
	public void BookLoan(Models.BookLoan bookLoan)
	{
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see Repository.IRepository#GetAllBooks()
	 */
	@Override
	public List<Book> GetAllBooks()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Repository.IRepository#GetBooksByStatus(boolean)
	 */
	@Override
	public List<Book> GetBooksByStatus(boolean status)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Repository.IRepository#GetBooksBySubject(java.lang.String)
	 */
	@Override
	public List<Book> GetBooksBySubject(String subject)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Repository.IRepository#GetAllBorrowers()
	 */
	@Override
	public List<Borrower> GetAllBorrowers()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Repository.IRepository#GetBorrowersByStatus(boolean)
	 */
	@Override
	public List<Borrower> GetBorrowersByStatus(boolean status)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Repository.IRepository#GetAllLoans()
	 */
	@Override
	public List<Models.BookLoan> GetAllLoans()
	{
		// TODO Auto-generated method stub
		return null;
	}

	

}
