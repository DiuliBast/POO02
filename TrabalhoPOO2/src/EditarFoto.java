import javax.swing.*;

public class EditarFoto extends JFrame {
    private JLabel firstMainText;
    private JButton OKButton;
    private JTextField textField1;
    private JPanel editarFotoPanel;

    public EditarFoto(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(editarFotoPanel);
        this.pack();

    }
}
