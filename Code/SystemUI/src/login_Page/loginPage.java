package login_Page;

import tableLayout.Tabledisplay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginPage {

    /**
     * @wbp.nonvisual location=150,-29
     */
    private final JTextField textField = new JTextField();
    private JFrame frame;
    private JTextField usernameEntry;
    private JPasswordField passwordEntry;

    /**
     * Create the application.
     */
    public loginPage() {
        initialize();
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    loginPage window = new loginPage();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        textField.setColumns(10);
        frame = new JFrame();
        frame.setBounds(200, 200, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Restraunt Name: Login Page");
        lblNewLabel.setBounds(165, 16, 262, 16);
        frame.getContentPane().add(lblNewLabel);

        JLabel usernameTxt = new JLabel("Username:");
        usernameTxt.setBounds(112, 91, 81, 16);
        frame.getContentPane().add(usernameTxt);

        JLabel passwordTxt = new JLabel("Password:");
        passwordTxt.setBounds(112, 145, 81, 21);
        frame.getContentPane().add(passwordTxt);

        usernameEntry = new JTextField();
        usernameEntry.setBounds(182, 83, 195, 32);
        frame.getContentPane().add(usernameEntry);
        usernameEntry.setColumns(10);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameEntry.getText();
                String password = passwordEntry.getText();

                if (username.contains("admin") && password.contains("admin")) {
                    usernameEntry.setText(null);
                    passwordEntry.setText(null);

                    frame.dispose();
                    Tabledisplay display = new Tabledisplay();
                    Tabledisplay.main(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Please retry", JOptionPane.ERROR_MESSAGE);
                    usernameEntry.setText(null);
                    passwordEntry.setText(null);
                }
            }
        });
        loginButton.setBounds(6, 213, 117, 29);
        frame.getContentPane().add(loginButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                usernameEntry.setText(null);
                passwordEntry.setText(null);

            }
        });
        clearButton.setBounds(182, 213, 117, 29);
        frame.getContentPane().add(clearButton);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                frame = new JFrame("Exit");
                if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Login Page",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }


            }
        });
        exitButton.setBounds(352, 213, 131, 32);
        frame.getContentPane().add(exitButton);

        passwordEntry = new JPasswordField();
        passwordEntry.setBounds(182, 142, 213, 26);
        frame.getContentPane().add(passwordEntry);
    }
}
