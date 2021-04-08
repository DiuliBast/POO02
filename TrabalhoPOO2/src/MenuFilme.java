import javax.swing.*;

public class MenuFilme extends JFrame {
    private JButton removeFilmeButton;
    private JButton exibirFilmeButton;
    private JButton adicionarButton;
    private JButton removerButton;
    private JLabel firstMainText;
    private JPanel menuFilmePanel;

    public MenuFilme() {

        this.setTitle("Menu de Filmes");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(menuFilmePanel);
        this.pack();

    }
}
