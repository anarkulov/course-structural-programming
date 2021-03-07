import processing.core.PApplet;

import javax.swing.*;

public class Task04 extends PApplet {

    String a, b;

    float x1, y1;
    float x2, y2;
    float dx1 = 10;
    float dx2 = 10;
    float u = 1;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(255, 0, 0);
        a = JOptionPane.showInputDialog("N1");
        b = JOptionPane.showInputDialog("N2");

        textSize(200);
        fill(0, 0, 255);

        y1 = height * 0.5F + 150;
        y2 = height * 0.5F - 200;

        if (textWidth(a) > textWidth(b)) {
            u = textWidth(a) - textWidth(b);
        } else {
            u = textWidth(b) - textWidth(a);
        }


    }

    public void draw() {
        background(0);
        // firstWord
        fill(255, 0, 0);
        text(a, x1, y1);

        x1 += dx1;
        if (x1 > width - textWidth(a)) {
            dx1 = -dx1;
        } else if (x1 < 0) {
            dx1 = -dx1;
        }
        // secondWord
        fill(0, 255, 0);
        text(b, x2, y2);

        x2 += dx2;
        if (x2 > width - textWidth(b)) {
            dx2 = -dx2;
        } else if (x2 < 0) {
            dx2 = -dx2;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Task04");
    }
}