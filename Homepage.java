import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JOptionPane.showMessageDialog;


public class Homepage extends  JFrame implements ActionListener,MouseListener
{

	ImageIcon img,img1;
    JLabel  frameImage,frameImage1,sms,hPage,productName,productPrice,productID,productType,productCat,label1,rmvprd;
    JPanel leftPanel,topPanel;
    JButton addButton, backButton,deleteButton,searchButton;
    JTextField pIDTF,pPriceTF,pNameTF,removeproduct;
    Font font;
    JComboBox combo,combo1;
    JTable table;

    String [] cols = {"ID","Name","Price","Type","Catagory"};

    String [][] rows ={};

    JScrollPane jScrollPane1;
    DefaultTableModel model = new DefaultTableModel(rows,cols);

    Shop s;
    //Product p;

    Product products[]=new Product[50];
    Product prd;


    
    public Homepage(String adminUsername,Shop s)
    {

    	
        this.s =s;


        font = new Font("Arial Rounded MT Bold", 0, 18);

        this.setTitle("Shop Management System");
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        leftPanel = new JPanel();
        leftPanel.setBounds(0,0,280,800);
        leftPanel.setBackground(new Color(0, 0, 51));
        leftPanel.setLayout(null);
        this.add(leftPanel);


        topPanel = new JPanel();
        topPanel.setBounds(280,30,920,150);
        topPanel.setBackground(new Color(0, 0, 51));
        topPanel.setLayout(null);
        this.add(topPanel);


        hPage = new JLabel("Home page" );
        hPage.setBounds(70, 50, 300, 45);
        hPage.setForeground(new Color(204, 204, 204));
        hPage.setFont(new Font("Segoe UI Emoji",0,14));
        leftPanel.add(hPage);
        this.add(leftPanel);



        ImageIcon img1 =new ImageIcon("Image/iconmonstr-building-45-240.png");
        frameImage1 = new JLabel(img1);
        frameImage1.setBounds(0,300,280,400);
        leftPanel.add(frameImage1);
        this.add(leftPanel);


        ImageIcon img =new ImageIcon("Image/home-free-icon-font.png");
        frameImage = new JLabel(img);
        frameImage.setBounds(0,50,100,45);
        leftPanel.add(frameImage);
        this.add(leftPanel);


        productName = new JLabel("Product Name " );
        productName.setBounds(300, 200, 150, 40);
        productName.setForeground(new Color(0,0,51));
        productName.setFont(font);
        this.add(productName);



        label1 = new JLabel("Shop Management System" );
        label1.setBounds(300, 0, 300, 30);
        label1.setForeground(new Color(0,0,51));
        label1.setFont(new Font("Arial Rounded MT Bold", 0, 14));
        this.add(label1);



        pNameTF = new JTextField();
        pNameTF.setBounds(450, 210, 150, 25);
        pNameTF.setForeground(new Color(0,0,51));
        pNameTF.setFont(font);
        pNameTF.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        this.add(pNameTF);



        pIDTF = new JTextField();
        pIDTF.setBounds(450, 260, 150, 25);
        pIDTF.setForeground(new Color(0,0,51));
        pIDTF.setFont(font);
        pIDTF.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        this.add(pIDTF);


        pPriceTF = new JTextField();
        pPriceTF.setBounds(450, 310, 150, 25);
        pPriceTF.setForeground(new Color(0,0,51));
        pPriceTF.setFont(font);
        pPriceTF.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        this.add(pPriceTF);

        
        productID = new JLabel("Product ID " );
        productID.setBounds(300, 250, 100, 40);
        productID.setForeground(new Color(0,0,51));
        productID.setFont(font);
        this.add(productID);


        productPrice = new JLabel("Price " );
        productPrice.setBounds(300, 300, 100, 40);
        productPrice.setForeground(new Color(0,0,51));
        productPrice.setFont(font);
        this.add(productPrice);

        productType = new JLabel("Type " );
        productType.setBounds(700, 200, 150, 40);
        productType.setForeground(new Color(0,0,51));
        productType.setFont(font);
        this.add(productType);

        productCat = new JLabel("Catagory " );
        productCat.setBounds(700, 270, 150, 40);
        productCat.setForeground(new Color(0,0,51));
        productCat.setFont(font);
        this.add(productCat);


        String items[] = {"Necessary", "Luxuary"};
        combo = new JComboBox(items);
        combo.setBounds(800, 200, 150, 40);
        combo.setFont(font);
        this.add(combo);


        String items1[] = {"Foods", "Hygiene","Medicine","Cosmestics","Electronics","Accessories"};
        combo1 = new JComboBox(items1);
        combo1.setBounds(800, 270, 150, 40);
        combo1.setFont(font);
        this.add(combo1);


        sms = new JLabel("Welcome to "+adminUsername );
        sms.setBounds(180, 50, 500, 45);
        sms.setForeground(new Color(205, 205, 205));
        sms.setFont(new Font("Arial Rounded MT Bold", 0, 32));
        topPanel.add(sms);
        this.add(topPanel);


        backButton = new JButton("Back");
        backButton.setBounds(870, 720, 85, 35);
        backButton.setBackground(new Color(0, 0, 51));
        backButton.setForeground(new Color(255, 255, 255));
        backButton.setFont(font);
        backButton.setFocusable(false);
        backButton.addMouseListener(this);
        backButton.addActionListener(this);
        this.add(backButton);


        addButton = new JButton("ADD");
        addButton.setBounds(300, 400, 85, 35);
        addButton.setBackground(new Color(0, 0, 51));
        addButton.setForeground(new Color(255, 255, 255));
        addButton.setFont(font);
        addButton.setFocusable(false);
        addButton.addMouseListener(this);
        addButton.addActionListener(this);
        this.add(addButton);


        deleteButton = new JButton("Delete");
        deleteButton.setBounds(400, 400, 100, 35);
        deleteButton.setBackground(new Color(0, 0, 51));
        deleteButton.setForeground(new Color(255, 255, 255));
        deleteButton.setFont(font);
        deleteButton.setFocusable(false);
        deleteButton.addMouseListener(this);
        deleteButton.addActionListener(this);
        this.add(deleteButton);

        searchButton = new JButton("Search");
        searchButton.setBounds(810, 450, 100, 35);
        searchButton.setBackground(new Color(0, 0, 51));
        searchButton.setForeground(new Color(255, 255, 255));
        searchButton.setFont(font);
        searchButton.setFocusable(false);
        searchButton.addMouseListener(this);
        searchButton.addActionListener(this);
        this.add(searchButton);

        table = new JTable(model);
        table.setFont(new Font("Arial Rounded MT Bold", 0, 14));
        table.setForeground(new Color(0,0,51));
        table.setGridColor(new Color(255,255,255));

        jScrollPane1 =new JScrollPane(table);
        jScrollPane1.setBounds(300,500,600,200);
        this.add(jScrollPane1);

        rmvprd = new JLabel("Search Product Name " );
        rmvprd.setBounds(550, 402, 250, 40);
        rmvprd.setForeground(new Color(0,0,51));
        rmvprd.setFont(font);
        this.add(rmvprd);

        removeproduct = new JTextField();
        removeproduct.setBounds(760, 410, 150, 25);
        removeproduct.setForeground(new Color(0,0,51));
        removeproduct.setFont(font);
        removeproduct.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        this.add(removeproduct);




    }

