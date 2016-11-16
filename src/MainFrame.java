import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by sunning on 2016/11/16.
 */
public class MainFrame {
    public MainFrame() {
        monkButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                knightButton.setEnabled(true);
                ninjaButton.setEnabled(true);
                monkButton.setEnabled(false);

                role = monk;
            }
        });
        knightButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                monkButton.setEnabled(true);
                ninjaButton.setEnabled(true);
                knightButton.setEnabled(false);
            }
        });
        ninjaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                monkButton.setEnabled(true);
                knightButton.setEnabled(true);
                ninjaButton.setEnabled(false);
            }
        });

        handButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                role.setAttack(role.handAttack);
                textArea1.append(role.getClass().getName());
                textArea1.append(role.startAttack());
            }
        });
        swordButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                role.setAttack(role.swordAttack);
                textArea1.append(role.getClass().getName());
//                textArea1.append(role.startAttack());
            }
        });
        knifeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                role.setAttack(role.knifeAttack);
                display();
            }
        });
        fireButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                monkButton.setEnabled(false);
                role.setAttack(role.fireAttack);
                display();
            }
        });
        metalButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                monkButton.setEnabled(false);
                role.setAttack(role.metalAttack);
                display();
            }
        });
        waterButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                monkButton.setEnabled(false);
                role.setAttack(role.waterAttack);
                display();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainFrame");
        frame.setContentPane(new MainFrame().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void display(){
        textArea1.append(role.getClass().getName() + " attack with " + role.startAttack());
    }

    private JButton monkButton;
    private JTextArea textArea1;
    private JPanel MainPanel;
    private JButton knightButton;
    private JButton ninjaButton;
    private JButton knifeButton;
    private JButton swordButton;
    private JButton handButton;
    private JButton fireButton;
    private JButton metalButton;
    private JButton waterButton;

    private String tmp=" attack with ";
    public Role role;
    public Monk monk = new Monk();
}
