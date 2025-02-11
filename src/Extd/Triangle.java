package Extd;

public class Triangle extends Shape {

    private float c;
    public Triangle(float b, float a, float c) {
        super(b, a);
        this.c = c;
    }
    @Override
    public float Perimeter() {
        return getA() + getB() + c;
    }
}
