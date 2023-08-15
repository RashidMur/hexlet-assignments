package exercise;

// BEGIN
public class Flat implements Home{
    double area;
    double balconyArea;
    int floor;

    public Flat(double area, double balconyArea, int floor){
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    public String toString(){
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }
    public double getArea(){
        return area + balconyArea;
    }
    public int compareTo(Home another) {
        if (getArea() > another.getArea()) {
            return 1;
        }else if (getArea() < another.getArea()) {
            return -1;
        } else return 0;
    }
}
// END
