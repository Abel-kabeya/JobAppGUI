/**
 *
 * @author AbelK
 */
package za.ac.cput.jobapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JobAppGui extends JFrame implements ActionListener {

    private JPanel panelNorth;
    private JLabel lblTitle;

    private JPanel panelCenter;
    private JLabel lblSelectJ;
    private JList lJobs;
    private JButton btnApply;
    private JPanel panelSouth;

    private Font ft1, ft2;

    public JobAppGui() {

        ft1 = new Font("Arial", Font.BOLD | Font.ITALIC, 16);
        ft2 = new Font("Arial", Font.BOLD, 14);

        panelNorth = new JPanel();

        lblTitle = new JLabel("LinkUp Job App", SwingConstants.CENTER);

        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();

        lblSelectJ = new JLabel(" Select Job: ");
        String items[] = {" Computer scientist ", " Computer programmer ", " Software engineer ", " Web developer ", " Systems analyst ", " Network engineer ",
            " Database administrator ", " IT security specialist ", " Network administrator ", " Technical support engineer"};
        lJobs = new JList(items);
        btnApply = new JButton("Apply");

    }

    public void setGUI() {

        panelNorth.setLayout(new GridLayout(2, 1));
        panelCenter.setLayout(new GridLayout(1, 1));
        panelSouth.setLayout(new GridLayout(1, 1));

        panelNorth.add(lblTitle);

        panelCenter.add(lblSelectJ);
        panelCenter.add(lJobs);

        panelSouth.add(btnApply);

        btnApply.addActionListener(this);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }



    public boolean isSelectedItem() {

        boolean valid = true;

        if (lJobs.isSelectionEmpty()) {

            valid = false;
            JOptionPane.showMessageDialog(null,"No Selection Made","Selection Error" ,JOptionPane.ERROR_MESSAGE);
            
        } else valid = true;
        
        return valid;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnApply) {

        if  (isSelectedItem()) {    
            this.setVisible(false);
            new JobAppGui2().setGUI();
            }
        }
    }

}
