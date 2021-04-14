import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConsultarFoto extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel consultarFotoPanel;
    private JTextArea textArea1;
    private ArrayMidias array;

    public ConsultarFoto(ArrayMidias array) {


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(consultarFotoPanel);
        this.pack();
        this.array = array;

        OKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                array.getMídia(textField1.getText()).toString();
                String titulo = array.getMídia(textField1.getText()).toString();
                textArea1.setText(titulo);

            }
        });



    }


    }

