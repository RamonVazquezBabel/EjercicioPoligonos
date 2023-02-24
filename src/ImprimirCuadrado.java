public class ImprimirCuadrado {
    public static void imprimir(){
        System.out.print("\nLado: ");
        double lado = Double.parseDouble(Main.teclado.nextLine());
        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println("El area del cuadrado es: " + cuadrado.getArea());
    }

}
