package shapes;

public class Square extends Quadrilateral {

    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    void setLength(int length) {
        this.length = length;
    }

    @Override
    void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

//    public Square(int side) {
//        super(side, side);
//    }
//
//    public int getPerimeter(int side) {
//        return 4 * side;
//    }
//
//    public int getArea(int side) {
//        return side * side;
//    }


