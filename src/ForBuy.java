import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForBuy extends Container {
    public JLabel divideLabel;
    public static JTextArea text;
    private JButton buttonWatch;
    private JButton buttonExit;

    private JButton addButton;
    private JButton listButton;

    public ForBuy() {
        setSize(650, 500);
        setLayout(null);

        text = new JTextArea();
        text.setBounds(90, 50, 470, 200);
        add(text);

        buttonWatch = new JButton("Watch variants");
        buttonWatch.setBounds(90, 300, 470, 40);
        buttonWatch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PackageData pd = new PackageData("WATCH");
                Main.connect(pd);

            }
        });
        add(buttonWatch);

        divideLabel = new JLabel("_______________________________________________________________________________");
        divideLabel.setBounds(100, 0, 550, 46);
        add(divideLabel);

        buttonExit = new JButton("Exit");
        buttonExit.setBounds(0, 0, 100, 30);
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.firstWindow.setVisible(true);
                Main.frame.forbuyWindow.setVisible(false);
            }
        });
        add(buttonExit);

        addButton = new JButton("Sell");
        addButton.setBounds(100, 0, 100, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.forbuyWindow.setVisible(false);
                Main.frame.forsellWindow.setVisible(true);
            }
        });
        add(addButton);

        listButton = new JButton("Buy");
        listButton.setBounds(200, 0, 100, 30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.forbuyWindow.setVisible(false);
                Main.frame.forbuyWindow.setVisible(true);

            }
        });
        add(listButton);

        addButton = new JButton("Rent out");
        addButton.setBounds(300, 0, 100, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.forbuyWindow.setVisible(false);
                Main.frame.forrentoutWindow.setVisible(true);
            }
        });
        add(addButton);

        listButton = new JButton("Rent");
        listButton.setBounds(400, 0, 100, 30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.forbuyWindow.setVisible(false);
                Main.frame.forrentWindow.setVisible(true);

            }
        });
        add(listButton);


    }
}

