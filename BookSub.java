import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookSub extends JFrame 
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
    JButton back = new JButton("Back");

    JLabel ProductIDLP= new JLabel("Product ID:");
    JLabel productLP= new JLabel("Product Name:");
    JLabel authorNameLP= new JLabel("Author Name:");
    JLabel ISBNLP= new JLabel("ISBN:");
    JLabel ProductLP= new JLabel("Product Price:");
    JLabel PublishingYearLP= new JLabel("Publish Year:");
    JLabel PublishHouseLP= new JLabel("Publis House:");
    JLabel NrOfPagesLP= new JLabel("Nr Of Pages:");

    JLabel BookPanelSubLP= new JLabel("'BOOK PANEL SUBMISSION'");
    public BookSub(){
        setSize(340,380);
        setLayout(null);
        setLocationRelativeTo(null);
        setLayout(null);
        // Title on Cardwrapper

        //ProductID
        authorTF.setSize(100,20);
        authorTF.setLocation(80,50);
        add(authorTF);
        //ProductName
        ISBNTF.setSize(100,20);
        ISBNTF.setLocation(105,85);
        add(ISBNTF);
        //ProductJTXT
        NrOfPagesTF.setSize(100,20);
        NrOfPagesTF.setLocation(103,190);
        add(NrOfPagesTF);
        //Subbmit Button
        submit.setSize(100,20);
        submit.setLocation(15,310);
        submit.addActionListener(this);
        add(submit);
        //Back Button
        back.setSize(100,20);
        back.setLocation(130,310);
        back.addActionListener(this);
        add(back);

        cardWrapper.setSize(600,600);
        cardWrapper.setLocation(0,0);
        cardWrapper.setBackground(Color.green);
        cardWrapper.setLayout(c1);
        //Publish Year
        productIDTF.setSize(100,20);
        productIDTF.setLocation(95,220);
        add(productIDTF);
        //PublishHouseLP
        productNameTF.setSize(100,20);
        productNameTF.setLocation(97,250);
        add(productNameTF);
        //Author Name
        costTF.setSize(100,20);
        costTF.setLocation(100,120);
        add(costTF);
        //ISBN
        yearOfPublicationTF.setSize(100,20);
        yearOfPublicationTF.setLocation(50,160);
        add(yearOfPublicationTF);
        // NR Of Pages
        publishingHouseTF.setSize(100,20);
        publishingHouseTF.setLocation(95,280);
        add(publishingHouseTF);

        // JLAbels
        BookPanelSubLP.setSize(180,50);
        BookPanelSubLP.setLocation(100,2);
        add(BookPanelSubLP);
        
        
        ProductIDLP.setSize(130,60);
        ProductIDLP.setLocation(20,30);
        add(ProductIDLP);

        productLP.setSize(130,60);
        productLP.setLocation(20,65);
        add(productLP);

        authorNameLP.setSize(130,60);
        authorNameLP.setLocation(20,100);
        add(authorNameLP);

        ISBNLP.setSize(130,60);
        ISBNLP.setLocation(20,140);
        add(ISBNLP);

        ProductLP.setSize(130,60);
        ProductLP.setLocation(20,170);
        add(ProductLP);

        PublishingYearLP.setSize(130,60);
        PublishingYearLP.setLocation(20,200);
        add(PublishingYearLP);

        PublishHouseLP.setSize(130,60);
        PublishHouseLP.setLocation(20,230);
        add(PublishHouseLP);

        NrOfPagesLP.setSize(130,60);
        NrOfPagesLP.setLocation(20,260);
        add(NrOfPagesLP);

        add(cardWrapper);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submit){
            //String author = authorTF.getText();

            String ISBN = ISBNTF.getText();

            int author = Integer.parseInt (authorTF.getText());

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

        if(e.getSource() == back){
            return;
        }

    }
}
