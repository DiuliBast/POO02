import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuFoto extends JFrame {
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


        removerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = new RemoverFoto("Remover Foto");
                frame.setVisible(true);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

        adicionarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = new AdicionarFoto("Adicionar Foto");
                frame.setVisible(true);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

        consultarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = new ConsultarFoto("Consultar Foto");
                frame.setVisible(true);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

        editarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = new EditarFoto("Editar Foto");
                frame.setVisible(true);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
    }
}
