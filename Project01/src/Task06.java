import processing.core.PApplet;
import javax.swing.*;

public class Task06 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0, 0, 0);

        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));

        fill(255, 0, 0);
        textSize(100);
        textAlign(CENTER, CENTER);
        text(String.format("%d + %d = %d", a, b, a + b), width / 2, height / 2);
    }
    public void draw() {

    }

    public static void main(String[] args) {
        PApplet.main("Task06");
    }
}