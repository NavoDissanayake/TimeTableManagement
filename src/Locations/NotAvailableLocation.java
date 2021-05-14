package Locations;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;

import DB.DbConnection;
import Home.Home;
import Lecturer.Add_Lecturer;
import Student.Manage_studentGroup;
import WorkingDays.AddWorkingdays;
import WorkingDays.ManageWorkingDays;
import net.proteanit.sql.DbUtils;

import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class NotAvailableLocation {

	private Image home_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/home.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image lec_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/lecturer.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image stu_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/student.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image sub_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/subject.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image session_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/session.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image tag_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/tags.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image location_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/location.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image st_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/statics.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image days_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/Wdays.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image time_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/time.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image adv_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/adv1.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image room_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/room.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	
	
	public JFrame frame;
	private JTable table;
	private JTextField start;
	private JTextField end;
	private JTextField date;
	private JTextField id;
	private JComboBox selectroom ;
	private JComboBox sessionsign ;
	private JTextField duration;
	private JSpinner starttime;
	private JSpinner endtime;
	
public void refreshtable() {
		
		try {
			
			Connection con = DbConnection.connect();
			
			String query="select *  from notavailableloc ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}


//fill select ROOM
  public void fillRoom() {
		
		try {
			
			 Connection con = DbConnection.connect();
			 
			 String query="select * from location";
			 
			 PreparedStatement pst = con.prepareStatement(query);
			 ResultSet rs = pst.executeQuery();
			 
			 while(rs.next()) {
				 
				 String name =rs.getString("roomName");
				 
				 selectroom.addItem(name);
			
				 
			}
			con.close();
		}
		
		catch(Exception e) {
			
				e.printStackTrace();
			}
		
     	}
  
  //fill session signature field
  public void fillsign() {
		
		try {
			
			 Connection con = DbConnection.connect();
			 
			 String query="select * from session";
			 
			 PreparedStatement pst = con.prepareStatement(query);
			 ResultSet rs = pst.executeQuery();
			 
			 while(rs.next()) {
				 
				 String name =rs.getString("sessionSignature");
				 
				 sessionsign.addItem(name);
				 
			}
			con.close();
		}
		
		catch(Exception e) {
			
				e.printStackTrace();
			}
		
     	}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotAvailableLocation window = new NotAvailableLocation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NotAvailableLocation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBackground(Color.YELLOW);
		frame.setResizable(false);
		frame.setTitle("Working Days & Hours");
		frame.setSize(1350, 728);
		frame.setBounds(0, 0, 1350, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Location Management");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(723, 13, 419, 29);
		panel.add(lblNewLabel_10);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 62, 262, 609);
		panel_1.setBackground(new Color(230, 230, 250));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					Add_Lecturer add_lecture = new Add_Lecturer();
					add_lecture.main(null);
					frame.dispose();
					
				}
			});
		btnLecturers.setForeground(Color.WHITE);
		btnLecturers.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLecturers.setBackground(new Color(0, 139, 139));
		btnLecturers.setBounds(0, 59, 264, 38);
		panel_1.add(btnLecturers);
		
		JButton btnStudents = new JButton("Students");
		btnStudents.setHorizontalAlignment(SwingConstants.LEFT);
		btnStudents.setIcon(new ImageIcon(stu_logo));
		btnLecturers.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Manage_studentGroup add_st = new Manage_studentGroup();
				add_st.main(null);
				frame.dispose();
				
			}
		});
		btnStudents.setForeground(Color.WHITE);
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStudents.setBackground(new Color(0, 139, 139));
		btnStudents.setBounds(0, 108, 264, 38);
		panel_1.add(btnStudents);
		
		JButton btnSubjects = new JButton("Subjects");
		btnSubjects.setHorizontalAlignment(SwingConstants.LEFT);
		btnSubjects.setIcon(new ImageIcon(sub_logo));
		btnSubjects.setForeground(Color.WHITE);
		btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubjects.setBackground(new Color(0, 139, 139));
		btnSubjects.setBounds(0, 157, 264, 38);
		panel_1.add(btnSubjects);
		
		JButton btnSessions = new JButton("Sessions");
		btnSessions.setHorizontalAlignment(SwingConstants.LEFT);
		btnSessions.setIcon(new ImageIcon(session_logo));
		btnSessions.setForeground(Color.WHITE);
		btnSessions.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSessions.setBackground(new Color(0, 139, 139));
		btnSessions.setBounds(0, 206, 264, 38);
		panel_1.add(btnSessions);
		
		JButton btnTags = new JButton("Tags");
		btnTags.setHorizontalAlignment(SwingConstants.LEFT);
		btnTags.setIcon(new ImageIcon(tag_logo));
		btnTags.setForeground(Color.WHITE);
		btnTags.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTags.setBackground(new Color(0, 139, 139));
		btnTags.setBounds(0, 255, 264, 38);
		panel_1.add(btnTags);
		
		JButton btnRooms = new JButton("Rooms");
		btnRooms.setHorizontalAlignment(SwingConstants.LEFT);
		btnRooms.setIcon(new ImageIcon(room_logo));
		btnRooms.setForeground(Color.WHITE);
		btnRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRooms.setBackground(new Color(0, 139, 139));
		btnRooms.setBounds(0, 304, 264, 38);
		panel_1.add(btnRooms);
		
		JButton btnWorkingDays = new JButton("Working days & Hours");
		btnWorkingDays.setHorizontalAlignment(SwingConstants.LEFT);
		btnWorkingDays.setIcon(new ImageIcon(days_logo));
		btnWorkingDays.setForeground(Color.WHITE);
		btnWorkingDays.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnWorkingDays.setBackground(new Color(0, 139, 139));
		btnWorkingDays.setBounds(0, 353, 264, 38);
		panel_1.add(btnWorkingDays);
		
		JButton btnLocations = new JButton("Locations");
		btnLocations.setHorizontalAlignment(SwingConstants.LEFT);
		btnLocations.setIcon(new ImageIcon(location_logo));
		btnLocations.setForeground(Color.WHITE);
		btnLocations.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLocations.setBackground(new Color(0, 139, 139));
		btnLocations.setBounds(0, 402, 264, 38);
		panel_1.add(btnLocations);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setHorizontalAlignment(SwingConstants.LEFT);
		btnStatistics.setIcon(new ImageIcon(st_logo));
		btnStatistics.setForeground(Color.WHITE);
		btnStatistics.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStatistics.setBackground(new Color(0, 139, 139));
		btnStatistics.setBounds(0, 451, 264, 38);
		panel_1.add(btnStatistics);
		
		JButton btnAdvanced = new JButton("Advanced");
		btnAdvanced.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdvanced.setIcon(new ImageIcon(adv_logo));
		btnAdvanced.setForeground(Color.WHITE);
		btnAdvanced.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdvanced.setBackground(new Color(0, 139, 139));
		btnAdvanced.setBounds(0, 500, 264, 38);
		panel_1.add(btnAdvanced);
		
		JButton btnTimetableGenerate = new JButton("Timetable Generate");
		btnTimetableGenerate.setHorizontalAlignment(SwingConstants.LEFT);
		btnTimetableGenerate.setIcon(new ImageIcon(time_logo));
		btnTimetableGenerate.setForeground(Color.WHITE);
		btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTimetableGenerate.setBackground(new Color(0, 139, 139));
		btnTimetableGenerate.setBounds(0, 549, 264, 38);
		panel_1.add(btnTimetableGenerate);
		
		
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.setBounds(0, 13, 262, 33);
		panel_1.add(btnManageGroups);
		btnManageGroups.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				new Home();
			}
		});
		btnManageGroups.setForeground(new Color(255, 255, 255));
		btnManageGroups.setBackground(new Color(0, 139, 139));
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(230, 230, 250));
		panel_3.setBounds(263, 62, 1081, 628);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(10, 50, 1082, 49);
		panel_3.add(panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Not Available Location Manage");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(406, 13, 436, 31);
		panel_6.add(lblNewLabel_1);


		
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(92, 104, 853, 315);
		panel_3.add(panel_4);

		
		//form
		
		id = new JTextField();
		id.setBounds(279, 11, 86, 20);
		panel_4.add(id);
		
		//select room
		JLabel lblSelectGroup = new JLabel("Select Room");
		lblSelectGroup.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSelectGroup.setBounds(108, 43, 91, 23);
		panel_4.add(lblSelectGroup);
		
		selectroom = new JComboBox();
		selectroom.setBounds(279, 42, 149, 22);
		selectroom.setModel(new DefaultComboBoxModel(new String[] {""}));
		panel_4.add(selectroom);
		fillRoom();
		
		//add date
		JLabel lblSelectSubGroup = new JLabel("Select Date");
		lblSelectSubGroup.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSelectSubGroup.setBounds(108, 93, 113, 23);
		panel_4.add(lblSelectSubGroup);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(279, 94, 149, 23);
		panel_4.add(date);
		
		
		//start Time
		start = new JTextField();
		start.setBounds(279, 183, 86, 20);
		panel_4.add(start);
		start.setColumns(10);
		
		JLabel lblStartTime = new JLabel("Start Time");
		lblStartTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStartTime.setBounds(108, 181, 91, 23);
		panel_4.add(lblStartTime);
		
		
		//End time
		end = new JTextField();
		end.setColumns(10);
		end.setBounds(279, 239, 86, 20);
		panel_4.add(end);
		
		JLabel lblEndTime = new JLabel("End Time");
		lblEndTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndTime.setBounds(108, 237, 57, 23);
		panel_4.add(lblEndTime);
		

				

		//add data
		JButton add = new JButton("ADD");
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String selectRoom = selectroom.getSelectedItem().toString();
				String sessionSign = sessionsign.getSelectedItem().toString();
				String selectDate = date.getText();
				String startTime = start.getText();	
				String endTime = end.getText();
				String startAMPM = starttime.getValue().toString();
				String endAMPM = endtime.getValue().toString();
			
            

					try {
							
						Connection con = DbConnection.connect();
						
				
						String query = "INSERT INTO notavailableloc values(null,'"+ selectRoom+"','"+ sessionSign + "','"+ selectDate + 
								"','"+ startTime +"','"+ startAMPM +"','"+ endTime +"','"+ endAMPM +"')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) 
	                    {
	                    	JLabel label = new JLabel("This is alredy exist");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	                    } 
	                    else
	                    {
							JLabel label = new JLabel("Not Availabale Location Entered Successfully");
							label.setHorizontalAlignment(SwingConstants.CENTER);
							JOptionPane.showMessageDialog(null, label);


							

						}refreshtable();
						con.close();
						
					} catch (Exception exception) {
						System.out.println("Failed!!");

					}

			}
		});
		add.setBounds(671, 57, 141, 31);
		panel_4.add(add);
		add.setForeground(Color.WHITE);
		add.setFont(new Font("Tahoma", Font.BOLD, 14));
		add.setEnabled(true);
		add.setBackground(new Color(0, 153, 153));
		
		
		//clear all fields
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				id.setText("");
				selectroom.setSelectedIndex(0);
				sessionsign.setSelectedIndex(0);
				date.setText("");
				start.setText("");
				end.setText("");
				starttime.setValue(null);
				endtime.setValue(null);
			
			}
		});
		btnClear.setBounds(671, 130, 141, 31);
		panel_4.add(btnClear);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setEnabled(true);
		btnClear.setBackground(new Color(0, 153, 153));
		

		starttime = new JSpinner();
		String[] ampmString = {"am", "pm"};
		starttime = new JSpinner( new SpinnerListModel(ampmString));
		starttime.setBounds(384, 183, 44, 20);
		panel_4.add(starttime);
		
		endtime = new JSpinner();
		String[] ampmString1 = {"am", "pm"};
		endtime = new JSpinner( new SpinnerListModel(ampmString1));
		endtime.setBounds(384, 239, 44, 20);
		panel_4.add(endtime);
		
		JLabel lblNewLabel = new JLabel("Session Signature");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(108, 140, 113, 14);
		panel_4.add(lblNewLabel);
		
		sessionsign = new JComboBox();
		sessionsign.setModel(new DefaultComboBoxModel(new String[] {""}));
		sessionsign.setBounds(279, 137, 149, 20);
		panel_4.add(sessionsign);
		fillsign() ;
		
		//update
		JButton Update = new JButton("UPDATE");
		Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				try {
					Connection con = DbConnection.connect();					
					String query="Update notavailableloc set selectRoom='"+selectroom.getSelectedItem()+ "',sessionSign='"+sessionsign.getSelectedItem()+"',selectDate='"+date.getText()+
					"',startTime='"+start.getText()+"',start='"+starttime.getValue()+"',endTime='"+end.getText()+"',end='"+endtime.getValue()+"'"
							+ " where locID='"+id.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					
					JLabel label = new JLabel("Your Data Has been Updated");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label);

					refreshtable();
					pst.close();
					
				}
				catch(Exception ea) {
					ea.printStackTrace();
				}
				
				
			}
		});
		Update.setForeground(Color.WHITE);
		Update.setFont(new Font("Tahoma", Font.BOLD, 14));
		Update.setEnabled(true);
		Update.setBackground(new Color(0, 153, 153));
		Update.setBounds(92, 549, 141, 31);
		panel_3.add(Update);
	
		
		
		//delete
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					
					Connection con = DbConnection.connect();
					String query="Delete from notavailableloc where locID='"+id.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted","Alert",JOptionPane.WARNING_MESSAGE);
				
					
					refreshtable();
					pst.close();
					
					}
					catch(Exception en) {
						en.printStackTrace();
						
					}
				
				
				
			}
		});
		delete.setForeground(Color.WHITE);
		delete.setFont(new Font("Tahoma", Font.BOLD, 14));
		delete.setEnabled(true);
		delete.setBackground(new Color(0, 153, 153));
		delete.setBounds(769, 549, 141, 31);
		panel_3.add(delete);

		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(0, 40, 1082, 31);
		panel_3.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(92, 430, 852, 111);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {


		@Override
		public void mouseClicked(MouseEvent arg0) {

			int selectedRow=table.getSelectedRow();
		
			
			id.setText(table.getValueAt(selectedRow, 0).toString());
			
			String combo = table.getValueAt(selectedRow, 1).toString(); 
			for(int j=0
					;j<selectroom.getItemCount();j++) {

				if(selectroom.getItemAt(j).toString().equalsIgnoreCase(combo)) {
					selectroom.setSelectedIndex(j); } }
			
			String combo1 = table.getValueAt(selectedRow, 2).toString(); 
			for(int j=0
					;j<sessionsign.getItemCount();j++) {

				if(sessionsign.getItemAt(j).toString().equalsIgnoreCase(combo1)) {
					sessionsign.setSelectedIndex(j); } }
			
			date.setText(table.getValueAt(selectedRow, 3).toString());
			start.setText(table.getValueAt(selectedRow, 4).toString());
			starttime.setValue(table.getValueAt(selectedRow, 5).toString());
			end.setText(table.getValueAt(selectedRow, 6).toString());
			endtime.setValue(table.getValueAt(selectedRow, 7).toString());
			  
		
	}
});

	scrollPane.setViewportView(table);
		try {
			
			
			Connection con = DbConnection.connect();
			 
			 
			String query="select * from notavailableloc ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
			refreshtable();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		scrollPane.setViewportView(table);
	
}
}
