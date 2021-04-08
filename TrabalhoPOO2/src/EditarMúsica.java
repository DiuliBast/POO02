import javax.swing.*;

public class EditarMúsica extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel EditarMusica;

    public EditarMúsica() {

        this.setTitle("Editar Música");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(EditarMusica);
        this.pack();
    }
}
