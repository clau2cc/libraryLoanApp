/**
* Program Name: 	AddBook.java
* Purpose: 
* Coder: 			Claudia Gonzalez Abrahantes, 0744163
* Date: 			Aug 2, 2016
*/
package Views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Repository.*;
import Models.*;

public class AddBook extends JPanel
{
	public AddBook()
	{
		super(new GridLayout(3,1));
		
		//create panel for user data entry
		JPanel dataPanel = new JPanel();
		dataPanel.setLayout(new GridLayout(5, 2));
		this.add(dataPanel);
				
		//create panel for button
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout() );
		this.add(btnPanel);
		
		JPanel resultPanel = new JPanel();
		this.add(resultPanel);
		
		//create components to add to center panel
		JLabel titleLbl = new JLabel("Enter Book Title: ");
		JLabel isbnLbl = new JLabel("Enter Book ISBN: ");
		JLabel editionLbl = new JLabel("Enter Book Edition: ");
		JLabel subjectLbl = new JLabel("Enter Book Subject: ");
		JLabel availabiltyLbl = new JLabel("Book Available?: ");
			
		JTextField titleTxt =  new JTextField();
		JTextField isbnTxt =  new JTextField();
		JTextField editionTxt =  new JTextField();
		JTextField subjectTxt =  new JTextField();
		
		/**FIX SO ONLY ONE IS SELECTED AT A TIME***/
		JRadioButton trueRbt = new JRadioButton("Yes", true);
		JRadioButton falseRbt = new JRadioButton("No");
				
		JPanel availabilityPanel = new JPanel();
		availabilityPanel.setLayout(new FlowLayout() );
		
		
		dataPanel.add(titleLbl);
		dataPanel.add(titleTxt);
		dataPanel.add(isbnLbl);
		dataPanel.add(isbnTxt);
		dataPanel.add(editionLbl);
		dataPanel.add(editionTxt);
		dataPanel.add(subjectLbl);
		dataPanel.add(subjectTxt);
		dataPanel.add(availabiltyLbl);
		dataPanel.add(availabilityPanel);
		
		availabilityPanel.add(trueRbt);
		availabilityPanel.add(falseRbt);
				
		JButton addBookBtn = new JButton("Add Book");
				
		btnPanel.add(addBookBtn);
		
		addBookBtn.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Book b = new Book();
				b.setTitle(titleTxt.getText());
				b.setIsbn(isbnTxt.getText());
				b.setEditionNumber(editionTxt.getText());
				b.setSubject(isbnTxt.getText());
				
				if(trueRbt.isSelected())
					b.setAvailable(1);
				else if(falseRbt.isSelected())
					b.setAvailable(0);
				
				MySqlRepository rep = new MySqlRepository();
				int result = rep.AddBook(b);
				
				/***CHANGE THIS LATER***/
				if(result == 1)
					System.out.println("Success");
				else
					System.out.println("NO Success");
				
				titleTxt.setText("");
				isbnTxt.setText("");
				editionTxt.setText("");
				subjectTxt.setText("");
				
				
			}
		});
	}
}
//end class