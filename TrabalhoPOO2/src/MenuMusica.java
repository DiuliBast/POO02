import javax.swing.*;

public class MenuMusica extends JFrame {
    private JButton addMusicaButton;
    private JButton removeMusicaButton;
    private JButton exibirMusicaButton;
    private JButton consultarButton;
    private JButton editarButton;
    private JButton removerButton;
    private JButton adicionarButton;
    private JLabel firstMainText;
    private JPanel MenuMusicaPanel;

    public MenuMusica (String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(MenuMusicaPanel);
        this.pack();
    }

    }

