import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RemoverFilme extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton okButton;
    private JPanel RemoveFilme;
    Filme f;


    public RemoverFilme(ArrayMidias array) {

        this.setTitle("Menu de Filmes");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RemoveFilme);
        this.pack();

        okButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                f.removeMídia(getTitle());

            }
        });

    }
    }

