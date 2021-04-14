import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConsultarFilme extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton okButton;
    private JPanel ConsultarFilme;
    private JTextArea textArea1;
    private ArrayMidias array;

    public ConsultarFilme(ArrayMidias array) {

        this.setTitle("Consulta de Filmes");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(ConsultarFilme);
        this.pack();
        this.array = array;

        okButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
               // Filme f= new Filme();

               // String titulo = array.getMídia(textField1.getText()).toString();
                //System.out.println(titulo);
                textArea1.setText(array.getMídia(textField1.getText()).toString());



                    }
                });

            }




    }


