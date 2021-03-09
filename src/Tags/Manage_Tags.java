package Tags;

import java.awt.EventQueue;


import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
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
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import net.proteanit.sql.DbUtils;
import Home.Home;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Manage_Tags {

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
	private JTextField txt_tagName;
	private JTextField txt_tagCode;
	private JTable table;
	private JComboBox r_tag;
	private JTextField textField;
	
	
	public void refreshtable() {
		
		try {
			
			Connection con = DbConnection.connect();
			
			String query="select * from Tags ";
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
					Manage_Tags window = new Manage_Tags();
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
	public Manage_Tags() {
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
		frmAddStudentGroup.setBounds(320, 120, 1350, 700);
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
						
					Home home = new Home();
					home.main(null);
					frmAddStudentGroup.dispose();
						
				}
			});
		btnHome.setBounds(0, 13, 262, 33);
		panel_1.add(btnHome);
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setBackground(new Color(0, 139, 139));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		
		//lecture buttton
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					Add_Lecturer add_lecture = new Add_Lecturer();
					add_lecture.main(null);
					frmAddStudentGroup.dispose();
					
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
				
				Add_StudentGroup add_st= new Add_StudentGroup();
				add_st.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
	
		btnLecturers.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Home add_st = new Home();
				add_st.main(null);
				frmAddStudentGroup.dispose();
				
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
				frmAddStudentGroup.dispose();
				
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
				frmAddStudentGroup.dispose();
				
			}
		});
		btnSessions.setForeground(Color.WHITE);
		btnSessions.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSessions.setBackground(new Color(0, 139, 139));
		btnSessions.setBounds(0, 206, 264, 38);
		panel_1.add(btnSessions);
		
		
		//tags button
		JButton btnTags = new JButton("Tags");
		btnTags.setHorizontalAlignment(SwingConstants.LEFT);
		btnTags.setIcon(new ImageIcon(tag_logo));
		btnTags.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Add_Tags add_tag= new Add_Tags();
				add_tag.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
		btnTags.setForeground(Color.WHITE);
		btnTags.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTags.setBackground(new Color(0, 139, 139));
		btnTags.setBounds(0, 255, 264, 38);
		panel_1.add(btnTags);
		
		
		//rooms button
		JButton btnRooms = new JButton("Rooms");
		btnRooms.setHorizontalAlignment(SwingConstants.LEFT);
		btnRooms.setIcon(new ImageIcon(room_logo));
		btnRooms.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ManageSessionsRooms m_rooms= new ManageSessionsRooms ();
				m_rooms.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
		btnRooms.setForeground(Color.WHITE);
		btnRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRooms.setBackground(new Color(0, 139, 139));
		btnRooms.setBounds(0, 304, 264, 38);
		panel_1.add(btnRooms);
		
		//workin days hours button
		JButton btnWorkingDays = new JButton("Working days & Hours");
		btnWorkingDays.setHorizontalAlignment(SwingConstants.LEFT);
		btnWorkingDays.setIcon(new ImageIcon(days_logo));
		btnWorkingDays.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				AddWorkingdays w_days= new 	AddWorkingdays();
				w_days.main(null);
				frmAddStudentGroup.dispose();
				
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
				
				ManageLocations m_locations= new ManageLocations();
				m_locations.main(null);
				frmAddStudentGroup.dispose();
				
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
        btnRooms.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Statistics stat= new Statistics ();
				stat.main(null);
				frmAddStudentGroup.dispose();
				
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
        btnRooms.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Consecutive_sessions a_session= new Consecutive_sessions ();
				a_session.main(null);
				frmAddStudentGroup.dispose();
				
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
		panel_2.setBounds(261, 67, 1083, 598);
		frmAddStudentGroup.getContentPane().add(panel_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(216, 261, 636, 192);
		panel_2.add(panel_5);
		
		JLabel lblNewLabel = new JLabel("Tag Name");
		lblNewLabel.setBounds(74, 23, 149, 24);
		panel_5.add(lblNewLabel);
		
		
		txt_tagName = new JTextField();
		txt_tagName.setColumns(10);
		txt_tagName.setBounds(343, 23, 172, 24);
		panel_5.add(txt_tagName);
		
		JLabel lblNewLabel_5 = new JLabel("Tag Code");
		lblNewLabel_5.setBounds(74, 72, 56, 16);
		panel_5.add(lblNewLabel_5);
		
		
		txt_tagCode = new JTextField();
		txt_tagCode.setColumns(10);
		txt_tagCode.setBounds(343, 68, 172, 24);
		panel_5.add(txt_tagCode);
		
		JLabel lblNewLabel_6 = new JLabel("Related  Name");
		lblNewLabel_6.setBounds(74, 123, 111, 16);
		panel_5.add(lblNewLabel_6);
		
		
		r_tag = new JComboBox();
		r_tag.setModel(new DefaultComboBoxModel(new String[] {"Lecture", "Tutorial", "Lab"}));
		r_tag.setBounds(343, 122, 172, 19);
		panel_5.add(r_tag);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(Color.WHITE);
		textField.setEnabled(false);
		textField.setBounds(190, 24, 116, 22);
		panel_5.add(textField);
		textField.setColumns(10);
		
		
		
		
	
		
	
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 39, 1082, 49);
		panel_2.add(panel_6_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Manage Tags");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(422, 13, 278, 31);
		panel_6_1.add(lblNewLabel_1_1);
		
		
		//add tags button
		JButton btnNewButton_2 = new JButton("Add Tags");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Add_StudentGroup add_stgroup = new Add_StudentGroup();
				//add_stgroup.main(null);
				frmAddStudentGroup.dispose();
				new Add_Tags();
				
				
			}
		});
		
		
		btnNewButton_2.setBounds(0, 0, 258, 37);
		panel_2.add(btnNewButton_2);
		
		
		
		
		
		
		//add manage button
		JButton btnNewButton_2_2 = new JButton("Manage Tags");
		
		btnNewButton_2_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Manage_Tags m_tag = new Manage_Tags();
				//m_tag.main(null);
				frmAddStudentGroup.dispose();
				new Manage_Tags();
				
			}
		});
		btnNewButton_2_2.setBounds(258, 0, 258, 37);
		panel_2.add(btnNewButton_2_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(0, 37, 1082, 14);
		panel_2.add(separator);
		
		
		
		//table view
		JScrollPane scrollPane = new JScrollPane();
		
		
		
		scrollPane.setBounds(216, 111, 636, 137);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int selectedRow=table.getSelectedRow();
			    
				txt_tagName.setText(table.getValueAt(selectedRow, 1).toString());
				txt_tagCode.setText(table.getValueAt(selectedRow, 2).toString());
				textField.setText(table.getValueAt(selectedRow, 0).toString());
				
				
			    
				
			    String comboLevel = table.getValueAt(selectedRow, 3).toString();
				for(int i=0; i<r_tag.getItemCount();i++) {
					if(r_tag.getItemAt(i).toString().equalsIgnoreCase(comboLevel)) {
						r_tag.setSelectedIndex(i);
					}
				}
				
				
				
			}
		});
		scrollPane.setViewportView(table);
		try {
			Connection con = DbConnection.connect();
			
			String query="select * from Tags ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		//update tags details
		JButton btnEdit = new JButton("EDIT");
		
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Connection con = DbConnection.connect();					
					String query="Update Tags set TagName='"+txt_tagName.getText()+"',TagCode='"+txt_tagCode.getText()+"',RelatedTag='"+r_tag.getSelectedItem()+"' where TagID='"+textField.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					
					JLabel label = new JLabel("Data Updated");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label);
					//JOptionPane.showMessageDialog(null, "Data Updated");
					//pst.close();
				
					refreshtable();
					
					pst.close();
					
				}
				catch(Exception ea) {
					ea.printStackTrace();
				}
				
				
			}
		});
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEdit.setEnabled(true);
		btnEdit.setBackground(new Color(0, 153, 153));
		btnEdit.setBounds(222, 488, 141, 31);
		panel_2.add(btnEdit);
		
		
		//delete tags details
		JButton btnNewButton_2_1 = new JButton("DELETE");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					
					Connection con = DbConnection.connect();
					String query="Delete from Tags where TagID='"+textField.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();

					JLabel label = new JLabel("Data Deleted");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label);
					
					//JOptionPane.showMessageDialog(null, "Data Deleted");
					
					refreshtable();
					pst.close();
					
					}
					catch(Exception en) {
						en.printStackTrace();
						
					}
				
				
				
			}
		});
		
		
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1.setEnabled(true);
		btnNewButton_2_1.setBackground(new Color(0, 153, 153));
		btnNewButton_2_1.setBounds(473, 488, 141, 31);
		panel_2.add(btnNewButton_2_1);
		

		
		//clear details
		JButton btnClear_1 = new JButton("CLEAR");
		btnClear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txt_tagName.setText("");
				txt_tagCode.setText("");
				r_tag.setSelectedIndex(0);
				
				
				
			}
		});
		btnClear_1.setForeground(Color.WHITE);
		btnClear_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear_1.setEnabled(true);
		btnClear_1.setBackground(new Color(0, 153, 153));
		btnClear_1.setBounds(709, 488, 141, 31);
		panel_2.add(btnClear_1);
		
		
		
	}
}
