
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame implements 
ActionListener{
    //public JMenuBar menuBar;
    JMenuBar menuBar = new JMenuBar();
    JPanel cardWrapper = new JPanel();
    CardLayout c1 = new CardLayout();
    //Button 1
    JButton productsList = new JButton("Products List");
    //ProductPanel productPanel = new ProductPanel();
    //Button 2
    JButton books = new JButton("Books List");
    //Button 3
    JButton software = new JButton("Software List");
    // Button 5
    JButton bookOrder = new JButton("Book Order");
    //Button 7
    JButton softwareOrder = new JButton("Software Order");
    // Button 6
    JButton showProductDetails = new JButton("Show Order Details");
    //Button 4
    JButton exit = new JButton("Exit");
    // Array for Books
    static Book [] bookList = new Book [200];
    static int noOfBook = 0;
    // Array for Software
    static Software [] softwareList = new Software [200];
    static int noOfSoftware = 0;
    public Main(){
        //sets JFrame Size and Layout to null
        setSize(600,600);
        setLayout(null);
        //construct preComponents adds bark inside the programs to have extra bars
        JMenu fileMenu = new JMenu ("File");
        JMenuItem exitItem = new JMenuItem ("Exit");
        fileMenu.add (exitItem);
        JMenu helpMenu = new JMenu ("Help");
        JMenuItem contentsItem = new JMenuItem ("Contents");
        helpMenu.add (contentsItem);
        JMenuItem aboutItem = new JMenuItem ("About");
        helpMenu.add (aboutItem);
        // Menu bar up in the frame
        menuBar = new JMenuBar();
        menuBar.add (fileMenu);
        menuBar.add (helpMenu);
        add (menuBar);
        menuBar.setBounds (0, 0, 675, 25);
        // sets JFrame and buttons to the center of the screen
        setLocationRelativeTo(null);
        //creates the buttons inside the Jframe for the user to click on
        //Button 1
        productsList.setSize(160,25);
        productsList.setLocation(200,50);
        productsList.addActionListener(this);

        add(productsList);
        //Button 2
        books.setSize(160,25);
        books.setLocation(200,85);
        books.addActionListener(this);
        add(books);
        //Button 3
        software.setSize(160,25);
        software.setLocation(200,115);
        software.addActionListener(this);
        add(software);
        //Button 4
        exit.setSize(100,25);
        exit.setLocation(200,250);
        exit.addActionListener(this);
        add(exit);
        //Button 5
        bookOrder.setSize(160,25);
        bookOrder.setLocation(200,145);
        bookOrder.addActionListener(this);
        add(bookOrder);
        //Button 7
        softwareOrder.setSize(160,25);
        softwareOrder.setLocation(200,190);
        softwareOrder.addActionListener(this);
        add(softwareOrder);

        // Button 6
        showProductDetails.setSize(160,30);
        showProductDetails.setLocation(200,210);
        showProductDetails.addActionListener(this);
        add(showProductDetails);
        ///////////////////////////

        //Product e1 = new Product(12,"",22, "", "");

        //e1.setProductID(225);
        //e1.setProductName("This is Product Name");
        //e1.setCost(22);
        //e1.setYearOfPublication("Year Of Publication");
        //e1.setPublishingHouse("Publishing House");
        //e1.printDetails();

        // sets GUI to visible
        setVisible(true);
    }

    public static void main(String [] args){
        new Main();
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == exit){
            System.exit(0);
        }
        // TEST
        //if(e.getSource() == productsList){
        //    ViewPurchase viewPurchase = new ViewPurchase();
        //}

        if(e.getSource() == books){
            BookList BookList = new BookList();
        }

        if(e.getSource() == bookOrder){
            BookSub productPanelSelection = new BookSub();
        }

        if(e.getSource() == softwareOrder){
            SoftwareSub productPanelSelection = new SoftwareSub();
        }

        if(e.getSource() == showProductDetails){
            int x = 0;
            while(x < Main.noOfBook){
                System.out.println("==================================================:");
                System.out.println("Book Details:");
                System.out.println("==================================================:");
                String author = bookList[x].getAuthor();
                System.out.println("Author Name " +author);

                String ISBN = bookList[x].getISBN();
                System.out.println("ISBN Number: "+ISBN);

                int NrOfPages = bookList[x].getNrOfPages();
                System.out.println("Nr Of Pages: " +NrOfPages);

                int productID = bookList[x].getProductID();
                System.out.println("Product ID: " +productID);

                String productName = bookList[x].getProductName();
                System.out.println("Product Name: " +productName);

                double cost = bookList[x].getCost();
                System.out.println("Cost: "+cost);

                String yearOfPublication = bookList[x].getYearOfPublication();
                System.out.println("Year Of Publication: "+yearOfPublication);

                String publishingHouse = bookList[x].getPublishingHouse();
                System.out.println("Publishin House: "+ publishingHouse);

                x++;
            }

        }

        if(e.getSource() == showProductDetails){
            int x = 0;
            while(x < Main.noOfSoftware){
                System.out.println("==================================================:");
                System.out.println("Software Details:");
                System.out.println("==================================================:");

                String OS = softwareList[x].getOS();
                System.out.println("OS: " +OS);

                String CPU = softwareList[x].getCPU();
                System.out.println("CPU: "+CPU);

                int RAM = softwareList[x].getRAM();
                System.out.println("RAM: " +RAM);

                int productID = softwareList[x].getProductID();
                System.out.println("Product ID: " +productID);

                String productName = softwareList[x].getProductName();
                System.out.println("Product Name: " +productName);

                double cost = softwareList[x].getCost();
                System.out.println("Cost: "+cost);

                String yearOfPublication = softwareList[x].getYearOfPublication();
                System.out.println("Year Of Publication: "+yearOfPublication);

                String publishingHouse = softwareList[x].getPublishingHouse();
                System.out.println("Publishin House: "+ publishingHouse);

                x++;
            }
        }

        if(e.getSource() == software){
            SoftwareList softwareList = new SoftwareList();
        }
    }
}
