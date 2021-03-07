import processing.core.PApplet;

public class Task03 extends PApplet {
    final int DIAMETER = 100;
    final int RADIUS = DIAMETER / 2;
    int x, y;
    int dx = 10,
        dy = -7;

    public void settings() {
        fullScreen();
        // size(1280, 720);
    }

    public void setup() {
        x = width / 2;
        y = height / 2;
    }

    public void draw() {

        background(0);

        fill(4, 63, 134);
        ellipse(x, y, DIAMETER, DIAMETER);

        x += dx;
        if (x + RADIUS > width) {
            dx = -dx;

        } else if (x - RADIUS < 0) {
            dx = -dx;
        }
        y += dy;
        if (y + RADIUS > height) {
            dy = -dy;

        } else if (y - RADIUS < 0) {
            dy = -dy;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Task03");
    }
}