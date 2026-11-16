import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductPanelSelection extends JFrame 
implements ActionListener
{
    JMenuBar menuBar = new JMenuBar();
    JPanel cardWrapper = new JPanel();
    CardLayout c1 = new CardLayout();

    JTextField authorTF = new JTextField();
    JTextField ISBNTF = new JTextField();
    JTextField NrOfPagesTF = new JTextField();

    JTextField productIDTF = new JTextField();
    JTextField productNameTF = new JTextField();
    JTextField costTF = new JTextField();
    JTextField yearOfPublicationTF = new JTextField();
    JTextField publishingHouseTF = new JTextField();
    JButton submit = new JButton("Submit");

    JLabel authorLP= new JLabel("Pro ID");
    /*
    JLabel L2= new JLabel("Pro Name");
    JLabel L3= new JLabel("Pro Price");
    JLabel L4= new JLabel("Publish Year");
    JLabel L5= new JLabel("Publis House");
    JLabel L6= new JLabel("Author Name");
    JLabel L7= new JLabel("ISBN");
    JLabel L8= new JLabel("No Of Pages");*/

    public ProductPanelSelection(){
        setSize(600,600);
        setLayout(null);
        setLocationRelativeTo(null);
        setBackground(Color.GREEN);
        setLayout(null);

        authorTF.setSize(100,20);
        authorTF.setLocation(80,30);
        add(authorTF);

        ISBNTF.setSize(100,20);
        ISBNTF.setLocation(50,100);
        add(ISBNTF);

        NrOfPagesTF.setSize(100,20);
        NrOfPagesTF.setLocation(50,150);
        add(NrOfPagesTF);

        submit.setSize(100,20);
        submit.setLocation(50,200);
        submit.addActionListener(this);
        add(submit);

        cardWrapper.setSize(600,600);
        cardWrapper.setLocation(0,0);
        cardWrapper.setBackground(Color.green);
        cardWrapper.setLayout(c1);

        productIDTF.setSize(100,20);
        productIDTF.setLocation(50,250);
        add(productIDTF);

        productNameTF.setSize(100,20);
        productNameTF.setLocation(50,300);
        add(productNameTF);

        costTF.setSize(100,20);
        costTF.setLocation(50,350);
        add(costTF);

        yearOfPublicationTF.setSize(100,20);
        yearOfPublicationTF.setLocation(50,400);
        add(yearOfPublicationTF);

        publishingHouseTF.setSize(100,20);
        publishingHouseTF.setLocation(50,450);
        add(publishingHouseTF);

        
        

        authorLP.setSize(130,60);
        authorLP.setLocation(20,30);
        add(authorLP);
        
        add(cardWrapper);
        /*
         * 
        L2.setSize(130,60);
        L2.setLocation(20,65);
        add(L2);

        L3.setSize(130,60);
        L3.setLocation(20,100);
        add(L3);

        L4.setSize(130,60);
        L4.setLocation(20,140);
        add(L4);

        L5.setSize(130,60);
        L5.setLocation(20,170);
        add(L5);

        L6.setSize(130,60);
        L6.setLocation(20,200);
        add(L6);

        L7.setSize(130,60);
        L7.setLocation(20,230);
        add(L7);

        L8.setSize(130,60);
        L8.setLocation(20,260);
        add(L8);
         * 
         * 
         */

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submit){
            //String author = authorTF.getText();

            int author = Integer.parseInt (authorTF.getText());

            String ISBN = ISBNTF.getText();
            //String NrOfPages = NrOfPagesTF.getText();

            int NrOfPages = Integer.parseInt (NrOfPagesTF.getText());

            String productID = productIDTF.getText();
            
            //int productID = Integer.parseInt (productIDTF.getText());
            
            String productName = productNameTF.getText();
            
            //double cost = Integer.parseInt (costTF.getText());
            
            String cost = costTF.getText();
            String yearOfPublication = yearOfPublicationTF.getText();

            int publishingHouse = Integer.parseInt (publishingHouseTF.getText());

            //String publishingHouse = publishingHouseTF.getText();
            // Saves users details into objects

            //System.out.println(author+ ":"+ ISBN + ":" +NrOfPages+ ":");
            //Book b = new Book(author,ISBN,NrOfPages,productID,productName,cost,yearOfPublication, publishingHouse);

            Main.bookList[Main.noOfBook] = new Book(author,ISBN,NrOfPages,productID, productName,cost,  yearOfPublication, publishingHouse);
            Main.noOfBook++;

            //Clear the textfield screen
            authorTF.setText("");
            ISBNTF.setText("");
            NrOfPagesTF.setText("");
            productIDTF.setText("");
            productNameTF.setText("");
            costTF.setText("");
            yearOfPublicationTF.setText("");
            publishingHouseTF.setText("");
        }
    }

}

