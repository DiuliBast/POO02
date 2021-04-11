import javax.swing.*;

public class EditarFoto extends JFrame {
    private JLabel firstMainText;
    private JButton OKButton;
    private JTextField textField1;
    private JPanel editarFotoPanel;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;

    public EditarFoto(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(editarFotoPanel);
        this.pack();

    }
}
