import processing.core.PApplet;

import javax.swing.*;

public class Task04 extends PApplet {


    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(255, 0, 0);

        String name = JOptionPane.showInputDialog("Enter your name. ");
        fill(100, 50, 50);
        textSize(200);
        textAlign(CENTER, CENTER);
        translate(width * 0.5f, height * 0.5f);
        text(name, 0, 0);

    }

    public static void main(String[] args) {
        PApplet.main("Task04");
    }
}