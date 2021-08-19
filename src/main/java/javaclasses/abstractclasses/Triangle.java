package javaclasses.abstractclasses;

public class Triangle extends Figure {
    public Triangle(int side1, int side2) {
        super(side1, side2);
    }
    @Override
    void countArea() {
        System.out.print(0.5 * side1 * side2 + ", ");
        System.out.print(0.5 * this.side1 * this.side2 + ", "); //1
    }
}