    public void insertProduct(String prdname,String prdid,String price)
    {
        int flag =0;
        prd = new Product(prdname,prdid,price);
        for(int i=0; i<products.length; i++)
        { 
            if(products[i] == null)
            {
                products[i] = prd;
                flag = 1;
                break;

            }

        }

        if(flag == 1){JOptionPane.showMessageDialog(null, "Product Successfully Inserted!");}
        else  {JOptionPane.showMessageDialog(null, "Unsuccesful operation!");}
    }
    
    public void removeProduct(String prdname)
    {
        int flag=0;
        try{
        for(int i=0; i<products.length; i++)
        {   
                if(products[i].getProductName().equals(prdname))
                {
                    products[i] = null;
                    flag = 1;
                    break;
                }

        }
        if(flag ==1){JOptionPane.showMessageDialog(null, "Deletion Successful!");}
        else {JOptionPane.showMessageDialog(null, "Unsuccesful operation!");}
    }
     catch(NullPointerException ne)
        {
            JOptionPane.showMessageDialog(null, "Error Found");
        }
    }
    public Product searchProduct(String prdname)
    {
        Product p = null;

       

        for(int i=0; i<products.length; i++)
        {
            if(products[i] != null)
            {
                if(products[i].getProductName().equals(prdname))
                {
                    p=products[i];
                    break;
                }
            }
        }
        if(p != null)
        {
            JOptionPane.showMessageDialog(null, "Product Found!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Product Not Found!");
        }
        
    
    
    return p;

    }





    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
    {
        if(me.getSource() == addButton)
        {
            addButton.setBackground(Color.WHITE);
            addButton.setForeground(new Color(0,0,51));
        }
        else if(me.getSource() == backButton)
        {
            backButton.setBackground(Color.WHITE);
            backButton.setForeground(new Color(0,0,51));
        }
        else if(me.getSource() == deleteButton)
        {
            deleteButton.setBackground(Color.WHITE);
            deleteButton.setForeground(new Color(0,0,51));
        }
        else if(me.getSource() == searchButton)
        {
            searchButton.setBackground(Color.WHITE);
            searchButton.setForeground(new Color(0,0,51));
        }

        
        else
        {

        }

    }
    public void mouseExited(MouseEvent me)
    {
        if(me.getSource() == addButton)
        {
            addButton.setBackground(new Color(0, 0, 51));
            addButton.setForeground(new Color(255, 255, 255));
        }

        else if(me.getSource() == backButton)
        {

            backButton.setBackground(new Color(0, 0, 51));
            backButton.setForeground(new Color(255, 255, 255));

        }
        else if(me.getSource() == deleteButton)
        {

            deleteButton.setBackground(new Color(0, 0, 51));
            deleteButton.setForeground(new Color(255, 255, 255));

        }
        else if(me.getSource() == searchButton)
        {

            searchButton.setBackground(new Color(0, 0, 51));
            searchButton.setForeground(new Color(255, 255, 255));

        }


        
        else
        {

        }

    }






