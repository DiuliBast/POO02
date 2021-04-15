import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdicionarFoto extends JFrame {
    private JLabel firstMainText;
    private JTextField textTitulo;
    private JTextField textDescricao;
    private JTextField textFotografo;
    private JTextField textPessoas;
    private JTextField textLocal;
    private JTextField textData;
    private JPanel adicionarFotoPanel;
    private JButton OKButton;
    private JTextField textCaminho;
    private ArrayMidias array;


    public AdicionarFoto(ArrayMidias array) {


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(adicionarFotoPanel);
        this.pack();
        this.array = array;


        OKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Foto foto = new Foto();

                foto.setTitulo(textTitulo.getText());
                foto.setDescricao(textDescricao.getText());
                foto.setCaminho(textCaminho.getText());
                foto.setFotografo(textFotografo.getText());
                foto.setPessoas(textPessoas.getText());
                foto.setLocal(textLocal.getText());
                foto.setData(textData.getText());

                array.addMidia(foto);
                System.out.println(array.toString());
                dispose();
            }


        });

    }
}

