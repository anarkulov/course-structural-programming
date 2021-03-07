import processing.core.PApplet;

public class Task11 extends PApplet {

    int angle = 0;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);


    }
    public void draw() {
        background(0);

        translate(width / 2, height / 2);
        rotate(radians(angle));

        fill(255);
        rectMode(CENTER);
        rect(0, 0, 50,50);
        rect(0, 0, 50, 50);

        angle += 5;
    }

    public static void main(String[] args) {
        PApplet.main("Task11");
    }
}