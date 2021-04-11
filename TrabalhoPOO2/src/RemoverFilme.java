import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;

public class RemoverFilme extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton okButton;
    private JPanel RemoveFilme;
    private ArrayMidias array;

    public RemoverFilme(ArrayMidias array) {

        this.setTitle("Menu de Filmes");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RemoveFilme);
        this.pack();

        okButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                Filme f = new Filme();

                System.out.println(" Remover Mídia ");
                System.out.println("Informe o título da mídia");

                if(f.removeMídia(textField1.getText())){

                    System.out.println("Produto removido com sucesso! ");

                }
                else

                    System.out.println("Nao removeu negah, tente denovo :D");
            }
        });
    }
    }

