package Extd;

public class Square extends Shape {


    public Square(float b, float a) {
        super(b, a);
    }


    @Override
    public float Perimeter() {
        return (getA() + getB()) * 2;
    }
}
