/**
 *
 * @author AbelK
 */
package za.ac.cput.jobapp;

import javax.swing.*;
import java.awt.*;
import org.apache.commons.validator.routines.EmailValidator;

public class JobAppGui2 extends JFrame {

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

    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblErrorEmail;

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

    private Font ft1, ft2;

    public JobAppGui2() {

        ft1 = new Font("Arial", Font.BOLD | Font.ITALIC, 16);
        ft2 = new Font("Arial", Font.BOLD, 14);

        panelNorth = new JPanel();

        lblTitle = new JLabel("LinkUp Job App", SwingConstants.CENTER);

        panelCenter = new JPanel();
        lblFirstName = new JLabel(" First Name: ");
        txtFirstName = new JTextField(15);
        lblErrorFirstName = new JLabel("*required");
        lblErrorFirstName.setForeground(Color.red);
        lblErrorFirstName.setVisible(false);

        lblLastName = new JLabel(" Last Name: ");
        txtLastName = new JTextField(15);
        lblErrorLastName = new JLabel("*required");
        lblErrorLastName.setForeground(Color.red);
        lblErrorLastName.setVisible(false);

        lblIDNo = new JLabel(" ID / Passport No. ");
        txtIDNo = new JTextField(13);
        lblErrorIDNo = new JLabel("*required");
        lblErrorIDNo.setForeground(Color.red);
        lblErrorIDNo.setVisible(false);

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
        lblErrorGender.setVisible(false);

        lblEmail = new JLabel(" Email: ");
        txtEmail = new JTextField(15);
        lblErrorEmail = new JLabel("*required");
        lblErrorEmail.setForeground(Color.red);
        lblErrorEmail.setVisible(false);

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
        lblErrorDateOfBirth.setVisible(false);

        lblNationality = new JLabel(" Nationality: ");
        txtNationality = new JTextField(15);
        lblErrorNationality = new JLabel("*required");
        lblErrorNationality.setForeground(Color.red);
        lblErrorNationality.setVisible(false);

        lblQualification = new JLabel(" Highest Qualification type: ");
        String listOfQualifications[] = {"--Please Select--", "Matric", "Certificate", "Diploma", "B-Degree", "Honours Degree", "Masters Degree", "Other"};
        cboQualification = new JComboBox(listOfQualifications);
        lblErrorQualification = new JLabel("*required");
        lblErrorQualification.setForeground(Color.red);
        lblErrorQualification.setVisible(false);

        panelSouth = new JPanel();
        btnNext = new JButton("Next");
        btnSave = new JButton("Save");

    }

    public void setGUI() {

        panelNorth.setLayout(new GridLayout(2, 1));
        panelCenter.setLayout(new GridLayout(9, 3));
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

        panelCenter.add(lblEmail);
        panelCenter.add(txtEmail);
        panelCenter.add(lblErrorEmail);

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

    public boolean isInputValid() {
        boolean valid = true;

        if (txtFirstName.getText().equals("")) {
            valid = false;
            lblErrorFirstName.setVisible(true);
        } else {
            lblErrorFirstName.setVisible(false);
        }

        if (txtLastName.getText().equals("")) {
            valid = false;
            lblErrorLastName.setVisible(true);
        } else {
            lblErrorLastName.setVisible(false);
        }

        if (!EmailValidator.getInstance().isValid(txtEmail.getText())) {
            valid = false;
            lblErrorEmail.setVisible(true);
        } else {
            lblErrorEmail.setVisible(false);
        }

        return valid;
    }

}
