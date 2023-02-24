public abstract class Figuras {
    protected double area;
    protected double perimetro;

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimetro;
    }

    protected abstract void calcularArea();

    protected abstract void calcularPerimetro();

}
