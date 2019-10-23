package attempt2;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JMenuBar;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.TextField;
import javax.swing.JTextPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Label;


public class guii {


	public static void main(String[] args) {
	      
	      JFrame f = new JFrame("My Proud database project");
	      f.getContentPane().setBackground(new Color(189, 183, 107));
	      
	      JPanel panel = new JPanel();
	      panel.setBackground(new Color(189, 183, 107));
	      f.getContentPane().add(panel, BorderLayout.CENTER);
	      
	      JLabel login = DefaultComponentFactory.getInstance().createLabel("You Chose To Login As Customer");
	      login.setVisible(false);
	      login.setEnabled(true);
	      panel.add(login);
	      
	      JLabel admin = DefaultComponentFactory.getInstance().createLabel("You Chose To Login As Admin");
	      admin.setVisible(false);
	      admin.setEnabled(true);
	      panel.add(admin);
	      
	      JLabel staff = DefaultComponentFactory.getInstance().createLabel("You Chose To Login As Staff");
	      staff.setVisible(false);
	      staff.setEnabled(true);
	      panel.add(staff);
	      
	      JLabel project = DefaultComponentFactory.getInstance().createLabel("About My Project");
	      project.setVisible(false);
	      project.setEnabled(true);
	      panel.add(project);
	      
	      JLabel academic = DefaultComponentFactory.getInstance().createLabel("My Academic Interest");
	      academic.setVisible(false);
	      panel.add(academic);
	      
	      JLabel myHobbie = DefaultComponentFactory.getInstance().createLabel("My Hobbies");
	      myHobbie.setVisible(false);
	      panel.add(myHobbie);
	      
	      JLabel logout =  DefaultComponentFactory.getInstance().createLabel("Logging out");
	      logout.setForeground(new Color(0, 0, 0));
	      logout.setVisible(false);
	      panel.add(logout);
	      f.setBackground(new Color(189, 183, 107));
	      f.setSize(763, 579);
	      f.setLocation(300,200);
	      
	      JMenuBar menuBar = new JMenuBar();
	      menuBar.setBackground(new Color(189, 183, 107));
	      f.setJMenuBar(menuBar);
	      
	      String[] user = {"Login","Admin", "Customer", "Staff"}; 
	      
	      JComboBox Login = new JComboBox(user);
	      Login.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		 String command = e.getActionCommand();
	      		 if(command.equals("admin"))
	      		 {
	 		      		admin.setVisible(true);
	      		 }
	      	}
	      });
	      Login.setSelectedIndex(3);
	      menuBar.add(Login);
	      
	      JButton about = new JButton("About My Project");
	      about.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		project.setVisible(true);
	      		logout.setVisible(false);
	      		myHobbie.setVisible(false);
	      		academic.setVisible(false);
	      	}
	      });
	      about.setBackground(new Color(189, 183, 107));
	      menuBar.add(about);
	      
	      JButton interest = new JButton("My Academic Interest");
	      interest.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		      	academic.setVisible(true);
		      	project.setVisible(false);
		      	logout.setVisible(false);
		      	myHobbie.setVisible(false);
		      	}
		      });
	      interest.setBackground(new Color(189, 183, 107));
	      menuBar.add(interest);
	      
	      JButton hobbies = new JButton("My Hobbies");
	      hobbies.setBackground(new Color(189, 183, 107));
	      hobbies.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	hobbies.setBackground(new Color(0,255,255));
		      	myHobbie.setVisible(true);
		      	project.setVisible(false);
		      	logout.setVisible(false);
		      	academic.setVisible(false);
		      	}
		      });
	      menuBar.add(hobbies);
	      
	      JButton Logout = new JButton("Logout");
	      Logout.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		      	logout.setVisible(true);
		      	project.setVisible(false);
		      	academic.setVisible(false);
		      	myHobbie.setVisible(false);
		      
		      	}
		      });
	      Logout.setBackground(new Color(189, 183, 107));
	      menuBar.add(Logout);
	      f.setVisible(true);
	
	}

//	public void actionPerformed(ActionEvent e) {
//		String command = e.getActionCommand();
//		if(command.equals("about"))
//		{
//			Project();
//		}
//		else if (command.equals("interest"))
//		{
//			Interest();
//		}
//		else if(command.equals("hobbies"))
//		{
//			Hobbies();
//		}
//		else if(command.equals("Logout"))
//		{
//			logout();
//		}
//	}
}
