import javax.swing.*;

public class ConsultarMúsica extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel ConsultarMusica;

    public ConsultarMúsica() {

        this.setTitle("Adicionar Músicas");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(ConsultarMusica);
        this.pack();
    }

}
