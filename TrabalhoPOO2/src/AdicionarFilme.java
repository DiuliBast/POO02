import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//organizar nomes textField...
public class AdicionarFilme extends JFrame{
    private JLabel firstMainText;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JPanel AdicionarFilme;
    private JButton OKButton;
    private ArrayMidias array;

    public AdicionarFilme(ArrayMidias array) {

        this.setTitle("Menu de Filmes");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(AdicionarFilme);
        this.pack();
        this.array = array;

        OKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
try{

                Filme f = new Filme();

               f.setTitulo(textField1.getText());
               f.setDescricao(textField2.getText());
               f.setGenero(textField3.getText());
               f.setIdioma(textField4.getText());
               f.setDuração(textField5.getText());
               f.setAno(textField6.getText());
               f.setDiretor(textField7.getText());
               f.setAtoresPrincipais(textField8.getText());

                array.addMidia(f);

}catch (NullPointerException b){
b.printStackTrace();
}

                try {
                    array.grava();
                } catch (Exception a) {

                    System.out.println("Erro no arquivo!");
                }

                String nome = "Filme Cadastrado com Sucesso!";
                JOptionPane.showMessageDialog(null, nome);
                dispose();

            }
        });

    }
    }

