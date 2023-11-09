package shapes;

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    public int getPerimeter(int side) {
        return 4 * side;
    }

    public int getArea(int side) {
        return side * side;
    }
}

