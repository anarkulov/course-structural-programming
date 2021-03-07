import processing.core.PApplet;

public class Task01 extends PApplet {
    public void settings() {
        fullScreen();

    }

    public void draw() {

        int centerX = width / 2;
        int centerY = height /2;

        background(255);
        fill(255, 100, 50);
        ellipse(centerX, centerY, 500, 500);
        ellipse(100, 100, 200, 200);
    }

    public static void main(String[] args) {
    PApplet.main("Task01");
    }
}
