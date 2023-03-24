import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

class Col extends JFrame implements ActionListener
{
	JPanel panel = new JPanel();

	JTextField id = new JTextField();
	JTextField name = new JTextField();
	JTextField desc = new JTextField();
	JTextField status = new JTextField();

	JLabel adhar_lbl = new JLabel("Adhar Card No. : ");
	JLabel birth_lbl = new JLabel("Birth Year : ");
	JLabel mob_lbl = new JLabel("Mobile No. : ");
	JLabel hos_lbl = new JLabel("Select Hospital : ");
	JLabel age_lbl = new JLabel("Age Group : ");
	JLabel vac_lbl = new JLabel("Vaccines : ");
	JLabel time_lbl = new JLabel("Time Slot : ");
	JLabel title_lbl = new JLabel("CoWin Registration");

	JButton add_btn = new JButton("Add");
	JButton view_btn = new JButton("View");
	JButton update_btn = new JButton("Update");
	JButton delete_btn = new JButton("Delete");
	JButton search_btn = new JButton("Search");

	JRadioButton rb1 = new JRadioButton("18 & above");
	JRadioButton rb2 = new JRadioButton("45 & above");
	JRadioButton rb3 = new JRadioButton("Covishield");
	JRadioButton rb4 = new JRadioButton("Covaxin");
	JRadioButton rb5 = new JRadioButton("Sputnik V");
	JRadioButton rb6 = new JRadioButton("Morning");
	JRadioButton rb7 = new JRadioButton("Afternoon");
	JRadioButton rb8 = new JRadioButton("Evening");

	ButtonGroup g1 = new ButtonGroup();
	ButtonGroup g2 = new ButtonGroup();
	ButtonGroup g3 = new ButtonGroup();

	Connection conn = null;
	PreparedStatement ps = null;

	Col() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		setSize(800, 700);
		setTitle("Java Project Program");
		// setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);

		panel.setPreferredSize(new Dimension(700, 600));
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);

		id.setBounds(190, 70, 250, 40);
		panel.add(id);
		name.setBounds(190, 130, 250, 40);
		panel.add(name);
		desc.setBounds(190, 190, 250, 40);
		panel.add(desc);
		status.setBounds(190, 250, 250, 40);
		panel.add(status);

		adhar_lbl.setBounds(30, 70, 250, 40);
		panel.add(adhar_lbl);
		birth_lbl.setBounds(30, 130, 250, 40);
		panel.add(birth_lbl);
		mob_lbl.setBounds(30, 190, 250, 40);
		panel.add(mob_lbl);
		hos_lbl.setBounds(30, 250, 250, 40);
		panel.add(hos_lbl);
		age_lbl.setBounds(30, 310, 250, 40);
		panel.add(age_lbl);
		vac_lbl.setBounds(30, 370, 250, 40);
		panel.add(vac_lbl);
		time_lbl.setBounds(30, 430, 250, 40);
		panel.add(time_lbl);

		title_lbl.setBounds(280, 0, 200, 100);
		panel.add(title_lbl);

		add_btn.setBounds(190, 500, 100, 40);
		panel.add(add_btn);
		update_btn.setBounds(290, 500, 100, 40);
		panel.add(update_btn);
		delete_btn.setBounds(390, 500, 100, 40);
		panel.add(delete_btn);
		view_btn.setBounds(490, 500, 100, 40);
		panel.add(view_btn);
		search_btn.setBounds(590, 500, 100, 40);
		panel.add(search_btn);

		rb1.setBounds(190, 320, 150, 20);
		panel.add(rb1);
		rb2.setBounds(340, 320, 150, 20);
		panel.add(rb2);

		rb3.setBounds(190, 380, 100, 20);
		panel.add(rb3);
		rb4.setBounds(290, 380, 100, 20);
		panel.add(rb4);
		rb5.setBounds(390, 380, 100, 20);
		panel.add(rb5);

		rb6.setBounds(190, 430, 100, 20);
		panel.add(rb6);
		rb7.setBounds(290, 430, 100, 20);
		panel.add(rb7);
		rb8.setBounds(390, 430, 100, 20);
		panel.add(rb8);

		g1.add(rb1);
		g1.add(rb2);
		g2.add(rb3);
		g2.add(rb4);
		g2.add(rb5);
		g3.add(rb6);
		g3.add(rb7);
		g3.add(rb8);

		// insert_btn.addActionListener(this);
		// display_btn.addActionListener(this);

		this.add(panel);
		this.pack();
		setVisible(true);

		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mansidb","root","root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		if(ae.getSource()==add_btn)
		{
			String  age1 = null , hosp1 , vaccine1 = null , time1 = null;
			int year = Integer.parseInt(name.getText());
			int adhar1 = Integer.parseInt(id.getText());
			int mob1 = Integer.parseInt(desc.getText());
			hosp1 = status.getText();

			if(rb1.isSelected())
			{
				age1 = rb1.getText();
			}
			else
			{
				age1 = rb2.getText();
			}

			if(rb3.isSelected())
			{
				vaccine1 = rb3.getText();
			}
			else if(rb4.isSelected())
			{
				vaccine1 = rb4.getText();
			}
			else
			{
				vaccine1 = rb5.getText();
			}

			if(rb6.isSelected())
			{
				time1 = rb6.getText();
			}
			else if(rb7.isSelected())
			{
				time1 = rb7.getText();
			}
			else
			{
				time1 = rb8.getText();
			}

			try{
				ps = conn.prepareStatement("insert into cowin values(?,?,?,?,?,?,?)");
				ps.setInt(1,adhar1);
				ps.setInt(2,year);
				ps.setInt(3,mob1);
				ps.setString(4,hosp1);
				ps.setString(5,age1);
				ps.setString(6,vaccine1);
				ps.setString(7,time1);

				int ans = ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Inserted Succesfully");
				System.out.println("record inserted"+ans);
				ps.close();
				conn.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String args[]) {
		Col PFrame = new Col();

	}
}
