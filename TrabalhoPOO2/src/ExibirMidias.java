import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExibirMidias extends JFrame {
    private JLabel firstMainText;
    private JScrollBar scrollBar1;
    private JPanel exibirMidiasPanel;
    private JLabel areaDeExibicao;
    private JPanel areaExibicao;
    private JButton exibirButton;
    private ArrayMidias array;

    public ExibirMidias(ArrayMidias array) {

        this.setTitle("Exibir Midias");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(exibirMidiasPanel);
        // this.pack();
        this.array = array;

        exibirButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked (MouseEvent e){

                areaDeExibicao.setText(array.toString());
            }
        });

    }

    public void exibeMidias() {

        String nome;
        StringBuilder mensagem = new StringBuilder();

        nome = array.toString();
        mensagem.append("Bem-vindo ").append(nome).append("!");
        JOptionPane.showMessageDialog(null, mensagem);
    }


}



