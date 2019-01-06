package intro_to_array_lists;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	ArrayList<String> names = new ArrayList<String>();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	
	public static void main(String[] args)
	{
		GuestBook g = new GuestBook();
		g.createGUI();
	}
	
	public void createGUI()
	{
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Add Name");
		button2.setText("View Names");
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==button1)
		{
			String input = JOptionPane.showInputDialog("Enter the name of a guest");
			names.add(input);
		}
		else
		{
			String output = "";
			for(int i = 0; i < names.size(); i++)
				output += ("Guest #" + (i+1) + ": " + names.get(i) + "\n");
			
			JOptionPane.showMessageDialog(frame, output);
		}
		
	}
}
