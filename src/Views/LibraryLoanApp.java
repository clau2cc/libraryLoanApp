/**
* Program Name: 	Panels.java
* Purpose: 
* Coder: 			Claudia Gonzalez Abrahantes, 0744163
* Date: 			Aug 1, 2016
*/
package Views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LibraryLoanApp extends JFrame
{
	//Declare instance fields (GUI object references)	
	private JPanel addAuthorPanel, addBookPanel;
	
	
	public LibraryLoanApp()
	{
		//Call to superclass constructor
		super("Library Loan Application");
			
		//boilerplate
		//this.setLayout(new FlowLayout());
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		
		JTabbedPane tPane = new JTabbedPane();
		
		tPane.add("Add Author", new AddAuthor());
		tPane.add("Add Book", new AddBook());
		//builAddBook();
			
		//Add the panels to the frame
		this.add(tPane);
	//	this.add(addBookPanel);	
		
		setVisible(true);			
	}
	
	public static void main(String[] args)
	{
		new LibraryLoanApp();

	}
	//end main
}
//end class