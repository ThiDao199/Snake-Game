import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameFrame extends JFrame implements ActionListener {
    JButton resetButton;
    GamePanel game;
    GameFrame() {
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(600,500);


        resetButton = new JButton();
        resetButton.setText("Reset");
        resetButton.setSize(100,50);
        resetButton.setLocation(250,350);
        resetButton.setBackground(Color.ORANGE);
        resetButton.setOpaque(true);
        resetButton.setBorderPainted(false);
        resetButton.addActionListener(this);

        game = new GamePanel();
        this.add(resetButton);
        this.add(game);


        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            this.remove(game);
            game = new GamePanel();
            this.add(game);
            game.requestFocusInWindow();
            SwingUtilities.updateComponentTreeUI(this);
        }
    }
}
