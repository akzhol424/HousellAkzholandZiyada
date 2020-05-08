import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FirstPage extends Container {
    private JLabel divideLabel;
    private JLabel topicLabel;
    private JButton addButton;
    private JButton listButton;
    private JButton exitButton;

    public FirstPage(){
        setSize(650, 500);
        setLayout(null);

        divideLabel = new JLabel("___________________________________________");
        divideLabel.setBounds(170, 45, 350, 30);
        add(divideLabel);

        divideLabel = new JLabel("___________________________________________");
        divideLabel.setBounds(170, 70, 350, 30);
        add(divideLabel);

        topicLabel = new JLabel("Welcom to World of House!   We are waiting for you:)");
        topicLabel.setBounds(175, 60, 300, 30);
        add(topicLabel);

        addButton = new JButton("Sell");
        addButton.setBounds(175, 150, 300, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.firstWindow.setVisible(false);
                Main.frame.forsellWindow.setVisible(true);
            }
        });
        add(addButton);

        listButton = new JButton("Buy");
        listButton.setBounds(175, 200, 300, 30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.firstWindow.setVisible(false);
                Main.frame.forbuyWindow.setVisible(true);

            }
        });
        add(listButton);

        addButton = new JButton("Rent out");
        addButton.setBounds(175, 250, 300, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.firstWindow.setVisible(false);
                Main.frame.forrentoutWindow.setVisible(true);
            }
        });
        add(addButton);

        listButton = new JButton("Rent");
        listButton.setBounds(175, 300, 300, 30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.firstWindow.setVisible(false);
                Main.frame.forrentWindow.setVisible(true);

            }
        });
        add(listButton);

        exitButton = new JButton("EXIT");
        exitButton.setBounds(0, 0, 100, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);

        divideLabel = new JLabel("____________________________________________________________________________");
        divideLabel.setBounds(100, 0, 550, 46);
        add(divideLabel);
    }
}

