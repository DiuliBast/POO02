import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditarFilme extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel EditarFilme;

    private JTextField textNewTitulo;
    private JTextField textNewDescricao;
    private JTextField textNewCaminho;
    private JTextField textNewGenero;
    private JTextField textNewIdioma;
    private JTextField textNewDuracao;
    private JTextField textNewAno;
    private JTextField textNewDiretor;
    private JTextField textNewAP;

    private JButton procurarButton;
    private JTextArea textArea1;
    private JButton sairButton;

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
                Filme f = new Filme(
                        //String novotitulo = textField2.getText();
                        //String novadescricao = textField3.getText();
                        //String novogenero = textField4.getText();
                        //String novoidioma = textField5.getText();

                        textNewTitulo.getText(),
                        textNewDescricao.getText(),
                        textNewCaminho.getText(),
                        textNewGenero.getText(),
                        textNewIdioma.getText(),
                        textNewDuracao.getText(),
                        textNewAno.getText(),
                        textNewDiretor.getText(),
                        textNewAP.getText()

                );

                array.editarMídia(f.getTitulo(), f);
                //resultado do campo
                System.out.println(f.getTitulo());
                //System.out.println("midia alterada com sucesso");
                JOptionPane.showMessageDialog(null,"Mídia editada com sucesso");

            }
        });


        procurarButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                String titulo = array.getMídia(textField1.getText()).toString();
                textArea1.setText(titulo);

              /*  Filme f = new Filme(
                        //String novotitulo = textField2.getText();
                        //String novadescricao = textField3.getText();
                        //String novogenero = textField4.getText();
                        //String novoidioma = textField5.getText();

                        textField2.getText(),
                        textField3.getText(),
                        textField4.getText(),
                        textField5.getText(),
                        textField6.getText(),
                        textField7.getText(),
                        textField8.getText(),
                        textField9.getText(),
                        textNewDescricao.getText()
                );
                array.editarMídia(f.getTitulo(), f);
                //resultado do campo
                System.out.println(f.getTitulo());
                //System.out.println("midia alterada com sucesso");
                JOptionPane.showMessageDialog(null,"Mídia editada com sucesso");

*/

            }
        });

        sairButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e){
                dispose();

            }

        });
    }
    }




