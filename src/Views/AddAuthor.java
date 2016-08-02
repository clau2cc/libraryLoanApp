/**
* Program Name: 	AddAuthor.java
* Purpose: 
* Coder: 			Claudia Gonzalez Abrahantes, 0744163
* Date: 			Aug 1, 2016
*/
package Views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Repository.*;
import Models.*;

public class AddAuthor extends JPanel
{
	JLabel outputLabel = new JLabel("");
	public AddAuthor() 
	{
		super(new GridLayout(3,1));
		
		//create panel for user data entry
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(2, 2));
		this.add(centerPanel);
		
		//create panel for button
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout() );
		this.add(btnPanel);
			
		//panel for result
		JPanel resultPanel = new JPanel();
		this.add(resultPanel);
	  resultPanel.add(outputLabel);
		
		//create components to add to center panel
		JLabel firstNameLbl = new JLabel("Enter Author First Name: ");
		JLabel lastNameLbl = new JLabel("Enter Author Last Name: ");
		
		JTextField firstNameTxt =  new JTextField();
		JTextField lastNameTxt =  new JTextField();
		
		centerPanel.add(firstNameLbl);
		centerPanel.add(firstNameTxt);
		centerPanel.add(lastNameLbl);
		centerPanel.add(lastNameTxt);
		
		JButton addAuthorBtn = new JButton("Add Author");
		btnPanel.add(addAuthorBtn);
		
		addAuthorBtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Author a = new Author();
				a.setFirstName(firstNameTxt.getText());
				a.setLastName(lastNameTxt.getText());
				
				MySqlRepository rep = new MySqlRepository();
				
				int result = rep.AddAuthor(a);
				
				
				if(result == 1)
					outputLabel.setText("Author inserted");
				
				else
					outputLabel.setText("Error");
				
				firstNameTxt.setText("");;
				lastNameTxt.setText("");
			}
		});
	}
	
}
//end class