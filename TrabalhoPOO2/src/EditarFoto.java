import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditarFoto extends JFrame {
    private JLabel firstMainText;
    private JButton OKButton;
    private JTextField textField1;
    private JPanel editarFotoPanel;
    private JTextField textNewTitulo;
    private JTextField textNewDescricao;
    private JTextField textNewFotografo;
    private JTextField textNewPessoas;
    private JTextField textNewLocal;
    private JTextField textNewData;
    private JButton procurarButton;
    private JTextField textNewCaminho;
    private JTextArea textArea1;
    private JButton sairButton;
    private ArrayMidias array;

    public EditarFoto(ArrayMidias array) {
        //super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(editarFotoPanel);
        //this.pack();
        this.array= array;

        OKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Foto foto = new Foto(

                        textNewTitulo.getText(),
                        textNewDescricao.getText(),
                        textNewCaminho.getText(),
                        textNewFotografo.getText(),
                        textNewPessoas.getText(),
                        textNewLocal.getText(),
                        textNewData.getText()

                );

                array.editarMídia(foto.getTitulo(), foto);
                //resultado do campo
                System.out.println(foto.getTitulo());
                //System.out.println("midia alterada com sucesso");
                JOptionPane.showMessageDialog(null,"Mídia editada com sucesso");

            }
        });

        procurarButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                String titulo = array.getMídia(textField1.getText()).toString();
                textArea1.setText(titulo);




            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e){
                dispose();

            }

        });
    }

    }



