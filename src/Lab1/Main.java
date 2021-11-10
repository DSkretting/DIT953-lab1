package Lab1;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    Car c;

    public static void main(String[] args) {
        Main main = new Main();
        main.c = new Saab95();
        main.run();
    }

    public void run() {
        System.out.println("start");
        JFrame f = createWindow();
        listen(f);
        System.out.println("End");
        c.move();
    }

    private JFrame createWindow() {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(200, 200);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return f;
    }

    private void listen(JFrame f) {
        f.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e == c.turnRight();
                System.out.println(c.angle);
            }
        });
    }
}

