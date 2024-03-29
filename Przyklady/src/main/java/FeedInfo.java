
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;


public class FeedInfo extends JFrame {
    private JLabel nameLabel = new JLabel("Nazwa: ",
        SwingConstants.RIGHT);
    private JTextField name;
    private JLabel urlLabel = new JLabel("URL: ",
        SwingConstants.RIGHT);
    private JTextField url;
    private JLabel typeLabel = new JLabel("Typ: ",
        SwingConstants.RIGHT);
    private JTextField type;

    public FeedInfo() {
        super("Informacje o zrodle");
        setSize(400, 145);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        // nazwa witryny
        String response1 = JOptionPane.showInputDialog(null,
            "Wpisz nazwe witryny:");
        name = new JTextField(response1, 20);

        // adres witryny
        String response2 = JOptionPane.showInputDialog(null,
            "Wpisz adres witryny:");
        url = new JTextField(response2, 20);

        // typ witryny
        String[] choices = { "Osobista", "Komercyjna", "Inna" };
        int response3 = JOptionPane.showOptionDialog(null,
            "Jaki to typ witryny?",
            "Typ witryny",
            0,
            JOptionPane.QUESTION_MESSAGE,
            null,
            choices,
            choices[0]);
        type = new JTextField(choices[response3], 20);

        setLayout(new GridLayout(3, 2));
        add(nameLabel);
        add(name);
        add(urlLabel);
        add(url);
        add(typeLabel);
        add(type);
        setLookAndFeel();
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
        	for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    SwingUtilities.updateComponentTreeUI(this);
                    break;       
                  
            
                }}} 
        catch (Exception e) {
            System.err.println("Nie potrafie wczytac "
                + "systemowego wygladu: " + e);
        }}
    
    public static void main(String[] arguments) {
        new FeedInfo();
    }
}
