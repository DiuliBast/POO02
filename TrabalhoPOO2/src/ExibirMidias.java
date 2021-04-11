import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExibirMidias extends JFrame {
    private JLabel firstMainText;
    private JScrollBar scrollBar1;
    private JPanel exibirMidiasPanel;
    private JLabel areaDeExibicao;
    private JButton exibirButton;
    private JTextArea textArea1;
    private JButton sairButton;
    private ArrayMidias array;

    public ExibirMidias(ArrayMidias array) {

        this.setTitle("Exibir Midias");
        this.setSize(500, 2000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(exibirMidiasPanel);
        this.array = array;

        exibirButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked (MouseEvent e){

                textArea1.setText(array.toString());
            }
        });

        sairButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e){
                dispose();

            }

        });
    }
}



