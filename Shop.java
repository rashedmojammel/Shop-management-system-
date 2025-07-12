import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Shop extends JFrame implements ActionListener,MouseListener
{
    ImageIcon icon;
    JLabel username, shopID,location, loginMsg, frameImage,cShop,sms;
    JPanel leftPanel;
    JButton nextButton, backButton;
    JTextField usernameField,shopidTF;
    JPasswordField userPasswordField;
    Font font;
    Login l;
    
    
    public Shop(Login l)
    {
 
        this.l = l;
       

        font = new Font("Arial Rounded MT Bold", 0, 18);


        this.setTitle("Creating Shop");
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        leftPanel = new JPanel();
        leftPanel.setBounds(0,-30,480,800);
        leftPanel.setLayout(null);
        leftPanel.setBackground(new Color(0, 0, 51));
        this.add(leftPanel);



        ImageIcon img =new ImageIcon("Image/iconmonstr-shopping-cart-22-240.png");
        frameImage = new JLabel(img);
        frameImage.setBounds(0,100,480,800);
        leftPanel.add(frameImage);
        this.add(leftPanel);



        sms = new JLabel("Shop Management System");
        sms.setBounds(20, 50, 500, 40);
        sms.setForeground(new Color(255, 255, 255));
        sms.setFont(new Font("Arial Rounded MT Bold", 0, 32));
        leftPanel.add(sms);
        this.add(leftPanel);


        
        username = new JLabel("Enter Shop Name :");
        username.setBounds(502, 250, 300, 32);
        username.setForeground(new Color(0, 0, 51));
        username.setFont(font);
        this.add(username);



        location = new JLabel("Enter location :");
        location.setBounds(502, 320, 300, 32);
        location.setForeground(new Color(0, 0, 51));
        location.setFont(font);
        this.add(location);



        shopID = new JLabel("Enter Shop ID :");
        shopID.setBounds(502, 390, 247, 32);
        shopID.setForeground(new Color(0, 0, 51));
        shopID.setFont(font);
        this.add(shopID);



        cShop = new JLabel("Creating Shop");
        cShop.setBounds(502, 50, 300, 35);
        cShop.setForeground(new Color(0, 0, 51));
        cShop.setFont(new Font("Arial Rounded MT Bold", 0, 24));
        this.add(cShop);



        usernameField = new JTextField();
        usernameField.setBounds(675, 254, 285, 32);
        usernameField.setFont(font);
        usernameField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        usernameField.addActionListener(this);
        this.add(usernameField);



        shopidTF = new JTextField();
        shopidTF.setBounds(675, 320, 285, 32);
        shopidTF.setFont(font);
        shopidTF.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        this.add(shopidTF);

        
        userPasswordField = new JPasswordField();
        userPasswordField.setBounds(675, 394, 285, 32);
        userPasswordField.setFont(font);
        userPasswordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        this.add(userPasswordField);



        nextButton = new JButton("Next");
        nextButton.setBounds(502, 610, 95, 35);
        nextButton.setBackground(new Color(0, 0, 51));
        nextButton.setForeground(new Color(255, 255, 255));
        nextButton.setFont(font);
        nextButton.setFocusable(false);
        nextButton.addMouseListener(this);
        nextButton.addActionListener(this);
        this.add(nextButton);



        backButton = new JButton("Back");
        backButton.setBounds(870, 45, 85, 35);
        backButton.setBackground(new Color(0, 0, 51));
        backButton.setForeground(new Color(255, 255, 255));
        backButton.setFont(font);
        backButton.setFocusable(false);
        backButton.addMouseListener(this);
        backButton.addActionListener(this);
        this.add(backButton);
       

    }

    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
    {
        if(me.getSource() == nextButton)
        {
            nextButton.setBackground(Color.WHITE);
            nextButton.setForeground(new Color(0,0,51));
        }
        else if(me.getSource() == backButton)
        {
            backButton.setBackground(Color.WHITE);
            backButton.setForeground(new Color(0,0,51));
        }
        
        else
        {
            
        }
    }
    public void mouseExited(MouseEvent me)
    {
        if(me.getSource() == nextButton)
        {
            nextButton.setBackground(new Color(0, 0, 51));
            nextButton.setForeground(new Color(255, 255, 255));
        }

        else if(me.getSource() == backButton)
        {

            backButton.setBackground(new Color(0, 0, 51));
            backButton.setForeground(new Color(255, 255, 255));

        }
        
        else
        {
            
        }
    }

   

    public void actionPerformed(ActionEvent e)
    {
        
       String command = e.getActionCommand();


       if(nextButton.getText().equals(command))
       {

        String adminUsername = this.usernameField.getText();
           

        Homepage h =new Homepage(adminUsername,this);
        Employee em =new Employee(adminUsername,this);

            
        Management m = new Management(this,h,em);
        m.setVisible(true);
        this.setVisible(false);

       }
       else 
       {}

     if(backButton.getText().equals(command))
     {

       l.setVisible(true);
      this.setVisible(false);

     }
     else 
     {}
                
        
    }

    
}