    public void actionPerformed(ActionEvent e)

    {
        String a = pNameTF.getText();
        String b = pIDTF.getText();
        String c = pPriceTF.getText();
        String d = combo.getSelectedItem().toString(); 
        String f = combo1.getSelectedItem().toString(); 
        String rmv= removeproduct.getText();

        if (e.getSource() == backButton)
        { 
           String adminUsername = s.usernameField.getText();      

           Employee em = new Employee(adminUsername,s);

           Management m = new Management(s,this,em);
           m.setVisible(true);
           this.setVisible(false);


       }
       else 
       {}


   if(e.getSource() == addButton)
   {

    DefaultTableModel model = (DefaultTableModel)table.getModel();

    model.addRow(new Object []{a,b,c,d,f});

    insertProduct(a,b,c);

    pNameTF.setText("");
    pIDTF.setText("");
    pPriceTF.setText("");
}



else 
{}

if(e.getSource() == deleteButton)
{
    
    removeProduct(rmv);
    removeproduct.setText("");


    int row = table.getSelectedRow();

    DefaultTableModel model = (DefaultTableModel)table.getModel();

    model.removeRow(row);


}


else 
{}
if(e.getSource() == searchButton)
{
    searchProduct(rmv);
    removeproduct.setText("");


}
else{}



}


}


