package challenge;

public class Circle {
    public static int xCenter=0;
    private static int height;
    public int speed;
    private static int diameter;
    private static int numberOfRows;
    public Circle(int speed){
        this.speed=speed;
    }
    public static int getDiameter() {
        return diameter;
    }
    public static void setDiameter(int diameter) {
        Circle.diameter = diameter;
    }
    public static void setHeight(int height) {
        Circle.height =height;
    }
    public static void setNumberOfRows(int numberOfRows) {
        Circle.numberOfRows = numberOfRows;
    }
    public int getX(){
        return xCenter*speed;
    }
    public int getY(){
        return (speed*height)/(numberOfRows+1);
    }

}
