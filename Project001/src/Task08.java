//EARTH and MOON
import processing.core.PApplet;

public class Task08 extends PApplet {
    float earthAngle = 0;
    float moonAngle = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);


    }
    public void draw() {
        background(0);

        translate(width * 0.5f, height * 0.5f);

        //sun
        final int SUN_DIAMETER = 450;

        fill(255, 208, 0);
        ellipse(0, 0, SUN_DIAMETER, SUN_DIAMETER);

        // Earth
        final int EARTH_DIAMETER = 100;

        rotate(radians(earthAngle));
        translate(500, 0);
        fill(140, 209, 255);
        ellipse(0, 0, EARTH_DIAMETER, EARTH_DIAMETER);

        earthAngle += 2;

        // Moon
        final int MOON_DIAMETER = 40;

        rotate(radians(moonAngle));
        translate(90, 0);

        fill(174, 177, 183);
        ellipse(0, 0, MOON_DIAMETER, MOON_DIAMETER);

        moonAngle -= 4;

    }

    public static void main(String[] args) {
        PApplet.main("Task08");
    }
}