import processing.core.PApplet;

import javax.swing.*;

public class Task09 extends PApplet {
    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        final int VOLUME_RECT = 600;
        int a = Integer.parseInt(JOptionPane.showInputDialog("N?"));
        int x = 400;
        int y = 90;
        fill(255, 0, 0);
        rect(x, y, VOLUME_RECT, VOLUME_RECT);
        int z = (VOLUME_RECT / a);

        for (int i = x; i < VOLUME_RECT + x; i += z * 2) {
           for (int j = y; j < VOLUME_RECT + y; j += z * 2){
               fill(0, 0, 255);
               rect(i, j, z, z);
           }
        }
        for (int i =x + z; i < VOLUME_RECT + x; i += z * 2) {
            for (int j = y + z; j < VOLUME_RECT + y; j += z * 2){
                fill(0, 0, 255);
                rect(i, j, z, z);
            }
        }
        if (a == 1){
            fill(255, 0, 0);
            rect(x, y, z, z);
        }
    }

    public void draw() {

    }

    public static void main(String[] args) {
        PApplet.main("Task09");
    }
}
