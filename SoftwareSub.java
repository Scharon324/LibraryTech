
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SoftwareSub extends JFrame 
implements ActionListener {
    JPanel cardWrapper = new JPanel();
    CardLayout c1 = new CardLayout();

    private JButton submit;
    private JTextField productIDTF;
    private JTextField CPUTF;
    private JTextField productNameTF;
    private JTextField OSTF;
    private JTextField RAMTF;
    private JTextField publishingHouseTF;
    private JTextField yearOfPublicationTF;
    private JTextField costTF;
    private JLabel productID;
    private JLabel CPU;
    private JLabel productName;
    private JLabel OS;
    private JLabel RAM;
    private JLabel publishingHouse;
    private JButton BackButton;
    private JLabel yearOfPublication;
    private JLabel cost;
    private JLabel jcomp19;

    public SoftwareSub() {
        //adjust size and set layout
        setSize(300, 373);
        setLayout (null);
        setVisible(true);

        //construct components
        submit = new JButton ("Submit");
        productIDTF = new JTextField (20);
        CPUTF = new JTextField (20);
        productNameTF = new JTextField (20);
        OSTF = new JTextField (20);
        RAMTF = new JTextField (20);
        publishingHouseTF = new JTextField (20);
        yearOfPublicationTF = new JTextField (20);
        costTF = new JTextField (20);
        productID = new JLabel ("Product ID:");
        CPU = new JLabel ("CPU Name:");
        productName = new JLabel ("Product Name:");
        OS = new JLabel ("OS Name:");
        RAM = new JLabel ("RAM:");
        publishingHouse = new JLabel ("Publishing House:");
        BackButton = new JButton ("Back");
        yearOfPublication = new JLabel ("Year Of Publication:");
        cost = new JLabel ("Cost:");
        jcomp19 = new JLabel ("SOFTWARE INFORMATION SUBMISSION");

        //add components
        add (submit);
        submit.addActionListener(this);
        add (productIDTF);
        add (CPUTF);
        add (productNameTF);
        add (OSTF);
        add (RAMTF);
        add (publishingHouseTF);
        add (yearOfPublicationTF);
        add (costTF);
        add (productID);
        add (CPU);
        add (productName);
        add (OS);
        add (RAM);
        add (publishingHouse);
        add (BackButton);
        add (yearOfPublication);
        add (cost);
        add (jcomp19);

        //Card Wrapper

        cardWrapper.setSize(600,600);
        cardWrapper.setLocation(0,0);
        cardWrapper.setBackground(Color.ORANGE);
        cardWrapper.setLayout(c1);
        add(cardWrapper);
        //set component bounds (only needed by Absolute Positioning)
        submit.setBounds (25, 315, 100, 20);
        productIDTF.setBounds (115, 25, 100, 25);
        CPUTF.setBounds (115, 60, 100, 25);
        productNameTF.setBounds (115, 95, 100, 25);
        OSTF.setBounds (115, 130, 100, 25);
        RAMTF.setBounds (115, 165, 100, 25);
        publishingHouseTF.setBounds (115, 200, 100, 25);
        yearOfPublicationTF.setBounds (115, 235, 100, 25);
        costTF.setBounds (115, 270, 100, 25);
        productID.setBounds (50, 25, 70, 25);
        CPU.setBounds (50, 55, 65, 30);
        productName.setBounds (30, 95, 85, 25);
        OS.setBounds (55, 130, 60, 25);
        RAM.setBounds (85, 165, 30, 25);
        publishingHouse.setBounds (10, 200, 105, 25);
        BackButton.setBounds (135, 315, 99, 20);
        yearOfPublication.setBounds (0, 235, 115, 25);
        cost.setBounds (80, 270, 35, 25);
        jcomp19.setBounds (50, -5, 230, 25);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submit){
            int i = 0;

            //String author = authorTF.getText();

            String OS = OSTF.getText();

            int CPU = Integer.parseInt (CPUTF.getText());

            //String NrOfPages = NrOfPagesTF.getText();

            int RAM = Integer.parseInt (RAMTF.getText());

            String productID = productIDTF.getText();

            //int productID = Integer.parseInt (productIDTF.getText());

            String productName = productNameTF.getText();

            int cost = Integer.parseInt (costTF.getText());

            //String cost = costTF.getText();
            String yearOfPublication = yearOfPublicationTF.getText();

            //int publishingHouse = Integer.parseInt (publishingHouseTF.getText());

            String publishingHouse = publishingHouseTF.getText();

            // Saves users details into objects
            //String OS = OSTF.getText();


            
            Main.softwareList[Main.noOfSoftware] = new Software(CPU,OS,RAM,productID, productName,cost,  yearOfPublication, publishingHouse);
            Main.noOfSoftware++;

            //Clear the textfield screen
            CPUTF.setText("");
            OSTF.setText("");
            RAMTF.setText("");
            productIDTF.setText("");
            productNameTF.setText("");
            costTF.setText("");
            yearOfPublicationTF.setText("");
            publishingHouseTF.setText("");
        }
    }
    /*
    public static void main (String[] args) {
    JFrame frame = new JFrame ("MyPanel");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add (new MyPanel());
    frame.pack();
    frame.setVisible (true);
    }
     */
}
