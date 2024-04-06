package geometry;

public class ColoredCircle extends Circle {
    private String color;

    public ColoredCircle(Point center, double radius, String color) {
        super(center, radius); // Wywołanie konstruktora klasy bazowej (Circle)
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Metoda getCenter() jest dziedziczona z klasy Circle, więc nie trzeba jej ponownie definiować
}
