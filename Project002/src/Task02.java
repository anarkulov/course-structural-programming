//SNOWFLAKE
import processing.core.PApplet;

public class Task02 extends PApplet {
    final int COUNT = 100;

    float[] x = new float[COUNT];
    float[] y = new float[COUNT];
    float[] dy = new float[COUNT];
    float[] radius = new float[COUNT];
    float[] innerRadius = new float[COUNT];
    float[] angle = new float[COUNT];
    float[] deltaAngle  = new float[COUNT];
    int[] rayCount = new int[COUNT];

    public void settings() { fullScreen(); }

    public void setup() {
        background(0);
        strokeWeight(3);
        stroke(255);

        for (int i = 0; i < COUNT; i++) {
            radius[i] = random(10, 50);
            innerRadius[i] = random(radius[i] * 0.5f);
            x[i] = random(width);
            y[i] = -radius[i] * random(100);
            dy[i] = random(1, 7);
            deltaAngle[i] = random(-2, 2);
            rayCount[i] = (int) random(12, 30);
            if (rayCount[i] % 2 != 0) {
                ++rayCount[i];
            }
        }
    }

    public void draw() {
        background(0);
        for (int i = 0; i < COUNT; ++i) {

            pushMatrix();
            translate(x[i], y[i]);
            rotate(radians(angle[i]));
            snowflake(0, 0, radius[i], innerRadius[i], rayCount[i]);
            popMatrix();

            angle[i] += deltaAngle[i];
            y[i] += dy[i];
            if ((y[i] - radius[i]) > height) {
                y[i] = -radius[i] * random(100);
            }
        }
    }

    private void snowflake(float x, float y, float radius, float innerRadius, float rayCount) {
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

    public static void main(String[] args) {
        PApplet.main("Task02");
    }
}