//        Saya Legi Kuswandi mengerjakan lp7 dalam mata kuliah DPBO untuk
//        keberkahanNya maka saya tidak melakukan
//        kecurangan seperti yang telah dispesifikasikan. Aamiin.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class App extends JFrame {
    public App() {
        setTitle("Flappy Bird");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                FlappyBird game = new FlappyBird();
                JFrame frame = new JFrame("Flappy Bird");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(game);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                game.requestFocus();
            }
        });

        JPanel panel = new JPanel();
        panel.add(startButton);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}
