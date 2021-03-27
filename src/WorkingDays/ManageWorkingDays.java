package WorkingDays;

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

import javax.swing.AbstractButton;
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
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;

import DB.DbConnection;
import Lecturer.Add_Lecturer;
import Student.Manage_studentGroup;
import net.proteanit.sql.DbUtils;

import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;

public class ManageWorkingDays {


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
	
	
	public JFrame frmWorkingDays;
	private JTable table;	
	private JTextField id;

	
public void refreshtable() {
		
		try {
			
			Connection con = DbConnection.connect();
			
			String query="select *  from WorkingDays ";
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
					ManageWorkingDays window = new ManageWorkingDays();
					window.frmWorkingDays.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageWorkingDays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWorkingDays = new JFrame();
		frmWorkingDays.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmWorkingDays.setBackground(Color.YELLOW);
		frmWorkingDays.setResizable(false);
		frmWorkingDays.setTitle("Working Days & Hours");
		frmWorkingDays.setSize(1350, 728);
		frmWorkingDays.setBounds(0, 0, 1350, 700);
		frmWorkingDays.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWorkingDays.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frmWorkingDays.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Working Days And Hours");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(723, 13, 419, 29);
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
		frmWorkingDays.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					Add_Lecturer add_lecture = new Add_Lecturer();
					add_lecture.main(null);
					frmWorkingDays.dispose();
					
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
				frmWorkingDays.dispose();
				
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
			}
		});
		btnManageGroups.setForeground(new Color(255, 255, 255));
		btnManageGroups.setBackground(new Color(0, 139, 139));
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(230, 230, 250));
		panel_3.setBounds(263, 62, 1081, 603);
		frmWorkingDays.getContentPane().add(panel_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(10, 50, 1082, 49);
		panel_3.add(panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Manage Working Days And Hours");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(389, 11, 436, 31);
		panel_6.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Add Working Days");
		btnNewButton_2.setBounds(0, 2, 362, 37);
		panel_3.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				AddWorkingdays m_stgroup = new AddWorkingdays ();
				m_stgroup.main(null);
				frmWorkingDays.dispose();
				
			}
		});
		
		
		JButton btnNewButton_2_1 = new JButton("Manage Working Days");
		btnNewButton_2_1.setBounds(361, 2, 362, 37);
		panel_3.add(btnNewButton_2_1);
	btnNewButton_2_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ManageWorkingDays m_stgroup = new ManageWorkingDays ();
				m_stgroup.main(null);
				frmWorkingDays.dispose();
				
			}
		});
		
		
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(142, 245, 853, 284);
		panel_3.add(panel_4);
		
		JLabel lblNewLabel = new JLabel("Working Hours");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(35, 204, 108, 23);
		panel_4.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Number Of Working Days");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(35, 48, 185, 23);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Select Days");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(35, 95, 108, 23);
		panel_4.add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 24, 1));
		spinner.setBounds(219, 205, 80, 23);
		panel_4.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 30, 30));
		spinner_1.setBounds(446, 205, 74, 23);
		panel_4.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 7, 1));
		spinner_2.setBounds(219, 49, 161, 23);
		panel_4.add(spinner_2);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHours.setBounds(298, 204, 108, 23);
		panel_4.add(lblHours);
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMinutes.setBounds(521, 204, 108, 23);
		panel_4.add(lblMinutes);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Monday");
		chckbxNewCheckBox.setBounds(219, 96, 80, 23);
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxTeusday = new JCheckBox("Tuesday");
		chckbxTeusday.setBounds(309, 96, 80, 23);
		panel_4.add(chckbxTeusday);
		
		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.setBounds(397, 96, 97, 23);
		panel_4.add(chckbxWednesday);
		
		JCheckBox chckbxThursday = new JCheckBox("Thursday");
		chckbxThursday.setBounds(496, 96, 80, 23);
		panel_4.add(chckbxThursday);
		
		JCheckBox chckbxSaturday = new JCheckBox("Saturday");
		chckbxSaturday.setBounds(219, 140, 85, 23);
		panel_4.add(chckbxSaturday);
		
		JCheckBox chckbxSunday = new JCheckBox("Sunday");
		chckbxSunday.setBounds(309, 140, 108, 23);
		panel_4.add(chckbxSunday);
		
		JCheckBox chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.setBounds(589, 96, 97, 23);
		panel_4.add(chckbxFriday);
		
		id = new JTextField();
		id.setBounds(219, 11, 86, 20);
		panel_4.add(id);
	
		
		
		//Update
		JButton btnupdate = new JButton("UPDATE");
		
		
		
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				try {
					Connection con = DbConnection.connect();					
					String query="Update WorkingDays set NoOfDays='"+spinner_2.getValue()+"',monday='"+chckbxNewCheckBox.getText()+"',tuesday='"+chckbxTeusday.getText()+"',wednesday='"+chckbxWednesday.getText()+"',thursday='"+chckbxThursday.getText()+"',friday='"+chckbxFriday.getText()+
							"',hours='"+ spinner.getValue()+"',minutes='"+spinner_1.getValue()+"' "
							+ " where WID='"+id.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					
					JLabel label = new JLabel("Data Updated");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label);
					//JOptionPane.showMessageDialog(null, "Data Updated");
					refreshtable();
					pst.close();
					
				}
				catch(Exception ea) {
					ea.printStackTrace();
				}
				
				
			}
		});
		btnupdate.setForeground(Color.WHITE);
		btnupdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnupdate.setEnabled(true);
		btnupdate.setBackground(new Color(0, 153, 153));
		btnupdate.setBounds(393, 540, 141, 31);
		panel_3.add(btnupdate);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(0, 40, 1082, 31);
		panel_3.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(142, 105, 852, 137);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {


			@Override
			public void mouseClicked(MouseEvent arg0) {

				 	int selectedRow=table.getSelectedRow();
				 
					spinner_2.setValue((Integer)table.getValueAt(selectedRow, 1));
					spinner.setValue((Integer)table.getValueAt(selectedRow, 9));
					spinner_1.setValue((Integer)table.getValueAt(selectedRow, 10));
					id.setText(table.getValueAt(selectedRow, 0).toString());
				
					 String checkDay1 = table.getValueAt(selectedRow, 2).toString();
					  if(checkDay1.equals("Monday")) {
					  
						  chckbxNewCheckBox.setSelected(true); } 
					  else {
					  
							  chckbxNewCheckBox.setSelected(false); }
					  
					  String checkDay2 = table.getValueAt(selectedRow, 3).toString();
					  if(checkDay2.equals("Tuesday")) {
					  
						  chckbxTeusday.setSelected(true); } else {
					  
						 chckbxTeusday.setSelected(false); }
					  
					  String checkDay3 = table.getValueAt(selectedRow,4).toString();
					  if(checkDay3.equals("Wednesday")) {
					  
						  chckbxWednesday.setSelected(true); } else { chckbxWednesday.setSelected(false); }
					  
					  String checkDay4 = table.getValueAt(selectedRow, 5).toString();
					  if(checkDay4.equals("Thursday")) {
					  
						  chckbxThursday.setSelected(true); } else {
					  
							  chckbxThursday.setSelected(false); }
					  
					  String checkDay5 = table.getValueAt(selectedRow, 6).toString();
					  if(checkDay5.equals("Friday")) {
					  
						  chckbxFriday.setSelected(true); }
					  else { chckbxFriday.setSelected(false); }
					  
					  
				
			}
		});
		scrollPane.setViewportView(table);
		
		try {
			Connection con = DbConnection.connect();
			
			String query="SELECT * FROM WorkingDays ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		scrollPane.setViewportView(table);
		

		
		
		JButton button_1 = new JButton("Not Avaiilable Location");
		button_1.setBounds(722, 2, 349, 37);
		panel_3.add(button_1);
		button_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				NotAvailableLocation m_stgroup = new NotAvailableLocation ();
				m_stgroup.main(null);
				frmWorkingDays.dispose();
				
			}
		});
		
		
		//Delete
		JButton btnDelete = new JButton("DELETE");
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					
					Connection con = DbConnection.connect();
					String query="Delete from WorkingDays where WID='"+id.getText()+"'";
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
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setEnabled(true);
		btnDelete.setBackground(new Color(0, 153, 153));
		btnDelete.setBounds(854, 540, 141, 31);
		panel_3.add(btnDelete);
		
		
		//clear
		JButton btnClear_1 = new JButton("CLEAR");
		btnClear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				spinner_2.setValue(0);
				spinner.setValue(0);
				spinner_1.setValue(0);
				chckbxNewCheckBox.setSelected(false);
				chckbxTeusday.setSelected(false);
				chckbxWednesday.setSelected(false);
				chckbxThursday.setSelected(false);
				chckbxFriday.setSelected(false);
				chckbxSaturday.setSelected(false);
				chckbxSunday.setSelected(false);
				
			
			}
		});
		
		btnClear_1.setForeground(Color.WHITE);
		btnClear_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear_1.setEnabled(true);
		btnClear_1.setBackground(new Color(0, 153, 153));
		btnClear_1.setBounds(628, 540, 141, 31);
		panel_3.add(btnClear_1);
	}
}
