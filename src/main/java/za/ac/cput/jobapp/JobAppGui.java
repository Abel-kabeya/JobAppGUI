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

    private Font ft1, ft2;

    public JobAppGui() {

        ft1 = new Font("Arial", Font.BOLD | Font.ITALIC, 16);
        ft2 = new Font("Arial", Font.BOLD, 14);

        panelNorth = new JPanel();
        lblTitle = new JLabel("LinkUp Job App", SwingConstants.CENTER);

    }

    public void setGUI() {

        panelNorth.setLayout(new GridLayout(1, 1));
        panelNorth.add(lblTitle);

        this.add(panelNorth, BorderLayout.NORTH);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {

        new JobAppGui().setGUI();

    }

}
