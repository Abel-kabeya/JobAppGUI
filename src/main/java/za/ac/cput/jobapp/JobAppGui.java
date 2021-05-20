/**
 *
 * @author AbelK
 */
package za.ac.cput.jobapp;

import java.awt.*;
import javax.swing.*;

public class JobAppGui extends JFrame {

    private JPanel panelNorth;
    private JLabel lblTitle;

    private JPanel panelCenter;

    private JLabel lblFirstName;
    private JTextField txtFirstName;
    private JLabel lblErrorFirstName;

    private JLabel lblLastName;
    private JTextField txtLastName;
    private JLabel lblErrorLastName;

    private JLabel lblIDNo;
    private JTextField txtIDNo;
    private JLabel lblErrorIDNo;

    private JLabel lblGender;
    private JPanel panelGender;
    private JRadioButton radMale;
    private JRadioButton radFemale;
    private JLabel lblErrorGender;
    private ButtonGroup genderButtonGroup;

    private JLabel lblDateOfBirth;
    private JPanel panelDoB;
    private JTextField txtDay;
    private JTextField txtMonth;
    private JTextField txtYear;
    private JLabel lblErrorDateOfBirth;

    private JLabel lblNationality;
    private JTextField txtNationality;
    private JLabel lblErrorNationality;

    private JLabel lblQualification;
    private JComboBox cboQualification;
    private JLabel lblErrorQualification;

    private JPanel panelSouth;
    private JButton btnNext;
    private JButton btnSave;

    private JPanel panelNorth2;
    private JPanel panelCenter2;
    private JLabel lblSelectJ;
    private JList lJobs;
    private JButton btnApply;
    private JPanel panelSouth2;

    private Font ft1, ft2;

    public JobAppGui() {

        ft1 = new Font("Arial", Font.BOLD | Font.ITALIC, 16);
        ft2 = new Font("Arial", Font.BOLD, 14);

        panelNorth = new JPanel();

        lblTitle = new JLabel("LinkUp Job App", SwingConstants.CENTER);

        panelCenter = new JPanel();
        lblFirstName = new JLabel(" First Name: ");
        txtFirstName = new JTextField(15);
        lblErrorFirstName = new JLabel("*required");
        lblErrorFirstName.setForeground(Color.red);

        lblLastName = new JLabel(" Last Name: ");
        txtLastName = new JTextField(15);
        lblErrorLastName = new JLabel("*required");
        lblErrorLastName.setForeground(Color.red);

        lblIDNo = new JLabel(" ID / Passport No. ");
        txtIDNo = new JTextField(13);
        lblErrorIDNo = new JLabel("*required");
        lblErrorIDNo.setForeground(Color.red);

        lblGender = new JLabel(" Gender: ");
        panelGender = new JPanel();
        radFemale = new JRadioButton("Female");
        radMale = new JRadioButton("Male");
        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(radFemale);
        genderButtonGroup.add(radMale);
        panelGender.setLayout(new GridLayout(1, 2));
        panelGender.add(radFemale);
        panelGender.add(radMale);
        lblErrorGender = new JLabel("*required");
        lblErrorGender.setForeground(Color.red);
        //lblErrorGender.setVisible(false);

        lblDateOfBirth = new JLabel(" DOB: ");
        panelDoB = new JPanel();
        txtDay = new JTextField("Day", 1);
        txtMonth = new JTextField("Month", 1);
        txtYear = new JTextField("Year", 1);
        panelDoB.setLayout(new GridLayout(1, 3));
        panelDoB.add(txtDay);
        panelDoB.add(txtMonth);
        panelDoB.add(txtYear);
        lblErrorDateOfBirth = new JLabel("*required");
        lblErrorDateOfBirth.setForeground(Color.red);

        lblNationality = new JLabel(" Nationality: ");
        txtNationality = new JTextField(15);
        lblErrorNationality = new JLabel("*required");
        lblErrorNationality.setForeground(Color.red);

        lblQualification = new JLabel(" Highest Qualification type: ");
        String listOfQualifications[] = {"--Please Select--", "Matric", "Certificate", "Diploma", "B-Degree", "Honours Degree", "Masters Degree", "Other"};
        cboQualification = new JComboBox(listOfQualifications);
        lblErrorQualification = new JLabel("*required");
        lblErrorQualification.setForeground(Color.red);

        panelSouth = new JPanel();
        btnNext = new JButton("Next");
        btnSave = new JButton("Save");

        panelNorth2 = new JPanel();
        panelCenter2 = new JPanel();
        panelSouth2 = new JPanel();
        
        lblSelectJ = new JLabel(" Select Job: ");
        String items[] = {" Computer scientist "," Computer programmer ", " Software engineer "," Web developer ", " Systems analyst ", " Network engineer ", 
            " Database administrator ", " IT security specialist ", " Network administrator ", " Technical support engineer"};
        lJobs = new JList(items);
        btnApply = new JButton("Apply");

    }
    
     public void setGUI() {
        
        panelNorth2.setLayout(new GridLayout(2, 1));
        panelCenter2.setLayout(new GridLayout(1, 1));
        panelSouth2.setLayout(new GridLayout(1, 1));

        
        panelNorth2.add(lblTitle);
        
        panelCenter2.add(lblSelectJ);
        panelCenter2.add(lJobs);
        
        panelSouth2.add(btnApply);
        
        this.add(panelNorth2, BorderLayout.NORTH);
        this.add(panelCenter2, BorderLayout.CENTER);
        this.add(panelSouth2, BorderLayout.SOUTH);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        

    }

    public void setGUI2() {

        panelNorth.setLayout(new GridLayout(2, 1));
        panelCenter.setLayout(new GridLayout(8, 3));
        panelSouth.setLayout(new GridLayout(1, 1));

        panelNorth.add(lblTitle);

        panelCenter.add(lblFirstName);
        panelCenter.add(txtFirstName);
        panelCenter.add(lblErrorFirstName);

        panelCenter.add(lblLastName);
        panelCenter.add(txtLastName);
        panelCenter.add(lblErrorLastName);

        panelCenter.add(lblIDNo);
        panelCenter.add(txtIDNo);
        panelCenter.add(lblErrorIDNo);

        panelCenter.add(lblGender);
        panelCenter.add(panelGender);
        panelCenter.add(lblErrorGender);

        panelCenter.add(lblDateOfBirth);
        panelCenter.add(panelDoB);
        panelCenter.add(lblErrorDateOfBirth);

        panelCenter.add(lblNationality);
        panelCenter.add(txtNationality);
        panelCenter.add(lblErrorNationality);

        panelCenter.add(lblQualification);
        panelCenter.add(cboQualification);
        panelCenter.add(lblErrorQualification);

        panelSouth.add(btnSave);
        panelSouth.add(btnNext);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

   

    public static void main(String[] args) {

        new JobAppGui().setGUI();
        new JobAppGui().setGUI2();

    }

}
