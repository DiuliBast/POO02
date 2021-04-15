import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditarMúsica extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel EditarMusica;
    private JTextField textNewTitulo;
    private JTextField textNewDescricao;
    private JTextField textNewCaminho;
    private JTextField textNewGenero;
    private JTextField textNewIdioma;
    private JTextField textNewDuracao;
    private JTextField textNewAno;
    private JTextField textNewAutores;
    private JTextField textNewInterpretes;
    private JButton procurarButton;
    private JTextArea textArea1;
    private JButton sairButton;
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

        procurarButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                String titulo = array.getMídia(textField1.getText()).toString();
                textArea1.setText(titulo);




    }
}
