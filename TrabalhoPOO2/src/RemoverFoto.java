import javax.swing.*;

public class RemoverFoto extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel removerFotoPanel;

    public RemoverFoto(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(removerFotoPanel);
        this.pack();

    }
}
