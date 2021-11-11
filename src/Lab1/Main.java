package Lab1;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    Car c;
    boolean right;
    boolean left;
    boolean release;

    public static void main(String[] args) throws InterruptedException{
        Main main = new Main();
        main.c = new Saab95();
        main.run();
    }

    public void run() throws InterruptedException {
        System.out.println("start");
        JFrame f = createWindow();
        listen(f);
        System.out.println("End");
        while (true) {
            c.move();
        }
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
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    c.turnLeft();
                }
                else if (e.getKeyCode() == KeyEvent.VK_D){
                    c.turnRight();
                }
            }

        });
    }
}

