import javax.swing.*;

public class ConsultarFoto extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel consultarFotoPanel;

    public ConsultarFoto(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(consultarFotoPanel);
        this.pack();

    }
}
