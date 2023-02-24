import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String opcion = "";

        while(!opcion.equals("4")){
            System.out.println("[1] -- Construir un Cuadrado");
            System.out.println("[2] -- Construir un Hexagono");
            System.out.println("[4] -- Salir");
            System.out.print("Opcion: ");
            opcion = teclado.nextLine();
            switch(opcion) {
                case "1":
                    ImprimirCuadrado.imprimir();
                    break;
                case "2":
                    ImprimirHexagono.imprimir(Double.parseDouble(teclado.nextLine()));
                    break;
                case "4":
                    System.out.println("\n\t\tFIN DE PROGRAMA");
                    break;
                default:
                    System.out.println("Opcion equivocada\n");
            }
        }

    }





/*
        Scanner leer = new Scanner(System.in);

        System.out.println("Elija entre cuadrado(c) y hexagono(h)");
        String entrada = leer.nextLine();
        System.out.println("Introduzca el tamaño del lado");
        double tamLado = leer.nextDouble();
        if(entrada.contains("c")){
            ImprimirCuadrado.imprimir(tamLado);
        }else{
            ImprimirHexagono.imprimir(tamLado);
            /*


        }



    }

 */
}