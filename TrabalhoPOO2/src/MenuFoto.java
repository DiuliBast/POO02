import javax.swing.*;

public class MenuFoto extends JFrame{
    private JButton editarButton;
    private JButton adicionarButton;
    private JButton consultarButton;
    private JButton removerButton;
    private JLabel firstMainText;
    private JPanel menuFotoPanel;

    public MenuFoto(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(menuFotoPanel);
        this.pack();
    }
}
