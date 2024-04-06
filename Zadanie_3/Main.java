import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {

        ColoredCircle coloredCircle = new ColoredCircle(new Point(5.0, 5.0), 10.0, "czerwony");

        System.out.println("Centrum kolorowego koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień kolorowego koła: " + coloredCircle.getRadius());
        System.out.println("Obwód kolorowego koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
    }
}
