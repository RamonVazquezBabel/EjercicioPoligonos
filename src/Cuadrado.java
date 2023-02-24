public class Cuadrado extends Figuras {
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
        calcularPerimetro();
        calcularArea();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    protected void calcularArea() {
        area =  getLado()*getLado();
    }

    @Override
    public void calcularPerimetro() {
        perimetro = getLado() * 4;
    }

  /*  @Override
    public double calcularArea() {
        return getLado()*getLado();
    }

    @Override
    public String toString() {
        return "Cuadrado{ " +
                "area = " + calcularArea() +
                " y su lado es de " + lado +
                '}';
    }

   */
}
