import processing.core.PApplet;

public class Main extends PApplet {



    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        noStroke();

        final int CIRCLE_COUNT = 1000;
        final int MIN_DIAMETER = 1;
        final int MAX_DIAMETER = 5;

        for (int i = 0; i < CIRCLE_COUNT; ++i) {

            //int shade = (int) random(256);
            int red   = (int) random(256);
            int green = (int) random(256);
            int blue  = (int) random(256);

            fill(red, green,blue);
            int x = (int) random(width);
            int y = (int) random(height);
            int diameter = (int) random(MIN_DIAMETER, MAX_DIAMETER);
            ellipse(x, y, diameter, diameter);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}