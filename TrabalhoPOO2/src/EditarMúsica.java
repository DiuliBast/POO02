import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditarMúsica extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel EditarMusica;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private ArrayMidias array;

    public EditarMúsica(ArrayMidias array) {

        this.setTitle("Editar Música");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(EditarMusica);
        this.pack();
        this.array = array;


        OKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Musica musica = new Musica();
                String novotitulo = textField2.getText();
                String novadescricao = textField3.getText();
                musica.setTitulo(novotitulo);
                musica.setDescricao(novadescricao);
                array.editarMídia("ttt",musica);
                //resultado do campo
                System.out.println(musica.getTitulo());
                System.out.println("midia alterada com sucesso");

            }
        });



    }
}
