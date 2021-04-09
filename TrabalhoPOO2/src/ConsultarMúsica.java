import javax.swing.*;

public class ConsultarMúsica extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel ConsultarMusica;
    private ArrayMidias array;

    public ConsultarMúsica(ArrayMidias array) {

        this.setTitle("Adicionar Músicas");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(ConsultarMusica);
        this.pack();
        this.array = array;
    }

}
