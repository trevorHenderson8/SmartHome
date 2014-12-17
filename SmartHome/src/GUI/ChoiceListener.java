package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class takes in the given button assignment and activates the respected function
 * 
 * @author twohyjr
 *
 */

public class ChoiceListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event) 
	{


		switch (event.getActionCommand()) 
		{
			case "Locks": 
				System.out.println("Locks");
				break;
			
			case "Lights":
				System.out.println("Lights");
				break;
			
			case "User":
				System.out.println("User");
				break;
		}

	}


}
