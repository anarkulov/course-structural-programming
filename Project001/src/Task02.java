// 3 круга
import processing.core.PApplet;

public class Task02 extends PApplet {
    final int DIAMETER = 30;
    final int RADIUS = DIAMETER / 2;
    int x, y, a, b, m, n;
    int dx = 10, dy = 10, da = 10, db = 10, dm = 10, dn = 10;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2;
        y = height / 2;
        a = width / 2 - 50;
        b = height / 2 - 50;
        m = width / 2 - 100;
        n = height / 2 - 100;
    }

    public void draw() {

        background(0);

        fill(255, 0, 0);
        ellipse(x, y, DIAMETER, DIAMETER);
        fill(0, 255, 0);
        ellipse(a, b, DIAMETER, DIAMETER);
        fill(0, 0, 255);
        ellipse(m, n, DIAMETER, DIAMETER);

        // first
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
        // second
        a += da;
        if (a + RADIUS > width) {
            da = -da;

        } else if (a - RADIUS < 0) {
            da = -da;
        }
        b += db;
        if (b + RADIUS > height) {
            db = -db;

        } else if (b - RADIUS < 0) {
            db = -db;
        }
        // third
        m += dm;
        if (m + RADIUS > width) {
            dm = -dm;

        } else if (m - RADIUS < 0) {
            dm = -dm;
        }
        n += dn;
        if (n + RADIUS > height) {
            dn = -dn;

        } else if (n - RADIUS < 0) {
            dn = -dn;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Task02");
    }
}