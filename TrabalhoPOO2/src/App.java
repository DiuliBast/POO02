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
    private JButton exibirMidiasButton;
    private JButton SAIRButton;
    private ArrayMidias array = new ArrayMidias();

    public App() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setContentPane(mainPanel);

        filmeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = new MenuFilme(array);
                frame.setSize(800, 600);
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
        exibirMidiasButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = new ExibirMidias(array);
                frame.setVisible(true);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

        SAIRButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();

            }
        });
    }

    public static void main(String[] args) {

        ArrayMidias array = new ArrayMidias();

        try {
            array.ler();

        } catch (Exception e){

            System.out.println("Erro na leitura do arquivo");

        }

        JFrame frame = new App();
        frame.setVisible(true);
    }

}
