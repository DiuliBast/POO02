import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App extends JFrame {
    private JPanel mainPanel;
    private JButton filmeButton;
    private JButton fotosButton;
    private JButton músicasButton;
    private JLabel secondMainText;
    private JLabel firstMainText;

    public App (String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        filmeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        filmeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                MenuFilme menuFilme = new MenuFilme();
                menuFilme.setVisible(true);
                menuFilme.pack();
                menuFilme.setLocationRelativeTo(null);
                menuFilme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
    }

    public static void main(String [] args){
        JFrame frame = new App("Banco de Mídias");
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
