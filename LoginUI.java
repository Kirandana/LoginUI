import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class LoginUI implements ActionListener {

    JFrame frame = new JFrame();
    JLabel header, reset;
    JTextField username;
    JTextField password;
    JButton login = new JButton();

    Font myFont = new Font("Arial", Font.PLAIN, 12);
    Font headerFont = new Font("Arial", Font.BOLD, 20);
    Font resetFont = new Font("Arial", Font.PLAIN, 10);

    LoginUI() {

        frame = new JFrame("Login UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(null);

        JLabel header = new JLabel("Login Page");
        header.setBounds(90, 65, 200, 25);
        header.setFont(headerFont);

        username = new JTextField("Username");
        username.setBounds(45, 105, 200, 25);
        username.setFont(myFont);
        username.setBorder(BorderFactory.createEmptyBorder()); // Removes outline

        password = new JTextField("Password");
        password.setBounds(45, 135, 200, 25);
        password.setFont(myFont);
        password.setBorder(BorderFactory.createEmptyBorder());

        login = new JButton("Sign In");
        login.setBounds(45, 165, 200, 25);
        login.setFont(myFont);
        login.setBackground(Color.BLACK); // Color of the Button
        login.setForeground(Color.WHITE); // Color of the text
        login.setBorder(BorderFactory.createEmptyBorder());
        login.setFocusable(false);
        login.addActionListener(this);

        reset = new JLabel("Forgot password?");
        reset.setBounds(110, 193, 200, 25);
        reset.setFont(resetFont);
        reset.setForeground(Color.BLUE);

        frame.add(reset);
        frame.add(header);
        frame.add(login);
        frame.add(password);
        frame.add(username);
        frame.setVisible(true);
        frame.setResizable(false);

    }

    public static void main(String[] args) {

        LoginUI app = new LoginUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(username.getText() + " has logged in");
    }
}
