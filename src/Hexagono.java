public class Hexagono extends Figuras {
    private double lado;
    private double apotema;
    private double perimetro;
    public Hexagono(double lado) {
        this.lado = lado;
        this.apotema = lado / (2.0 * Math.tan(Math.toDegrees(180/6)));
        this.perimetro = lado * 6.0;
        calcularPerimetro();
        calcularArea();
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getApotema() {
        return apotema;
    }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    public double getPerimeter() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    protected void calcularArea() {
        area = (getPerimeter() * getApotema()) / 2;
    }


    protected void calcularPerimetro() {
        perimetro = 6 * getLado();
    }
/*
    @Override
    public String toString() {
        return "Hexagono{ "
                + "area = " + calcularArea()
                + " ,perímetro = " + this.perimetro
                + " ,lado = " + this.lado;
    }

 */
}