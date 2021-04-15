import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

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


    public EditarFilme(ArrayMidias array) throws Exception {

        this.setTitle("Consulta de Filmes");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(EditarFilme);
        this.pack();
        this.array = array;


        OKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Filme f = new Filme();
                String novotitulo = textField2.getText();
                String novadescricao = textField3.getText();
                f.setTitulo(novotitulo);
                f.setDescricao(novadescricao);
              //  f.setDuração(novaduracao);

                array.editarMídia("sss",f);
                //resultado do campo
                    System.out.println(f.getTitulo());
                    System.out.println("midia alterada com sucesso");

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


