import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;

public class App extends JFrame {
    private JPanel mainPanel;
    private JButton filmeButton;
    private JButton fotoButton;
    private JButton musicaButton;
    private JLabel secondMainText;
    private JLabel firstMainText;
    private ArrayMidias array;

    public App(ArrayMidias array) {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setBounds(400,600, 20000, 3000);
        this.setContentPane(mainPanel);
        this.pack();
        this.array = array;

        filmeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = new MenuFilme(array);
                frame.setSize(800,600);
                frame.setVisible(true);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.repaint();



            }
        });


        fotoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = new MenuFoto(array);
                frame.setVisible(true);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });


        musicaButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            JFrame frame = new MenuMusica(array);
            frame.setVisible(true);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
