import javax.swing.*;

public class MainFrame extends JFrame {
    public static FirstPage firstWindow;
    public static ForBuy forbuyWindow;
    public static ForSell forsellWindow;
    public static ForRent forrentWindow;
    public static ForRentout forrentoutWindow;


    public MainFrame() {
        setSize(650, 450);
        setTitle("World of House");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        firstWindow = new FirstPage();
        firstWindow.setLocation(0, 0);
        add(firstWindow);


        forbuyWindow = new ForBuy();
        forbuyWindow.setLocation(0, 0);
        forbuyWindow.setVisible(false);
        add(forbuyWindow);

        forsellWindow = new ForSell();
        forsellWindow.setLocation(0,0);
        forsellWindow.setVisible(false);
        add(forsellWindow);

        forrentWindow = new ForRent();
        forrentWindow.setLocation(0, 0);
        forrentWindow.setVisible(false);
        add(forrentWindow);

        forrentoutWindow = new ForRentout();
        forrentoutWindow.setLocation(0,0);
        forrentoutWindow.setVisible(false);
        add(forrentoutWindow);

    }
}



