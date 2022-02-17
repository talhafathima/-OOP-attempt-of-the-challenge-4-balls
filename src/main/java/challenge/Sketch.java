package challenge;

import processing.core.PApplet;

public class Sketch extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 650;
    public static final int NUMBER_OF_ROWS=4;
    public static final int DIAMETER = 10;
    Circle[] c = new Circle[NUMBER_OF_ROWS];


    public static void main(String[] args) {
        PApplet.main("challenge.Sketch", args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup() {
        Circle.setDiameter(DIAMETER);
        Circle.setHeight(HEIGHT);
        Circle.setNumberOfRows(NUMBER_OF_ROWS);
        for (int i = 0; i <NUMBER_OF_ROWS; i++) {
            c[i] = new Circle(i+1);
        }
    }


    @Override
    public void draw() {
        for(int i=0;i<NUMBER_OF_ROWS;i++) {
            drawCircle(c[i]);
        }
        Circle.xCenter++;
    }

    private void drawCircle(Circle c) {
        ellipse(c.getX(),c.getY(),Circle.getDiameter(),Circle.getDiameter());
    }
    }

