public class ImprimirHexagono {
    public static void imprimir(){
        System.out.print("\nLado: ");
        double lado = Double.parseDouble(Main.teclado.nextLine());
        Hexagono hexagono = new Hexagono(lado);
        System.out.println("El area del hexagono es: " + hexagono.getArea());
    }
}
