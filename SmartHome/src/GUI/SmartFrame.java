package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class SmartFrame extends JFrame
{
	//Sets the size of the entire window
	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 400;
	
	
	private JLabel title;
	private ActionListener listener;
	private JButton lockButton;
	private JButton lightButton;
	private JButton userButton;
	
	public SmartFrame()
	{	
		
//		title = new JLabel(workspace);
//		title.setHorizontalAlignment(getWidth());
//		add(title, BorderLayout.CENTER);
		
		//This listener is shared among all components
		JPanel display = new JPanel();
		display.setBorder(new TitledBorder(new EtchedBorder()));
		add(display, BorderLayout.CENTER);
		listener = new ChoiceListener();
		
		createControlPanel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Smart House");
		setVisible(true);
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		
	}
	
	public void createControlPanel()
	{
		JButton userPanel = createUserBox();
		JButton lightsPanel = createLightsBox();
		JButton locksPanel = createLocksBox();
		
		//Line up component panels
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(3,1));
		controlPanel.add(userPanel);
		controlPanel.add(lightsPanel);
		controlPanel.add(locksPanel);
		controlPanel.setBorder(new TitledBorder(new EtchedBorder(), "Smart Choices"));
		add(controlPanel, BorderLayout.SOUTH);
	}

	public JButton createLocksBox() {
		JButton button = new JButton("Locks");
		button.setBackground(new Color(21,99,45));
		button.addActionListener(listener);
		return button;
	}

	public JButton createLightsBox() {
		JButton button = new JButton("Lights");
		button.setBackground(new Color(21,99,45));
		button.addActionListener(listener);
		return button;
	}

	public JButton createUserBox() {
		JButton button = new JButton("User");
		button.setBackground(new Color(21,99,45));
		button.addActionListener(listener);
		return button;
	}
}
