import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        noStroke();
        final int CIRCLE_COUNT = 20;

        int x = width / 2;
        int y = height / 2;

        int diameter = min(width, height);
        int diameterStep = diameter / CIRCLE_COUNT;

        int red = 0;
        int resStep = 255 / CIRCLE_COUNT;

        for (int i = 0; i < CIRCLE_COUNT; ++i) {
            fill(red, 0, 0);
            ellipse(x, y, diameter, diameter);

            red += resStep;
            diameter -= diameterStep;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}