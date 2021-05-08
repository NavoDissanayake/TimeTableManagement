package Student;

import java.awt.EventQueue;


import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import java.awt.List;
import java.awt.ScrollPane;
import java.awt.Button;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Advanced.Consecutive_sessions;
import DB.DbConnection;
import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;
import net.proteanit.sql.DbUtils;

import javax.swing.border.LineBorder;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;

public class Manage_studentGroup {

	
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
	
	
	private JFrame frame2;
	private JTextField subGroupID;
	private JTextField groupID;
	private JTable table;
	protected AbstractButton textField;
	private JComboBox comboBox_1;
	private JComboBox comboBox;
	private JSpinner subGrpNo_1;
	private JSpinner grpNo;
	private JTextField id;

	
	public void refreshTable() {
		
		try {
			Connection con = DbConnection.connect();
			
			String query="select * from StudentGroup ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
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
					Manage_studentGroup window = new Manage_studentGroup();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Manage_studentGroup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame2.setBackground(Color.YELLOW);
		frame2.setResizable(false);
		frame2.setTitle("Student");
		frame2.setSize(1350, 728);
		frame2.setBounds(320,  120, 1350, 700);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		

		frame2.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		frame2.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frame2.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Student");
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
		frame2.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		//home button
				JButton btnHome = new JButton("Home");
				btnHome.setHorizontalAlignment(SwingConstants.LEFT);
				btnHome.setIcon(new ImageIcon(home_logo));
				btnHome.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						//Home home = new Home();
						//home.main(null);
						frame2.dispose();
						new Home();
						
					}
				});
				btnHome.setBounds(0, 13, 262, 33);
				panel_1.add(btnHome);
				btnHome.setForeground(new Color(255, 255, 255));
				btnHome.setBackground(new Color(0, 139, 139));
				btnHome.setFont(new Font("Tahoma", Font.BOLD, 17));
				
				
				//lecture button
				JButton btnLecturers = new JButton("Lecturers");
				btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
				btnLecturers.setIcon(new ImageIcon(lec_logo));
				btnLecturers.addActionListener(new ActionListener() {
						
						public void actionPerformed(ActionEvent e) {
							
							//Add_Lecturer add_lecture = new Add_Lecturer();
							//add_lecture.main(null);
							frame2.dispose();
							new  Add_Lecturer();
							
						}
					});
				
				btnLecturers.setForeground(Color.WHITE);
				btnLecturers.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnLecturers.setBackground(new Color(0, 139, 139));
				btnLecturers.setBounds(0, 59, 264, 38);
				panel_1.add(btnLecturers);
				
				
				//student button
				JButton btnStudents = new JButton("Students");
				btnStudents.setHorizontalAlignment(SwingConstants.LEFT);
				btnStudents.setIcon(new ImageIcon(stu_logo));
		        btnStudents.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						//Add_StudentGroup add_st= new Add_StudentGroup();
						//add_st.main(null);
						frame2.dispose();
						new Add_StudentGroup();
						
					}
				});
			
				
				btnStudents.setForeground(Color.WHITE);
				btnStudents.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnStudents.setBackground(new Color(0, 139, 139));
				btnStudents.setBounds(0, 108, 264, 38);
				panel_1.add(btnStudents);
				
				
				//subject button
				JButton btnSubjects = new JButton("Subjects");
				btnSubjects.setHorizontalAlignment(SwingConstants.LEFT);
				btnSubjects.setIcon(new ImageIcon(sub_logo));
				btnSubjects.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						Add_Subjects add_sub= new Add_Subjects();
						add_sub.main(null);
						//frmAddStudentGroup.dispose();
						//new Add_Subjects();
						
					}
				});
				btnSubjects.setForeground(Color.WHITE);
				btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnSubjects.setBackground(new Color(0, 139, 139));
				btnSubjects.setBounds(0, 157, 264, 38);
				panel_1.add(btnSubjects);
				
				//session button
				JButton btnSessions = new JButton("Sessions");
				btnSessions.setHorizontalAlignment(SwingConstants.LEFT);
				btnSessions.setIcon(new ImageIcon(session_logo));
				btnSessions.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						Add_Session add_session= new Add_Session();
						add_session.main(null);
						//frmAddStudentGroup.dispose();
						//new Add_Session();
						
					}
				});
				btnSessions.setForeground(Color.WHITE);
				btnSessions.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnSessions.setBackground(new Color(0, 139, 139));
				btnSessions.setBounds(0, 206, 264, 38);
				panel_1.add(btnSessions);
				
				
				//Tags button
				JButton btnTags = new JButton("Tags");
				btnTags.setHorizontalAlignment(SwingConstants.LEFT);
				btnTags.setIcon(new ImageIcon(tag_logo));
				btnTags.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						//Add_Tags add_tag= new Add_Tags();
						//add_tag.main(null);
						frame2.dispose();
						new Add_Tags();
						
					}
				});
				btnTags.setForeground(Color.WHITE);
				btnTags.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnTags.setBackground(new Color(0, 139, 139));
				btnTags.setBounds(0, 255, 264, 38);
				panel_1.add(btnTags);
				
				
				//room button
				JButton btnRooms = new JButton("Rooms");
				btnRooms.setHorizontalAlignment(SwingConstants.LEFT);
				btnRooms.setIcon(new ImageIcon(room_logo));
				btnRooms.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						//ManageSessionsRooms m_rooms= new ManageSessionsRooms ();
						//m_rooms.main(null);
						frame2.dispose();
						new  ManageSessionsRooms();
						
					}
				});
				btnRooms.setForeground(Color.WHITE);
				btnRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnRooms.setBackground(new Color(0, 139, 139));
				btnRooms.setBounds(0, 304, 264, 38);
				panel_1.add(btnRooms);
				
				
				//working days and hours button
				JButton btnWorkingDays = new JButton("Working days & Hours");
				btnWorkingDays.setHorizontalAlignment(SwingConstants.LEFT);
				btnWorkingDays.setIcon(new ImageIcon(days_logo));
				btnWorkingDays.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						AddWorkingdays w_days= new 	AddWorkingdays();
						w_days.main(null);
						//frmAddStudentGroup.dispose();
						//new AddWorkingdays();
						
					}
				});
				btnWorkingDays.setForeground(Color.WHITE);
				btnWorkingDays.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnWorkingDays.setBackground(new Color(0, 139, 139));
				btnWorkingDays.setBounds(0, 353, 264, 38);
				panel_1.add(btnWorkingDays);
				
				//location button
				JButton btnLocations = new JButton("Locations");
				btnLocations.setHorizontalAlignment(SwingConstants.LEFT);
				btnLocations.setIcon(new ImageIcon(location_logo));
				btnLocations.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						//ManageLocations m_locations= new ManageLocations();
						//m_locations.main(null);
						frame2.dispose();
						new ManageLocations();
						
					}
				});
				btnLocations.setForeground(Color.WHITE);
				btnLocations.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnLocations.setBackground(new Color(0, 139, 139));
				btnLocations.setBounds(0, 402, 264, 38);
				panel_1.add(btnLocations);
				
				//statics button
				JButton btnStatistics = new JButton("Statistics");
				btnStatistics.setHorizontalAlignment(SwingConstants.LEFT);
				btnStatistics.setIcon(new ImageIcon(st_logo));
				btnStatistics.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						//Statistics stat= new Statistics ();
						//stat.main(null);
						frame2.dispose();
						new   Statistics();
						
					}
				});
				btnStatistics.setForeground(Color.WHITE);
				btnStatistics.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnStatistics.setBackground(new Color(0, 139, 139));
				btnStatistics.setBounds(0, 451, 264, 38);
				panel_1.add(btnStatistics);
				
				//advanced button
				JButton btnAdvanced = new JButton("Advanced");
				btnAdvanced.setHorizontalAlignment(SwingConstants.LEFT);
				btnAdvanced.setIcon(new ImageIcon(adv_logo));
				btnAdvanced.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						//Consecutive_sessions a_session= new Consecutive_sessions ();
						//a_session.main(null);
						frame2.dispose();
						new Consecutive_sessions();
						
					}
				});
				btnAdvanced.setForeground(Color.WHITE);
				btnAdvanced.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnAdvanced.setBackground(new Color(0, 139, 139));
				btnAdvanced.setBounds(0, 500, 264, 38);
				panel_1.add(btnAdvanced);
				
				//generate button
				JButton btnTimetableGenerate = new JButton("Timetable Generate");
				btnTimetableGenerate.setHorizontalAlignment(SwingConstants.LEFT);
				btnTimetableGenerate.setIcon(new ImageIcon(time_logo));
				btnTimetableGenerate.setForeground(Color.WHITE);
				btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnTimetableGenerate.setBackground(new Color(0, 139, 139));
				btnTimetableGenerate.setBounds(0, 549, 264, 38);
				panel_1.add(btnTimetableGenerate);
				
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(263, 62, 1081, 603);
		frame2.getContentPane().add(panel_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(0, 43, 1082, 49);
		panel_2.add(panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Manage Student Group");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(406, 13, 278, 31);
		panel_6.add(lblNewLabel_1);
		
		//add student group 
		JButton btnNewButton_2 = new JButton("Add Student Group");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(0, 2, 258, 37);
		panel_2.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Add_StudentGroup add_stgroup = new Add_StudentGroup();
				//add_stgroup.main(null);
				frame2.dispose();
				new Add_StudentGroup();
				
			}
		});
		
		
		//manage student group
		JButton btnNewButton_2_1 = new JButton("Manage Student Group");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(255, 2, 258, 37);
		panel_2.add(btnNewButton_2_1);
		
		btnNewButton_2_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Manage_studentGroup m_stgroup = new Manage_studentGroup();
				//m_stgroup.main(null);
				frame2.dispose();
				new Manage_studentGroup();
				
			}
		});
		
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(122, 268, 853, 249);
		panel_2.add(panel_4);
		
	
		

		id = new JTextField();
		id.setBackground(SystemColor.menu);
		id.setForeground(SystemColor.menu);
		id.setEnabled(false);
		id.setBounds(0, 247, 853, 2);
		panel_4.add(id);
		
	
		
		JLabel lblNewLabel_2 = new JLabel("Year Semester");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(35, 57, 108, 23);
		panel_4.add(lblNewLabel_2);
		
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Y1.S1", "Y1.S2", "Y2.S1", "Y2.S2", "Y3.S1", "Y3.S2", "Y4.S1", "Y4.S2"}));
		comboBox_1.setBounds(179, 58, 161, 23);
		panel_4.add(comboBox_1);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Progrmme");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(35, 106, 108, 23);
		panel_4.add(lblNewLabel_3);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "IT", "CSSE", "IM", "CSE", "DS", "SE", "ISE"}));
		comboBox.setBounds(179, 107, 161, 23);
		panel_4.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Group Number");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(35,157,108,23); 
		panel_4.add(lblNewLabel_4);
		
		
		grpNo = new JSpinner();
		grpNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		grpNo.setBounds(179, 158, 161, 23);
		panel_4.add(grpNo);
		
				
		JLabel lblNewLabel = new JLabel("Sub-Group Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(35, 204, 136, 23);
		panel_4.add(lblNewLabel);
		
		subGrpNo_1 = new JSpinner();
		subGrpNo_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		subGrpNo_1.setBounds(179, 205, 161, 22);
		panel_4.add(subGrpNo_1);
		
		JLabel lblRank = new JLabel("Group ID");
		lblRank.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRank.setBounds(521, 57, 108, 23);
		panel_4.add(lblRank);
		
		
		groupID = new JTextField();
		groupID.setFont(new Font("Tahoma", Font.BOLD, 13));
		groupID .setForeground(Color.RED);
		groupID .setColumns(10);
		groupID .setBounds(643, 58, 174, 23);
		panel_4.add(groupID );
		
		JLabel lblSubgroupId = new JLabel("Sub-Group ID");
		lblSubgroupId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubgroupId.setBounds(521, 106, 108, 23);
		panel_4.add(lblSubgroupId);
		
	

		subGroupID = new JTextField();
		subGroupID.setFont(new Font("Tahoma", Font.BOLD, 13));
		subGroupID.setForeground(Color.RED);
		subGroupID.setColumns(10);
		subGroupID.setBounds(643, 107, 174, 23);
		panel_4.add(subGroupID);
		
		

		JButton btnNewButton_1 = new JButton("GENERATE ID");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			
				groupID.setText(comboBox_1.getSelectedItem().toString()+"."+comboBox.getSelectedItem().toString()+"."+grpNo.getValue().toString());
		
				subGroupID.setText(comboBox_1.getSelectedItem().toString()+"."+comboBox.getSelectedItem().toString()+"."+grpNo.getValue().toString()+"."+subGrpNo_1.getValue().toString());
			
				
				
			}
		});
		
		
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(119, 136, 153));
		btnNewButton_1.setBounds(643, 157, 174, 38);
		panel_4.add(btnNewButton_1);
	
		
	
		
		
		
			
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(0, 40, 1082, 31);
		panel_2.add(separator);
		
		
		
		//Table view
		JScrollPane scrollPane = new JScrollPane();
		
		
		scrollPane.setBounds(122, 105, 852, 137);
		panel_2.add(scrollPane);
		
		
	
		table = new JTable();
		table.setForeground(SystemColor.windowBorder);
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				

				
				
				 	int selectedRow=table.getSelectedRow();
				 
					groupID.setText(table.getValueAt(selectedRow, 5).toString());
					subGroupID.setText(table.getValueAt(selectedRow, 6).toString());
					id.setText(table.getValueAt(selectedRow, 0).toString());
					
					
				    
					
				    String comboLevel = table.getValueAt(selectedRow, 2).toString();
					for(int i=0; i<comboBox.getItemCount();i++) {
						if(comboBox.getItemAt(i).toString().equalsIgnoreCase(comboLevel)) {
							comboBox.setSelectedIndex(i);
						}
					}
					
					
					String comboLevel1 = table.getValueAt(selectedRow, 1).toString();
					for(int i=0; i<comboBox_1.getItemCount();i++) {
						if(comboBox_1.getItemAt(i).toString().equalsIgnoreCase(comboLevel1)) {
							comboBox_1.setSelectedIndex(i);
						}
					}
					
					
					//grpNo.setValue(table.getValueAt(selectedRow, 3).toString());
					//subGrpNo_1.setValue(table.getValueAt(selectedRow, 4).Integer.parseInt());
					//subGrpNo_1.setValue(table.getModel().getValueAt(selectedRow,4).toString());
					
					
					//grpNo.setValue(Integer.parseInt((String)table.getValueAt(selectedRow,3)));
					//subGrpNo_1.setValue(Integer.parseInt((String)table.getValueAt(selectedRow,4)));
					
					grpNo.setValue((Integer)table.getValueAt(selectedRow,3));
					subGrpNo_1.setValue((Integer)table.getValueAt(selectedRow,4));
					 
				
			}
		});
		scrollPane.setViewportView(table);
		try {
			Connection con = DbConnection.connect();
			
			String query="select * from StudentGroup ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		//update details
		JButton btnNewButton = new JButton("EDIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection con = DbConnection.connect();					
					String query="Update StudentGroup set AcademicYearSemester='"+comboBox_1.getSelectedItem()+"',Programme='"+comboBox.getSelectedItem()+"',GroupNo='"+grpNo.getValue()+"',SubGroupNo='"+subGrpNo_1.getValue()+"',GroupID='"+groupID.getText()+"',SubGroupID='"+subGroupID.getText()+"' where StudenttGroupID='"+id.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					
					JLabel label = new JLabel("Data Updated");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label);
					//JOptionPane.showMessageDialog(null, "Data Updated");
					refreshTable();
					pst.close();
					
				}
				catch(Exception ea) {
					ea.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 139, 139));
		btnNewButton.setBounds(122, 542, 123, 33);
		panel_2.add(btnNewButton);
		
		
		//delete details
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					
					Connection con = DbConnection.connect();
					String query="Delete from StudentGroup where StudenttGroupID='"+id.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
					JLabel label = new JLabel("Data Deleted");
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
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD,14));
		btnDelete.setBackground(new Color(0, 139, 139));
		btnDelete.setBounds(507, 542, 123, 33);
		panel_2.add(btnDelete);
		
		
		
		//clear operation
		JButton btnNewButton_3 = new JButton("CLEAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBox_1.setSelectedIndex(0);
				comboBox.setSelectedIndex(0);
				//grpNo.clear();
				//subGrpNo_1.
				//grpNo.getAdapter().remove((String)grpNo.getSelectedItem());groupID.setText("");
				groupID.setText("");
				subGroupID.setText("");
				grpNo.setValue(0);
				subGrpNo_1.setValue(0);
				    
				  
				
			}
		});
		
		
		
		
	    btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("2, 542", Font.BOLD, 14));
		btnNewButton_3.setBackground(new Color(0, 139, 139));
		btnNewButton_3.setBounds(852, 542, 123, 33);
		panel_2.add(btnNewButton_3);
		
	}
}
