import processing.core.PApplet;

import javax.swing.*;


public class Task07 extends PApplet {

    String name;
    int initialX, initialY = 100;
    int x, y;
    int dx = 10, dy;

    public void settings() {
        fullScreen();
        //size(1280, 720);
    }

    public void setup() {
        background(255, 0, 0);

        name = JOptionPane.showInputDialog("Enter your name");

        fill(0, 100, 230);
        textSize(100);
        textAlign(CENTER, CENTER);

        initialX = (int) -textWidth(name);
        x = initialX;
        y = initialY;
        dy = initialY;
    }

    public void draw() {
        background(255, 0, 0);
        text(name, x, y);
        x += dx;
        if (x > width) {
            y += dy;
            x = -initialX;
        }
        if (y > height) {
            x = initialX;
            y = initialY;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Task07");
    }
}