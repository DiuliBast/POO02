import javax.swing.*;

public class RemoverMusica extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel RemoveMusica;
    private ArrayMidias array;

    public RemoverMusica(ArrayMidias array) {

        this.setTitle("Menu de Filmes");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RemoveMusica);
        this.pack();
        this.array = array;
    }
}
