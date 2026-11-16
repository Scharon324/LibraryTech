import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginUsers extends JFrame implements 
ActionListener{

    public JButton logInButton;
    public JLabel welcomeScreen;
    public JTextField user1TxtField;
    public JLabel userLab;
    public JLabel passLab;
    public JMenuBar menuBar;
    public JButton exitButton;
    public JButton customLogIn;
    public JPasswordField passwordfield;
    //static PersonName [] personName = new PersonName [200];
    //static PersonPassword [] personPassword = new PersonPassword [200];

    //String username = new String(userLab.getText());  
    //String password = new String(passLab.getText());  

    public LoginUsers(){
        //sets JFrame Size and Layout to null
        super("Login Autentification");
        setSize(700,600);
        setLayout(null);
        // sets JFrame and buttons to the center of the screen
        setLocationRelativeTo(null);

        //construct preComponents
        JMenu fileMenu = new JMenu ("File");
        JMenuItem exitItem = new JMenuItem ("Exit");
        fileMenu.add (exitItem);
        JMenu helpMenu = new JMenu ("Help");
        JMenuItem contentsItem = new JMenuItem ("Contents");
        helpMenu.add (contentsItem);
        JMenuItem aboutItem = new JMenuItem ("About");
        helpMenu.add (aboutItem);

        logInButton = new JButton ("Manager Log In");
        welcomeScreen = new JLabel ("Welcome");
        user1TxtField = new JTextField (26);
        userLab = new JLabel ("Username:");
        passLab = new JLabel ("Password:");
        passwordfield = new JPasswordField (5);
        menuBar = new JMenuBar();
        menuBar.add (fileMenu);
        menuBar.add (helpMenu);
        exitButton = new JButton ("Exit");
        customLogIn = new JButton ("Customer Log In");
        helpMenu.addActionListener(this);
        logInButton.addActionListener(this);
        customLogIn.addActionListener(this);
        exitButton.addActionListener(this);

        //add components
        add (logInButton);
        add (welcomeScreen);
        add (user1TxtField);
        add (passwordfield);
        add (userLab);
        add (passLab);
        add (menuBar);
        add (exitButton);
        add (customLogIn);

        //set component bounds (only needed by Absolute Positioning)
        logInButton.setBounds (150, 245, 140, 20);
        welcomeScreen.setBounds (300, 40, 60, 25);
        user1TxtField.setBounds (330, 100, 100, 25);
        userLab.setBounds (210, 100, 100, 25);
        passLab.setBounds (210, 135, 100, 25);
        menuBar.setBounds (0, 0, 675, 25);
        exitButton.setBounds (415, 245, 140, 20);
        customLogIn.setBounds (290, 245, 127, 20);
        passwordfield.setBounds (330, 135, 100, 25);
        // sets GUI to visible
        setVisible(true);
    }

    public static void main(String [] args){
        new LoginUsers();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == customLogIn){
            Main Main = new Main();
            setVisible(false);
        }
        if(e.getSource() == exitButton){
            System.exit(0);
        }
        // Password and Username Login System
        String puname = user1TxtField.getText();
        String ppaswd = passwordfield.getText();
        if(puname.equals("test") && ppaswd.equals("12345") || puname.equals("test2") && ppaswd.equals("123") ) {
            Main Main = new Main();
            setVisible(false);
        } else {

            JOptionPane.showMessageDialog(null,"Wrong Password / Username");
            setVisible(false);
            user1TxtField.setText("");
            passwordfield.setText("");
            user1TxtField.requestFocus();
        }

    }
}