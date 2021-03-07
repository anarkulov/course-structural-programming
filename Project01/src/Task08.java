import processing.core.PApplet;

import javax.swing.*;


public class Task08 extends PApplet {

    String name, surname;
    int x, y;
    int dx, dy;
    int w, q;

    public void settings() {
        fullScreen();
        x = width / 2;
        dx = 10;
        y = width / 2;
        dy = -10;
    }

    public void setup() {
        background(255, 0, 0);

        name = JOptionPane.showInputDialog("Enter your first name");
        surname = JOptionPane.showInputDialog("Enter your surname");

        fill(0, 255, 0);
        textSize(100);
        textAlign(CENTER, CENTER);
        text(name, x, height);
        text(surname, y, height);
        w = (int) textWidth(name);
        q = (int) textWidth(surname);


    }
    public void draw() {
        x += dx;
        if (x > width - w / 2) {
            x = width - w / 2 - 1;
            dx = -dx;
        }
        if (x < w / 2 ) {
            x = w / 2;
            dx = -dx;
        }
        y += dy;
        if (y > width - q / 2) {
            y = width - q / 2 - 1;
            dy = -dy;
        }
        if (y < q / 2 ) {
            y = q / 2;
            dy = -dy;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Task08");
    }
}