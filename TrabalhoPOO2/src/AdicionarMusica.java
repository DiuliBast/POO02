import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdicionarMusica extends JFrame{
    private JLabel firstMainText;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JPanel AdicionarMusica;
    private JButton OKButton;
    private ArrayMidias array;

    public AdicionarMusica(ArrayMidias array) {

        this.setTitle("Adicionar Músicas");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(AdicionarMusica);
       // this.pack();
        this.array = array;

        OKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Musica musica = new Musica();

                musica.setTitulo(textField1.getText());
                musica.setDescricao(textField2.getText());
                musica.setGenero(textField3.getText());
                musica.setIdioma(textField4.getText());
                musica.setDuração(textField5.getText());
                musica.setAno(textField6.getText());

                array.addMidia(musica);
                System.out.println(array.toString());
                dispose();
            }


        });

    }
    }


