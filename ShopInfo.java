import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShopInfo extends  JFrame implements ActionListener,MouseListener
{

    ImageIcon icon;
    JLabel shopinfo,sName,sLocation,sID,cShop,frameImage;
    JPanel leftPanel;
    JButton backButton;
    Font font;
    Shop s;
    Homepage h;
    Employee em;
   
 
    
    public ShopInfo(String adminUsername,String adminLocation, String adminPassword,Shop s,Homepage h,Employee em)
    {

    	
        this.s =s;
        this.h=h;
        this.em=em;
       

        font = new Font("Arial Rounded MT Bold", 0, 18);


        this.setTitle("Shop Management System");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        leftPanel = new JPanel();
        leftPanel.setBounds(0,0,400,600);
        leftPanel.setBackground(new Color(0, 0, 51));
        leftPanel.setLayout(null);
        this.add(leftPanel);


        ImageIcon icon =new ImageIcon("Image/iconmonstr-info-7-240.png");
        frameImage = new JLabel(icon);
        frameImage.setBounds(0,100,400,400);
        leftPanel.add(frameImage);
        this.add(leftPanel);


        shopinfo = new JLabel("Shop Information");
        shopinfo.setBounds(30, 50, 400, 45);
        shopinfo.setForeground(new Color(255, 255, 255));
        shopinfo.setFont(new Font("Arial Rounded MT Bold",0,32));
        leftPanel.add(shopinfo);
        this.add(leftPanel);


        sName = new JLabel("Shop name : "+adminUsername );
        sName.setBounds(450, 200, 400, 45);
        sName.setForeground(new Color(0, 0, 51));
        sName.setFont(font);
        this.add(sName);


        sLocation = new JLabel("Shop locatoin : "+adminLocation );
        sLocation.setBounds(450, 250, 400, 45);
        sLocation.setForeground(new Color(0, 0, 51));
        sLocation.setFont(font);
        this.add(sLocation);


        sID = new JLabel("Shop ID : "+adminPassword );
        sID.setBounds(450, 300, 400, 45);
        sID.setForeground(new Color(0, 0, 51));
        sID.setFont(font);
        this.add(sID);



        cShop = new JLabel("Shop info");
        cShop.setBounds(450, 50, 300, 35);
        cShop.setForeground(new Color(0, 0, 51));
        cShop.setFont(new Font("Arial Rounded MT Bold", 0, 24));
        this.add(cShop);


        backButton = new JButton("Back");
        backButton.setBounds(450, 500, 85, 35);
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
        if(me.getSource() == backButton)
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
        if(me.getSource() == backButton)
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
         if (e.getSource() == backButton)


         {
            

                     Management m = new Management(s,h,em);
                    m.setVisible(true);
                    this.setVisible(false);




         }
         else 
         {}
     }

        
}