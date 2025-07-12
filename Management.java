import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Management extends JFrame implements ActionListener,MouseListener
{
    ImageIcon img;
    JLabel sms,title,frameImage;
    JPanel leftPanel;
    JButton productMNG,employeeMNG,shopINFO,exitButton,backButton;
    Font font;
    Shop s;
    Homepage h;
    Employee em;
      

    
    public Management(Shop s,Homepage h,Employee em)
    {

        this.s =s ;
        this.h=h;
        this .em = em;        
    	
            

        font = new Font("Arial Rounded MT Bold", 0, 18);

        this.setTitle("Management");
        this.setSize(1300, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        leftPanel = new JPanel();
        leftPanel.setBounds(0,0,480,800);
        leftPanel.setLayout(null);
        leftPanel.setBackground(new Color(0, 0, 51));
        this.add(leftPanel);


        ImageIcon img =new ImageIcon("Image/iconmonstr-shop-7-240.png");
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



        title = new JLabel("Manage Shop");
        title.setBounds(500, 50, 200, 40);
        title.setForeground(new Color(0, 0, 51));
        title.setFont(new Font("Arial Rounded MT Bold", 0, 24));
        this.add(title);



        productMNG = new JButton("PRODUCT MANAGEMENT");
        productMNG.setBounds(535, 200, 300, 200);
        productMNG.setBackground(new Color(0, 0, 51));
        productMNG.setForeground(new Color(255, 255, 255));
        productMNG.setFont(font);
        productMNG.setFocusable(false);
        productMNG.addActionListener(this);
        productMNG.addMouseListener(this);
        this.add(productMNG);



        employeeMNG = new JButton("EMPLOYEE MANAGEMENT");
        employeeMNG.setBounds(900, 200, 335, 200);
        employeeMNG.setBackground(new Color(0,0,51));
        employeeMNG.setForeground(new Color(255,255,255));
        employeeMNG.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        employeeMNG.setFocusable(false);
        employeeMNG.addActionListener(this);
        employeeMNG.addMouseListener(this);
        this.add(employeeMNG);


       
        shopINFO = new JButton("SHOP INFO");
        shopINFO.setBounds(535, 500, 300, 200);
        shopINFO.setBackground(new Color(0,0,51));
        shopINFO.setForeground(new Color(255,255,255));
        shopINFO.setFont(new Font("Arial Rounded MT Bold", 0, 24));
        shopINFO.setFocusable(false);
        shopINFO.addActionListener(this);
        shopINFO.addMouseListener(this);
        this.add(shopINFO);

        

        backButton = new JButton("LOG OUT");
        backButton.setBounds(900, 500, 335, 200);
        backButton.setBackground(new Color(0, 0, 51));
        backButton.setForeground(new Color(255, 255, 255));
        backButton.setFont(font);
        backButton.setFocusable(false);
        backButton.addActionListener(this);
        backButton.addMouseListener(this);
        this.add(backButton);



        exitButton = new JButton("Exit");
        exitButton.setBounds(1100, 50, 100, 40);
        exitButton.setBackground(new Color(0, 0, 51));
        exitButton.setForeground(new Color(255, 255, 255));
        exitButton.setFont(font);
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);
        exitButton.addMouseListener(this);
        this.add(exitButton);




    }




    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
    {

        if (me.getSource() == productMNG)
        {
            productMNG.setBackground(Color.WHITE);
            productMNG.setForeground(new Color(0,0,51));
        }
        
        else if(me.getSource() == employeeMNG)
        {
            employeeMNG.setBackground(Color.WHITE);
            employeeMNG.setForeground(new Color(0,0,51));
        }
         else if(me.getSource() == shopINFO)
        {
            shopINFO.setBackground(Color.WHITE);
            shopINFO.setForeground(new Color(0,0,51));
        }
         else if(me.getSource() == backButton)
        {
            backButton.setBackground(Color.WHITE);
            backButton.setForeground(new Color(0,0,51));
        }
         else if(me.getSource() == exitButton)
        {
            exitButton.setBackground(Color.WHITE);
            exitButton.setForeground(new Color(0,0,51));
        }
        else 
        {

        }
        


        
    }
    public void mouseExited(MouseEvent me)
    {
        

        if (me.getSource() == productMNG)
        {
            productMNG.setForeground(Color.WHITE);
            productMNG.setBackground(new Color(0,0,51));
        }
        
        else if(me.getSource() == employeeMNG)
        {
            employeeMNG.setForeground(Color.WHITE);
            employeeMNG.setBackground(new Color(0,0,51));
        }
         else if(me.getSource() == shopINFO)
        {
            shopINFO.setForeground(Color.WHITE);
            shopINFO.setBackground(new Color(0,0,51));
        }
         else if(me.getSource() == backButton)
        {
            backButton.setForeground(Color.WHITE);
            backButton.setBackground(new Color(0,0,51));
        }
         else if(me.getSource() == exitButton)
        {
            exitButton.setForeground(Color.WHITE);
            exitButton.setBackground(new Color(0,0,51));
        }
        else 
        {
            
        }


    }



    
     public void actionPerformed(ActionEvent e)
    {
  

        String command = e.getActionCommand();

        String adminUsername = s.usernameField.getText();


         if(productMNG.getText().equals(command))
       {
           
             h.setVisible(true);
             this.setVisible(false);   
         


       }

       else 
       {}

         if(employeeMNG.getText().equals(command))
          {
           
        
             em.setVisible(true);
             this.setVisible(false);
             

          }

          else 
          {}

       if(shopINFO.getText().equals(command))
       {
           
          
             String adminLocation = s.shopidTF.getText();
             String adminPassword = s.userPasswordField.getText();


             ShopInfo i = new ShopInfo(adminUsername,adminLocation,adminPassword,s,h,em);
             i.setVisible(true);
             this.setVisible(false);   
         

       }
       else 
       {}

    	if(e.getSource() == backButton)
    	{



            Login l = new Login();
            l.setVisible(true);
            this.setVisible(false);

    	}

    	else if(e.getSource() == exitButton)
    	{
    		System.exit(0);
    	}

    	else
    	{}
    }



 
}