
package LPMC.Casino.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginPage extends JPanel {
    
    /*
     * Variables
     */
    private BufferedImage background;
    private JLabel status;

    /*
     * Panel constructor
     */
    public LoginPage(){

        /*
         * Subpanels for creating the correct layout.
         */
        JPanel southPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel inputPanel = new JPanel();
        
        /*
         * Elements of the panel
         */
        JLabel title = new JLabel("Learn Programming Casino", JLabel.CENTER);
        title.setFont(new Font("SansSerif", Font.PLAIN, 40));
        title.setForeground(Color.RED);
        title.setOpaque(true);
        title.setBackground(Color.darkGray);
        
        JTextField user = new JTextField("User",10);
        JPasswordField password = new JPasswordField("password",10);
        
        JButton loginB = new JButton("Login");
        JButton quitB = new JButton("Quit");
        JButton createB = new JButton("Create New Account");
        JButton forgotB = new JButton("Forgot Your Username or Password?");
        
        
        status = new JLabel("");
        
        
        /*
         * Size and Layaout of the main panel.
         */
        setPreferredSize(new Dimension(640, 480));
        setLayout(new BorderLayout());
        
        /*
         * Adding elements to the subpanels.
         */
        inputPanel.setOpaque(false);
        inputPanel.add(user);
        inputPanel.add(password);
        inputPanel.add(loginB);
        
        centerPanel.setOpaque(false);
        centerPanel.setLayout(new GridLayout(4,1));  
        centerPanel.add(new JLabel());
        centerPanel.add(new JLabel());
        centerPanel.add(inputPanel);
        centerPanel.add(status);
        
        southPanel.setOpaque(false);
        southPanel.add(createB);
        southPanel.add(forgotB);
        southPanel.add(quitB);
        

        /*
         * Adding subpanes to the main panel.
         */
        add(title, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
        
        /*
         * Get the background image from resources file
         */
        try {
            background = ImageIO.read(new File("res/CasinoBackground.jpeg"));
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    
    /*
     * Setter for the status label
     */
    public void setStatus(JLabel status) {
        this.status = status;
    }
        
    /*
     * Adding the background image to the main panel.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this); 
    }
    
    
}
