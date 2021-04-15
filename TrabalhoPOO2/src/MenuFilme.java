import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuFilme extends JFrame {
    private JButton consultaButton;
    private JButton editarFilmeButton;
    private JButton adicionarButton;
    //private JButton removerButton;
    private JLabel firstMainText;
    private JPanel menuFilmePanel;
    private JButton VOLTARButton;
    private ArrayMidias array;

    public MenuFilme(ArrayMidias array) {

        this.setTitle("Menu de Filmes");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(menuFilmePanel);
        this.pack();
        this.array = array;

        adicionarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = new AdicionarFilme(array);
                frame.setVisible(true);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
        consultaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = new ConsultarFilme(array);
                frame.setVisible(true);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

        editarFilmeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                JFrame frame = null;
                try {
                    frame = new EditarFilme(array);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                frame.setVisible(true);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

        VOLTARButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();

            }

        });

    }
}
