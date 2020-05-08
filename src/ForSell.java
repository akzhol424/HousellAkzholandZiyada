import javafx.scene.control.Labeled;
import javafx.scene.text.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ForSell extends Container {
    public JLabel divideLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel regionLabel;
    private JLabel cityLabel;
    private JLabel streetLabel;
    private JLabel typeLabel;
    private JLabel numberLabel;
    private JLabel areaLabel;
    private JLabel roomsLabel;
    private JLabel mobileLabel;

    private JTextField nameText;
    private JTextField surnameText;
    private String[] regions = {"Almaty","Akmola","Turkeastan","Karagandy","South Kz","Aktobe","Atyrau","Zhanbyl","Western Kz","Kostanay","Kyzylorda","Mangystau","Pavlodar","North"};
    private JComboBox regionBox;
    private JTextField cityText;
    private JTextField streetText;
    private String[] types = {"House","Apartment"};
    private JComboBox typeBox;
    private JTextField numberText;
    private JTextField areaText;
    private String[] rooms = {"1","2","3","4","5","6","7","8","9","10"};
    private JComboBox roomsBox;
    private JButton sendButton;
    private JButton exitButton;
    private JTextField mobileText;

    private JLabel agreeLable;

    private JButton addButton;
    private JButton listButton;


    public ForSell(){
        setSize(650,500);
        setLayout(null);

        nameLabel = new JLabel("NAME: ");
        nameLabel.setBounds(90, 60, 60, 30);
        add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(150, 60, 150, 30);
        add(nameText);

        surnameLabel = new JLabel("Surname: ");
        surnameLabel.setBounds(330, 60, 60, 30);
        add(surnameLabel);

        surnameText = new JTextField();
        surnameText.setBounds(390, 60, 150, 30);
        add(surnameText);

        regionLabel = new JLabel("Region: ");
        regionLabel.setBounds(90, 100, 60, 30);
        add(regionLabel);

        regionBox = new JComboBox(regions);
        regionBox.setBounds(150, 100, 150, 30);
        add(regionBox);

        cityLabel = new JLabel("City: ");
        cityLabel.setBounds(330, 100, 60, 30);
        add(cityLabel);

        cityText = new JTextField();
        cityText.setBounds(390, 100, 150, 30);
        add(cityText);

        streetLabel= new JLabel("Street: ");
        streetLabel.setBounds(90, 140, 60, 30);
        add(streetLabel);

        streetText = new JTextField();
        streetText.setBounds(150, 140, 150, 30);
        add(streetText);

        typeLabel = new JLabel("Type of home: ");
        typeLabel.setBounds(90, 180, 90, 30);
        add(typeLabel);

        typeBox = new JComboBox(types);
        typeBox.setBounds(180, 180, 150, 30);
        add(typeBox);

        numberLabel= new JLabel("Home number: ");
        numberLabel.setBounds(90, 220, 150, 30);
        add(numberLabel);

        numberText = new JTextField();
        numberText.setBounds(180, 220, 150, 30);
        add(numberText);

        areaLabel= new JLabel("Area: ");
        areaLabel.setBounds(90, 260, 60, 30);
        add(areaLabel);

        areaText = new JTextField();
        areaText.setBounds(150, 260, 150, 30);
        add(areaText);

        roomsLabel = new JLabel("Rooms: ");
        roomsLabel.setBounds(330, 260, 60, 30);
        add(roomsLabel);

        roomsBox = new JComboBox(rooms);
        roomsBox.setBounds(390, 260, 150, 30);
        add(roomsBox);

        mobileLabel= new JLabel("Mobile phone: ");
        mobileLabel.setBounds(90, 300, 90, 30);
        add(mobileLabel);

        mobileText = new JTextField();
        mobileText.setBounds(180, 300, 150, 30);
        add(mobileText);

        nameLabel = new JLabel("If you agree with license agreement,click SEND! ");
        nameLabel.setBounds(90, 340, 400, 30);
        add(nameLabel);

        sendButton = new JButton("Send");
        sendButton.setBounds(90, 370, 450, 30);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String surname = surnameText.getText();
                String region = (String)regionBox.getSelectedItem();
                String city = cityText.getText();
                String street = streetText.getText();
                String type = (String)typeBox.getSelectedItem();
                String number = numberText.getText();
                String area = areaText.getText();
                String rooms = numberText.getText();
                String mobile = numberText.getText();


                Person person = new Person(null, name, surname, region, city, street, type, number, area, rooms, mobile);
                PackageData pd = new PackageData("SEND", person);
                Main.connect(pd);

                nameText.setText("");
                surnameText.setText("");
            }
        });
        add(sendButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(0, 0, 100, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.firstWindow.setVisible(true);
                Main.frame.forsellWindow.setVisible(false);
            }
        });
        add(exitButton);

        divideLabel = new JLabel("____________________________________________________________________________");
        divideLabel.setBounds(100, 0, 550, 46);
        add(divideLabel);

        addButton = new JButton("Sell");
        addButton.setBounds(100, 0, 100, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.forsellWindow.setVisible(false);
                Main.frame.forsellWindow.setVisible(true);
            }
        });
        add(addButton);

        listButton = new JButton("Buy");
        listButton.setBounds(200, 0, 100, 30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.forsellWindow.setVisible(false);
                Main.frame.forbuyWindow.setVisible(true);

            }
        });
        add(listButton);

        addButton = new JButton("Rent out");
        addButton.setBounds(300, 0, 100, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.forsellWindow.setVisible(false);
                Main.frame.forrentoutWindow.setVisible(true);
            }
        });
        add(addButton);

        listButton = new JButton("Rent");
        listButton.setBounds(400, 0, 100, 30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.forsellWindow.setVisible(false);
                Main.frame.forrentWindow.setVisible(true);

            }
        });
        add(listButton);
    }
}
