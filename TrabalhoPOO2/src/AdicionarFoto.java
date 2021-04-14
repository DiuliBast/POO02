import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdicionarFoto extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JPanel adicionarFotoPanel;
    private JButton OKButton;
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

                foto.setTitulo(textField1.getText());
                foto.setDescricao(textField2.getText());
                foto.setFotografo(textField3.getText());
                foto.setPessoas(textField4.getText());
                foto.setLocal(textField5.getText());
                foto.setData(textField6.getText());

                array.addMidia(foto);
                System.out.println(array.toString());
                dispose();
            }


        });

    }
}

