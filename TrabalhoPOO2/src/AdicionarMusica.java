import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdicionarMusica extends JFrame{
    private JLabel firstMainText;
    private JTextField textTitulo;
    private JTextField textDescricao;
    private JTextField textGenero;
    private JTextField textIdioma;
    private JTextField textDuracao;
    private JTextField textAno;
    private JTextField textAutores;
    private JTextField textInterpretes;
    private JPanel AdicionarMusica;
    private JButton OKButton;
    private JTextField textCaminho;
    private ArrayMidias array;

    public AdicionarMusica(ArrayMidias array) {

        this.setTitle("Adicionar Músicas");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(AdicionarMusica);
       // this.pack();
        this.array = array;

        OKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Musica musica = new Musica();

                musica.setTitulo(textTitulo.getText());
                musica.setDescricao(textDescricao.getText());
                musica.setCaminho(textCaminho.getText());
                musica.setGenero(textGenero.getText());
                musica.setIdioma(textIdioma.getText());
                musica.setDuração(textDuracao.getText());
                musica.setAno(textAno.getText());
                musica.setAutores(textAutores.getText());
                musica.setInterpretes(textInterpretes.getText());


                array.addMidia(musica);
                System.out.println(array.toString());
                dispose();

                String nome = "Música Cadastrada com Sucesso!";
                JOptionPane.showMessageDialog(null, nome);
                dispose();

            }


        });

    }
    }


