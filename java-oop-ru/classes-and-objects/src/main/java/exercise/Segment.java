package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point lostPoint;

    // Конструктор
    public Segment(Point point1, Point point2) {
        beginPoint = point1;
        lostPoint = point2;
    }
    public Point getBeginPoint(){
        return beginPoint;
    }
    public Point getEndPoint(){
        return lostPoint;
    }
    public Point getMidPoint(){
        int midX = (beginPoint.getX() + lostPoint.getX()) / 2;
        int midY = (beginPoint.getY() + lostPoint.getY()) / 2;
        Point midPoint = new Point(midX,midY);
        return midPoint;
    }
}
// END
