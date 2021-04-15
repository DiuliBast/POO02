import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//organizar nomes textField...
public class AdicionarFilme extends JFrame{
    private JLabel firstMainText;
    private JTextField textTitulo;
    private JTextField textDescricao;
    private JTextField textGenero;
    private JTextField textIdioma;
    private JTextField textDuracao;
    private JTextField textAno;
    private JTextField textDiretor;
    private JTextField textAtoresPrincipais;
    private JPanel AdicionarFilme;
    private JButton OKButton;
    private JTextField textCaminho;
    private ArrayMidias array;

    public AdicionarFilme(ArrayMidias array) {

        this.setTitle("Menu de Filmes");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(AdicionarFilme);
       // this.pack();
        this.array = array;

        OKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
try{

                Filme f = new Filme();

               f.setTitulo(textTitulo.getText());
               f.setDescricao(textDescricao.getText());
               f.setCaminho(textCaminho.getText());
               f.setGenero(textGenero.getText());
               f.setIdioma(textIdioma.getText());
               f.setDuração(textDuracao.getText());
               f.setAno(textAno.getText());
               f.setDiretor(textDiretor.getText());
               f.setAtoresPrincipais(textAtoresPrincipais.getText());

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

