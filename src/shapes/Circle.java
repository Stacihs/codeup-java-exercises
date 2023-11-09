package shapes;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = (int) radius;
    }
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    public double getCircumference() {
        return (Math.PI * radius) * 2;
    }


}
