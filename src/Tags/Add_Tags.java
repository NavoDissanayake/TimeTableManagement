package Tags;

import java.awt.EventQueue;


import java.awt.Font;
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
import java.sql.Connection;
import java.sql.Statement;
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
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Student.Manage_studentGroup;
import Subject.Add_Subjects;
import WorkingDays.AddWorkingdays;
import Home.Home;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class Add_Tags {

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
	
	
	private JFrame frmAddStudentGroup;
	private JTextField txt_tagcode;
	private JTextField txt_tagname;
	private JComboBox comboBox_tag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Tags window = new Add_Tags();
					window.frmAddStudentGroup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_Tags() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentGroup = new JFrame();
		frmAddStudentGroup.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmAddStudentGroup.setBackground(Color.YELLOW);
		frmAddStudentGroup.setResizable(false);
		frmAddStudentGroup.setTitle("Tags");
		frmAddStudentGroup.setSize(1400, 860);
		frmAddStudentGroup.setBounds(0, 0, 1350, 700);
		frmAddStudentGroup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentGroup.getContentPane().setLayout(null);
		

		frmAddStudentGroup.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		frmAddStudentGroup.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frmAddStudentGroup.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Tags");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(691, 23, 179, 29);
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
		frmAddStudentGroup.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		//home button
				JButton btnHome = new JButton("Home");
				btnHome.setHorizontalAlignment(SwingConstants.LEFT);
				btnHome.setIcon(new ImageIcon(home_logo));
				btnHome.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						//Home home = new Home();
						//home.main(null);
						frmAddStudentGroup.dispose();
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
							frmAddStudentGroup.dispose();
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
						frmAddStudentGroup.dispose();
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
						frmAddStudentGroup.dispose();
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
						frmAddStudentGroup.dispose();
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
						frmAddStudentGroup.dispose();
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
						frmAddStudentGroup.dispose();
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
						frmAddStudentGroup.dispose();
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
				
				
			
				
				
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(230, 230, 250));
		panel_3.setBounds(264, 62, 1080, 603);
		frmAddStudentGroup.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(118, 100, 853, 400);
		panel_3.add(panel_4);
		
		
		//add tags button
		JButton btnNewButton_2 = new JButton("Add Tags");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Add_StudentGroup add_stgroup = new Add_StudentGroup();
				//add_stgroup.main(null);
				frmAddStudentGroup.dispose();
				new Add_StudentGroup();
				
			}
		});
		
		btnNewButton_2.setBounds(0, 0, 256, 37);
		panel_3.add(btnNewButton_2);
		
		
		//manage tags button
		JButton btnNewButton_2_1 = new JButton("Manage Tags");
		
		btnNewButton_2_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Add_StudentGroup add_stgroup = new Add_StudentGroup();
				//add_stgroup.main(null);
				frmAddStudentGroup.dispose();
				new Manage_Tags();
				
			}
		});
		
		btnNewButton_2_1.setBounds(256, 0, 256, 37);
		panel_3.add(btnNewButton_2_1);
		
		
		
		comboBox_tag = new JComboBox();
		comboBox_tag.setModel(new DefaultComboBoxModel(new String[] {"", "Lecture", "Tutorial", "Lab"}));
		comboBox_tag.setBounds(428, 190, 204, 23);
		panel_4.add(comboBox_tag);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Tag Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(156, 57, 108, 23);
		panel_4.add(lblNewLabel_2);
		
		
		txt_tagname = new JTextField();
		txt_tagname.setForeground(SystemColor.controlDkShadow);
		txt_tagname.setColumns(10);
		txt_tagname.setBounds(428, 57, 204, 23);
		panel_4.add(txt_tagname);
		
		JLabel lblNewLabel_3 = new JLabel("Tag Code");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(156, 120, 108, 23);
		panel_4.add(lblNewLabel_3);
		
		
		txt_tagcode = new JTextField();
		txt_tagcode.setForeground(SystemColor.controlDkShadow);
		txt_tagcode.setColumns(10);
		txt_tagcode.setBounds(428, 120, 204, 23);
		panel_4.add(txt_tagcode);
		
		JLabel lblNewLabel_4 = new JLabel("Related Tag");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(156, 190, 108, 23);
		panel_4.add(lblNewLabel_4);
		
		
		
	
		//Add details
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String tagName = txt_tagname.getText();
				String tagCode = txt_tagcode.getText();
				String relatedTag= comboBox_tag.getSelectedItem().toString();
				
				
				
				
				
				try {
					
					 Connection con = DbConnection.connect();

	                    String query = "INSERT INTO Tags values(null, '" + tagName + "','" + tagCode + "','" + relatedTag + "')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                    	
	                    	
	                    	JLabel label = new JLabel("This is alredy exist");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	    					
	                       
	                       // JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
	                    } else {
	                        //JOptionPane.showMessageDialog(btnNewButton,"Welcome, Student Group details successfully inserted!");
	                    	
	                    	JLabel label = new JLabel("Inserted Tag Details Sucessfully");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	    					
	                       
	                				
	                				
	                			
	                	
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
	                	
	                }
				
				
				

				
			}
		});
		
		
		
		
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setEnabled(true);
		btnNewButton.setBackground(new Color(0, 153, 153));
		btnNewButton.setBounds(340, 530, 141, 31);
		panel_3.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txt_tagname.setText("");
				txt_tagcode.setText("");
				comboBox_tag.setSelectedIndex(0);
				
				
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setEnabled(true);
		btnClear.setBackground(new Color(0, 153, 153));
		btnClear.setBounds(604, 530, 141, 31);
		panel_3.add(btnClear);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 38, 1082, 10);
		panel_3.add(separator);
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 38, 1082, 49);
		panel_3.add(panel_6_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Add Tags");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(422, 13, 278, 31);
		panel_6_1.add(lblNewLabel_1_1);
		
		
	}
}
