import javax.swing.*;

public class MenuFilme extends JFrame {
    private JButton removeFilmeButton;
    private JButton exibirFilmeButton;
    private JButton adicionarButton;
    private JButton removerButton;
    private JLabel firstMainText;
    private JPanel menuFilmePanel;

    public MenuFilme(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(menuFilmePanel);
        this.pack();
    }
}
