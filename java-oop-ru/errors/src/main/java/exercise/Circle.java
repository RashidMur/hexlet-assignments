package exercise;

// BEGIN
public class Circle{
int radius;
Point point;
    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    double getSquare() throws NegativeRadiusException {
        if (this.radius < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        } else {
            return Math.PI * this.radius * this.radius;
        }
    }
}
// END
