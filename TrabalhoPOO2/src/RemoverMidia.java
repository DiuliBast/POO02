import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;

public class RemoverMidia extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton okButton;
    private JPanel RemoveFilme;
    private ArrayMidias array;

    public RemoverMidia(ArrayMidias array) {

        this.setTitle("Menu de Filmes");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RemoveFilme);
        this.pack();

        okButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                Filme f = new Filme();
                String msgError = "";
                String msgSucess;

                if (array.removeMídia(textField1.getText())) {

                    msgSucess = "Midia removida com sucesso!";
                    JOptionPane.showMessageDialog(null, msgSucess);
                    dispose();

                } else {
                    msgError = "A midia não foi removida :(";
                    JOptionPane.showMessageDialog(null, msgError);
                    dispose();
                }
            }
        });
    }
}

