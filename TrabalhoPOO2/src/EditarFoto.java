import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditarFoto extends JFrame {
    private JLabel firstMainText;
    private JButton OKButton;
    private JTextField textField1;
    private JPanel editarFotoPanel;
    private JTextField textNewTitulo;
    private JTextField textNewDescricao;
    private JTextField textNewFotografo;
    private JTextField textNewPessoas;
    private JTextField textNewLocal;
    private JTextField textNewData;
    private JButton procurarButton;
    private JTextField textNewCaminho;
    private JTextArea textArea1;
    private JButton sairButton;
    private ArrayMidias array;

    public EditarFoto(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(editarFotoPanel);
        this.pack();

    }
}
