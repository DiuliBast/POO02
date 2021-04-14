import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditarFilme extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel EditarFilme;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton procurarButton;
    private JTextArea textArea1;
    private ArrayMidias array;
    Filme f;


    public EditarFilme(ArrayMidias array) {

        this.setTitle("Consulta de Filmes");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(EditarFilme);
        this.pack();
        this.array = array;


        OKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                JFrame frame = new EditarFilme(f);
                frame.setVisible(true);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

        procurarButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

               String titulo = array.getMídia(textField1.getText()).toString();
               textArea1.setText(titulo);



            }
        });

    }

}


