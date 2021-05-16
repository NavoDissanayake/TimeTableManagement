/**
 * IT19207582
 * R.M.S.J Rathnayake
 * 
 */

package Locations;

import java.awt.Color;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.tools.DocumentationTool.Location;

import Advanced.Consecutive_sessions;
import DB.DbConnection;
import Home.Home;
import Lecturer.Add_Lecturer;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import Timetable.Lecturer;
import WorkingDays.AddWorkingdays;
import WorkingDays.ManageWorkingDays;
import net.proteanit.sql.DbUtils;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ManageLocations {
	
	private Image home_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/home.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image lec_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/lecturer.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image stu_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/student.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image sub_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/subject.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image session_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/session.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image tag_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/tags.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image location_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/location.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image st_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/statics.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image days_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/Wdays.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image time_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/time.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image adv_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/adv1.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image room_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/room.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/pp.png")).getImage().getScaledInstance(1000,1000,Image.SCALE_SMOOTH);

	private JFrame frmMangeLocationsGroup;
	private JTable ltable;
	private JTextField ltextField_2;
	private JTextField ltextField_3;
	private JTable ltable_1;
	private JTextField rName;
	private JTextField bName;
	private JTextField capacity;
	private JComboBox type;
	private JTable table;
	private JTable table_1;
	private JTextField locationId;
	private JTable table_2;
	
	
	public void refreshTable() {
		
		try {
			Connection con = DbConnection.connect();
			
			String query="select * from location ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table_2.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void taheader() {
		JTableHeader ltahead = table_2.getTableHeader();
		ltahead.setForeground(Color.WHITE);
		ltahead.setFont(new Font("Tahoma", Font.BOLD,14));
		ltahead.setBackground(new Color(	153, 153, 153));
		ltahead.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageLocations window = new ManageLocations();
					window.frmMangeLocationsGroup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageLocations() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMangeLocationsGroup = new JFrame();
		frmMangeLocationsGroup.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmMangeLocationsGroup.setBackground(Color.YELLOW);
		frmMangeLocationsGroup.setResizable(false);
		frmMangeLocationsGroup.setTitle("Time Table Management System");
		frmMangeLocationsGroup.setSize(1350, 728);
		frmMangeLocationsGroup.setBounds(0,0, 1350, 700);
		frmMangeLocationsGroup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMangeLocationsGroup.getContentPane().setLayout(null);
		frmMangeLocationsGroup.setIconImage(logo);
		
		frmMangeLocationsGroup.setLocationRelativeTo(null);
		frmMangeLocationsGroup.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frmMangeLocationsGroup.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Locations");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(723, 13, 179, 29);
		panel.add(lblNewLabel_10);
		/*
		 * //JLabel lblNewLabel = new JLabel("Time Table Management System");
		 * lblNewLabel.setBounds(261, 5, 822, 61); panel.add(lblNewLabel);
		 * lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		 * lblNewLabel.setForeground(Color.WHITE);
		 */
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 62, 262, 609);
		panel_1.setBackground(new Color(230, 230, 250));
		frmMangeLocationsGroup.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	//lecture button
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					
					frmMangeLocationsGroup.dispose();
					new  Add_Lecturer();
					
				}
			});
		
		btnLecturers.setForeground(Color.WHITE);
		btnLecturers.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLecturers.setBackground(new Color(0, 139, 139));
		btnLecturers.setBounds(0, 59, 264, 38);
		panel_1.add(btnLecturers);
		
		//Students
		
		JButton btnStudents = new JButton("Students");
		btnStudents.setHorizontalAlignment(SwingConstants.LEFT);
		btnStudents.setIcon(new ImageIcon(stu_logo));
        btnStudents.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frmMangeLocationsGroup.dispose();
				new Add_StudentGroup();
				
			}
		});
	
		
		btnStudents.setForeground(Color.WHITE);
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStudents.setBackground(new Color(0, 139, 139));
		btnStudents.setBounds(0, 108, 264, 38);
		panel_1.add(btnStudents);
		
		//Subjects
		JButton btnSubjects = new JButton("Subjects");
		btnSubjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmMangeLocationsGroup.dispose();
				new Add_Subjects();
				
			}
		});
		btnSubjects.setHorizontalAlignment(SwingConstants.LEFT);
		btnSubjects.setIcon(new ImageIcon(sub_logo));
		btnSubjects.setForeground(Color.WHITE);
		btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubjects.setBackground(new Color(0, 139, 139));
		btnSubjects.setBounds(0, 157, 264, 38);
		panel_1.add(btnSubjects);
		
		//session
		JButton btnSessions = new JButton("Sessions");
		btnSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Add_Session add_session= new Add_Session();
				//add_session.main(null);
				frmMangeLocationsGroup.dispose();
				new Add_Session();
				
			}
		});
		btnSessions.setHorizontalAlignment(SwingConstants.LEFT);
		btnSessions.setIcon(new ImageIcon(session_logo));
		btnSessions.setForeground(Color.WHITE);
		btnSessions.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSessions.setBackground(new Color(0, 139, 139));
		btnSessions.setBounds(0, 206, 264, 38);
		panel_1.add(btnSessions);
		
		//Tag
		JButton btnTags = new JButton("Tags");
		btnTags.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Add_Tags add_tag= new Add_Tags();
				//add_tag.main(null);
				frmMangeLocationsGroup.dispose();
				new Add_Tags();
				
			}
		});
		btnTags.setHorizontalAlignment(SwingConstants.LEFT);
		btnTags.setIcon(new ImageIcon(tag_logo));
		btnTags.setForeground(Color.WHITE);
		btnTags.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTags.setBackground(new Color(0, 139, 139));
		btnTags.setBounds(0, 255, 264, 38);
		panel_1.add(btnTags);
		
		//Room
		JButton btnRooms = new JButton("Rooms");
		btnRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//ManageSessionsRooms m_rooms= new ManageSessionsRooms ();
				//m_rooms.main(null);
				frmMangeLocationsGroup.dispose();
				new  ManageSessionsRooms();
				
			}
		});
		btnRooms.setHorizontalAlignment(SwingConstants.LEFT);
		btnRooms.setIcon(new ImageIcon(room_logo));
		btnRooms.setForeground(Color.WHITE);
		btnRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRooms.setBackground(new Color(0, 139, 139));
		btnRooms.setBounds(0, 304, 264, 38);
		panel_1.add(btnRooms);
		
		//working days
		JButton btnWorkingDays = new JButton("Working days & Hours");
		btnWorkingDays.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AddWorkingdays w_days= new 	AddWorkingdays();
				//w_days.main(null);
				frmMangeLocationsGroup.dispose();
				new AddWorkingdays();
				
			}
		});
		btnWorkingDays.setHorizontalAlignment(SwingConstants.LEFT);
		btnWorkingDays.setIcon(new ImageIcon(days_logo));
		btnWorkingDays.setForeground(Color.WHITE);
		btnWorkingDays.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnWorkingDays.setBackground(new Color(0, 139, 139));
		btnWorkingDays.setBounds(0, 353, 264, 38);
		panel_1.add(btnWorkingDays);
		
		//Location
		JButton btnLocations = new JButton("Locations");
		btnLocations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ManageLocations m_locations= new ManageLocations();
				//m_locations.main(null);
				frmMangeLocationsGroup.dispose();
				new ManageLocations();
				
				
			}
		});
		btnLocations.setHorizontalAlignment(SwingConstants.LEFT);
		btnLocations.setIcon(new ImageIcon(location_logo));
		btnLocations.setForeground(Color.WHITE);
		btnLocations.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLocations.setBackground(new Color(0, 139, 139));
		btnLocations.setBounds(0, 402, 264, 38);
		panel_1.add(btnLocations);
		
		//Statistics
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Statistics stat= new Statistics ();
				//stat.main(null);
				frmMangeLocationsGroup.dispose();
				new   Statistics();
				
			}
		});
		btnStatistics.setHorizontalAlignment(SwingConstants.LEFT);
		btnStatistics.setIcon(new ImageIcon(st_logo));
		btnStatistics.setForeground(Color.WHITE);
		btnStatistics.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStatistics.setBackground(new Color(0, 139, 139));
		btnStatistics.setBounds(0, 451, 264, 38);
		panel_1.add(btnStatistics);
		
		//Advanced
		JButton btnAdvanced = new JButton("Advanced");
		btnAdvanced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Consecutive_sessions a_session= new Consecutive_sessions ();
				//a_session.main(null);
				frmMangeLocationsGroup.dispose();
				new Consecutive_sessions();
				
				
			}
		});
		btnAdvanced.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdvanced.setIcon(new ImageIcon(adv_logo));
		btnAdvanced.setForeground(Color.WHITE);
		btnAdvanced.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdvanced.setBackground(new Color(0, 139, 139));
		btnAdvanced.setBounds(0, 500, 264, 38);
		panel_1.add(btnAdvanced);
		
		JButton btnTimetableGenerate = new JButton("Timetable Generate");
		btnTimetableGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMangeLocationsGroup.dispose();
				new Lecturer();
			}
		});
		btnTimetableGenerate.setHorizontalAlignment(SwingConstants.LEFT);
		btnTimetableGenerate.setIcon(new ImageIcon(time_logo));
		btnTimetableGenerate.setForeground(Color.WHITE);
		btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTimetableGenerate.setBackground(new Color(0, 139, 139));
		btnTimetableGenerate.setBounds(0, 549, 264, 38);
		panel_1.add(btnTimetableGenerate);
		
		//Home
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Home home = new Home();
				//home.main(null);
				frmMangeLocationsGroup.dispose();
				new Home();
				
				
			}
		});
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.setBounds(0, 13, 262, 33);
		panel_1.add(btnManageGroups);
		
		btnManageGroups.setForeground(new Color(255, 255, 255));
		btnManageGroups.setBackground(new Color(0, 139, 139));
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 108, 1082, 14);
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		frmMangeLocationsGroup.getContentPane().add(separator);
		
		JPanel lpanel_2 = new JPanel();
		lpanel_2.setBackground(new Color(230, 230, 250));
		lpanel_2.setBounds(262, 108, 1082, 556);
		frmMangeLocationsGroup.getContentPane().add(lpanel_2);
		lpanel_2.setLayout(null);
		
		
		JPanel lpanel_3 = new JPanel();
		lpanel_3.setBounds(105, 82, 882, 448);
		lpanel_2.add(lpanel_3);
		lpanel_3.setLayout(null);
		
		JLabel loclblNewLabel = new JLabel("Building Name");
		loclblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		loclblNewLabel.setBounds(41, 83, 85, 16);
		lpanel_3.add(loclblNewLabel);
		
		JLabel loclblNewLabel_2 = new JLabel("Room Name");
		loclblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		loclblNewLabel_2.setBounds(41, 136, 74, 16);
		lpanel_3.add(loclblNewLabel_2);
		
		JLabel loclblNewLabel_3 = new JLabel("Room Type");
		loclblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		loclblNewLabel_3.setBounds(41, 197, 85, 16);
		lpanel_3.add(loclblNewLabel_3);
		
		JLabel loclblNewLabel_4 = new JLabel("Capacity");
		loclblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		loclblNewLabel_4.setBounds(41, 259, 59, 13);
		lpanel_3.add(loclblNewLabel_4);
	//insert location	
		JButton lbtnAddButton = new JButton("ADD");
		lbtnAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String buildName=bName.getText().toString();
				String roomName=rName.getText().toString();
				String roomtype=type.getSelectedItem().toString();
				String rcapacity=capacity.getText().toString();
				
				try {
					Connection con = DbConnection.connect();
					
					String query = "INSERT INTO location values (null,'"+buildName+"','"+roomName+"','"+roomtype+"','"+rcapacity+"')";
					Statement sta = con.createStatement();
					int x = sta.executeUpdate(query);
					if(x==0) {
						JLabel label = new JLabel("This is alredy exist");
    					label.setHorizontalAlignment(SwingConstants.CENTER);
    					JOptionPane.showMessageDialog(null, label);
					}else {
    						JLabel label = new JLabel("Inserted Group Details Sucessfully");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	    					
    					}
						refreshTable();
    					con.close();
					
				}catch(Exception exception) {
					System.out.println("xxxxxxxxxxxxxxxxx");
					
				}
				if(bName.getText().isEmpty() || rName.getText().isEmpty() || capacity.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Please Enter all fields");
					
				}
				
			
			
			}
		});
		lbtnAddButton.setForeground(new Color(255, 255, 255)); 
		lbtnAddButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbtnAddButton.setBackground(new Color(0, 139, 139));
		lbtnAddButton.setBounds(41, 322, 105, 31);
		lpanel_3.add(lbtnAddButton);
		
		//update location
		JButton lbtnEditButton_1 = new JButton("EDIT"); 
		lbtnEditButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection con = DbConnection.connect();					
					String query="Update location set buildingName='"+bName.getText()+"',roomName='"+rName.getText()+"',type='"+type.getSelectedItem()+"',capacity='"+capacity.getText()+"' where locationID='"+locationId.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					
					JLabel label = new JLabel("Suceesfully Updated");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label);
					//JOptionPane.showMessageDialog(null, "Data Updated");
					refreshTable();
					pst.close();
					
				}
				catch(Exception ea) {
					ea.printStackTrace();
				}
				if(bName.getText().isEmpty() || rName.getText().isEmpty() || capacity.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Please Enter all fields");
					
				}
			}
		});
		lbtnEditButton_1.setForeground(new Color(255, 255, 255));
		lbtnEditButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbtnEditButton_1.setBackground(new Color(0, 139, 139));
		lbtnEditButton_1.setBounds(195, 322, 105, 31);
		lpanel_3.add(lbtnEditButton_1);
		
		//delete
		JButton lbtnDelButton_2 = new JButton("DELETE");
		lbtnDelButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					
					Connection con = DbConnection.connect();
					String query="Delete from location where locationID='"+locationId.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
					JLabel label = new JLabel("Suceesfully Deleted");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label);
					
					//JOptionPane.showMessageDialog(null, "Data Deleted");
					refreshTable();
					pst.close();
					
					}
					catch(Exception en) {
						en.printStackTrace();
						
					}
				
			}
		});
		lbtnDelButton_2.setForeground(new Color(255, 255, 255));
		lbtnDelButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbtnDelButton_2.setBackground(new Color(0, 139, 139));
		lbtnDelButton_2.setBounds(41, 382, 105, 31);
		lpanel_3.add(lbtnDelButton_2);
		
		//clear
		JButton lbtnclrButton_3 = new JButton("CLEAR");
		lbtnclrButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bName.setText("");
				rName.setText("");
				type.setSelectedIndex(0);
				capacity.setText("");
				
				
			}
		});
		lbtnclrButton_3.setForeground(new Color(255, 255, 255));
		lbtnclrButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbtnclrButton_3.setBackground(new Color(0, 139, 139));
		lbtnclrButton_3.setBounds(195, 382, 105, 31);
		lpanel_3.add(lbtnclrButton_3);
		

		locationId = new JTextField();
		locationId.setEnabled(false);
		locationId.setBounds(139, 42, 161, 23);
		lpanel_3.add(locationId);
		locationId.setColumns(10);
		
		rName = new JTextField();
		rName.setBounds(139, 134, 161, 23);
		lpanel_3.add(rName);
		rName.setColumns(10);
		
		bName = new JTextField();
		bName.setBounds(139, 81, 161, 23);
		lpanel_3.add(bName);
		bName.setColumns(10);
		
		JLabel show_validation = new JLabel("");
		show_validation.setForeground(Color.RED);
		show_validation.setBounds(139, 288, 161, 13);
		lpanel_3.add(show_validation);
		
		capacity = new JTextField();
		capacity.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				try {
					int i = Integer.parseInt(capacity.getText());
					show_validation.setText("");
				}catch(NumberFormatException e1) {
					show_validation.setText("Invalid number");
				}
			}
			
		});
		capacity.setBounds(139, 255, 161, 23);
		lpanel_3.add(capacity);
		capacity.setColumns(10);
		
		type = new JComboBox();
		type.setModel(new DefaultComboBoxModel(new String[] {"Lecture Hall", "Laboratory"}));
		type.setBounds(139, 195, 161, 23);
		lpanel_3.add(type);
		lpanel_3.add(type);
		//retrive table
		try {
			Connection con = DbConnection.connect();
			
			String query="select * from location ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		//search
		JComboBox searchcomboBox = new JComboBox();
		searchcomboBox.setForeground(new Color(255, 255, 255));
		searchcomboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		searchcomboBox.setBackground(new Color(119, 136, 153));
		searchcomboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 try {
					 Connection con = DbConnection.connect();
					// String selection=(String)searchcomboBox.getSelectedItem();
					 String query="select * from location where buildingName=?";
					 PreparedStatement pst= con.prepareStatement(query);
					 pst.setString(1,(String)searchcomboBox.getSelectedItem());
					 ResultSet rs=pst.executeQuery();

					 table_2.setModel(DbUtils.resultSetToTableModel(rs));
					
					 pst.close();
					 
				 }catch(Exception ep) {
					 ep.printStackTrace();
				 }
			}
			
		});
		searchcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Faculty of Computing", "Faculty of Engineering", "Faculty of Business", "New Building"}));
		searchcomboBox.setBounds(680, 42, 161, 31);
		lpanel_3.add(searchcomboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(347, 102, 494, 251);
		lpanel_3.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setFont(new Font("Times New Roman", Font.BOLD, 14));

		
		
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int selectedRow=table_2.getSelectedRow();
				
				bName.setText(table_2.getValueAt(selectedRow, 1).toString());
				rName.setText(table_2.getValueAt(selectedRow, 2).toString());
				capacity.setText(table_2.getValueAt(selectedRow, 4).toString());
				locationId.setText(table_2.getValueAt(selectedRow, 0).toString());
				
				String combolevel = table_2.getValueAt(selectedRow, 3).toString();
				for(int i = 0;i<type.getItemCount();i++) {
					if(type.getItemAt(i).toString().equalsIgnoreCase(combolevel)) {
						type.setSelectedIndex(i);
					}
				}
			}
		});
		scrollPane.setViewportView(table_2);
		//retrive table
				try {
					Connection con = DbConnection.connect();
					
					String query="select * from location ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(rs));
					taheader();
					
				}catch(Exception e) {
					e.printStackTrace();
					
				}
	
		
		JLabel lblNewLabel = new JLabel("Location ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(41, 42, 74, 13);
		lpanel_3.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("REFRESH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshTable();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(0, 139, 139));
		btnNewButton.setBounds(730, 382, 105, 31);
		
		lpanel_3.add(btnNewButton);
		
		
		
		JPanel lopanel_2 = new JPanel();
		lopanel_2.setBounds(10, 10, 1062, 34);
		lpanel_2.add(lopanel_2);
	

		JLabel lollblNewLabel_1 = new JLabel("Manage Locations");
		lollblNewLabel_1.setForeground(new Color(0, 128, 128));
		lollblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lollblNewLabel_1.setBounds(406, 13, 278, 31);
		lopanel_2.add(lollblNewLabel_1);
		
		
		JButton notAvaliblebtn = new JButton("Not Available Location");
		notAvaliblebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NotAvailableLocation m_stgroup = new NotAvailableLocation ();
				//m_stgroup.main(null);
				frmMangeLocationsGroup.dispose();
				
			}
		});
		
		notAvaliblebtn.setBounds(440, 70, 237, 38);
		frmMangeLocationsGroup.getContentPane().add(notAvaliblebtn);		
		
		JButton btnNewButton_1 = new JButton("Manage Locations");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageLocations m_Location = new ManageLocations ();
				//m_stgroup.main(null);
				frmMangeLocationsGroup.dispose();
			}
		});
		btnNewButton_1.setBounds(262, 70, 179, 38);
		frmMangeLocationsGroup.getContentPane().add(btnNewButton_1);
		
		

		
	}
}
