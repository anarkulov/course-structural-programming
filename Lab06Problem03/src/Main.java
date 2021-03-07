import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        strokeWeight(10);

        final float MARGIN = 250;
        final float CENTER_RADIUS = 400;
        final float CENTER_INNER_RADIUS = CENTER_RADIUS * 0.4f;
        final float RADIUS = 200;
        final float INNER_RADIUS = RADIUS * 0.3f;
        int RAY_COUNT = 8;

        stroke(0xFFFF0000);
        star(width * 0.5f, height * 0.5f, CENTER_RADIUS, CENTER_INNER_RADIUS, RAY_COUNT);

        stroke(0xFFFFFF00);
        star(MARGIN, MARGIN, RADIUS, INNER_RADIUS, RAY_COUNT);
        star(width - MARGIN, MARGIN, RADIUS, INNER_RADIUS, RAY_COUNT);
        star(width - MARGIN, height - MARGIN, RADIUS, INNER_RADIUS, RAY_COUNT);
        star(MARGIN, height - MARGIN, RADIUS, INNER_RADIUS, RAY_COUNT);
    }

    private void star(float x, float y, float radius, float innerRadius, float rayCount) {
        float angle = 0;
        float deltaAngle = TWO_PI / rayCount;

        float prevEndX = x + cos(angle - deltaAngle) * innerRadius;
        float prevEndY = y + sin(angle - deltaAngle) * innerRadius;

        for (int i = 0; i < rayCount; i++, angle += deltaAngle) {
            float selectedRadius = i % 2 == 0 ? radius : innerRadius;
            float endX = x + cos(angle) * selectedRadius;
            float endY = y + sin(angle) * selectedRadius;
            line(x, y, endX, endY);
            line(endX, endY, prevEndX, prevEndY);
            prevEndX = endX;
            prevEndY = endY;
        }
    }

    public void draw() {

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}