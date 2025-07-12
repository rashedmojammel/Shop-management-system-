import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import Classes.*;

public class Login extends JFrame implements ActionListener,MouseListener
{
    ImageIcon icon;
    JLabel username, password, loginMsg, frameImage,login,sms;
    JPanel leftPanel;
    JButton loginButton, resetButton,exit1;
    JTextField usernameField;
    JPasswordField userPasswordField;
    Font font;

    
    public Login()
    {

        font = new Font("Arial Rounded MT Bold", 0, 18);

        this.setTitle("Shop Management System");
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        leftPanel = new JPanel();
        leftPanel.setBounds(0,0,480,800);
        leftPanel.setBackground(new Color(0, 0, 51));
        leftPanel.setLayout(null);
        this.add(leftPanel);


        ImageIcon img =new ImageIcon("Image/iconmonstr-home-8-240.png");
        frameImage = new JLabel(img);
        frameImage.setBounds(0,100,480,800);
        leftPanel.add(frameImage);
        this.add(leftPanel);


        username = new JLabel("Username :");
        username.setBounds(502, 300, 247, 32);
        username.setForeground(new Color(0, 0, 51));
        username.setFont(font);
        this.add(username);


        login = new JLabel("Login");
        login.setOpaque(true);
        login.setBounds(502, 50, 247, 32);
        login.setForeground(new Color(0, 0, 51));
        login.setFont(new Font("Arial Rounded MT Bold", 0, 24));
        this.add(login);


        sms = new JLabel("Shop Management System");
        sms.setBounds(20, 50, 500, 40);
        sms.setForeground(new Color(255, 255, 255));
        sms.setFont(new Font("Arial Rounded MT Bold", 0, 32));
        leftPanel.add(sms);
        this.add(leftPanel);

        
        password = new JLabel("Password :");
        password.setBounds(502, 370, 247, 32);
        password.setForeground(new Color(0, 0, 51));
        password.setFont(font);
        this.add(password);


        loginMsg = new JLabel();
        loginMsg.setBounds(635, 600, 450, 32);
        loginMsg.setForeground(Color.BLACK);
        loginMsg.setFont(font);
        this.add(loginMsg);


        usernameField = new JTextField();
        usernameField.setBounds(645, 304, 285, 32);
        usernameField.setFont(font);
        usernameField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        this.add(usernameField);

        
        userPasswordField = new JPasswordField();
        userPasswordField.setBounds(645, 374, 285, 32);
        userPasswordField.setFont(font);
        userPasswordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        this.add(userPasswordField);


        loginButton = new JButton("Log In");
        loginButton.setBounds(635, 634, 95, 35);
        loginButton.setBackground(new Color(0, 0, 51));
        loginButton.setForeground(new Color(255, 255, 255));
        loginButton.setFont(font);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        loginButton.addMouseListener(this);
        this.add(loginButton);


        exit1 = new JButton("X");
        exit1.setBounds(890, 50, 50, 32);
        exit1.setBackground(new Color(240,240,240));
        exit1.setForeground(new Color(0,0,51));
        exit1.setFont(new Font("Arial Rounded MT Bold", 0, 24));
        exit1.setFocusable(false);
        exit1.addActionListener(this);
        this.add(exit1);


        resetButton = new JButton("Reset");
        resetButton.setBounds(765, 634, 85, 40);
        resetButton.setBackground(new Color(0, 0, 51));
        resetButton.setForeground(new Color(255, 255, 255));
        resetButton.setFont(font);
        resetButton.addActionListener(this);
        resetButton.addMouseListener(this);
        this.add(resetButton);

        
        
    }


    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
    {
        if(me.getSource() == loginButton)
        {
            loginButton.setBackground(Color.WHITE);
            loginButton.setForeground(new Color(0,0,51));
        }
        else if(me.getSource() == resetButton)
        {
            resetButton.setBackground(Color.WHITE);
            resetButton.setForeground(new Color(0,0,51));
        }
        
        else
        {

        }
    }
    public void mouseExited(MouseEvent me)
    {
        if(me.getSource() == loginButton)
        {
            loginButton.setBackground(new Color(0, 0, 51));
            loginButton.setForeground(new Color(255, 255, 255));
        }

        else if(me.getSource() == resetButton)
        {

            resetButton.setBackground(new Color(0, 0, 51));
            resetButton.setForeground(new Color(255, 255, 255));

        }
        
        else
        {

        }
    }
    



    public void actionPerformed(ActionEvent e)
    {

        String command = e.getActionCommand();
        

        if(e.getSource() == resetButton)
        {
            usernameField.setText(null);
            userPasswordField.setText(null);
            loginMsg.setText(null);
        }

        if(e.getSource() == loginButton)
        {
            String adminUsername = usernameField.getText();
            String adminPassword = String.valueOf(userPasswordField.getPassword());
            try
            { 
                if( adminPassword.length() == 8)
                {
                    if(adminUsername.equals("Mahmud") && adminPassword.equals("Mahmud12"))
                    {
                        showMessageDialog(null, "Correct Username and password!");
                        Shop s = new Shop(this);
                        s.setVisible(true);
                        this.setVisible(false); 
                    }

                    else    
                        {showMessageDialog(null, "Incorrect Username and password! Please Try again!");}

                }
                else{ throw new ShortpassException() ; }

            }
            catch (ShortpassException se)
            {
                showMessageDialog(null,se.getMessage());
            }
        }

        if(e.getSource()== exit1)
        {

            System.exit(0);
        }

        else
        {}


}




}
