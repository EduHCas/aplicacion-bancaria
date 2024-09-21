import java.util.Scanner;

public class AplicacionBancaria {
    public static void main(String[] args) {

        String nombreDelCliente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        int opcion = 0;

        System.out.println("*******************************************************");
        System.out.println("\nNombre del Cliente: " + nombreDelCliente);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo dispobible es: " + saldoDisponible + " $");
        System.out.println("\n*******************************************************");

        String menu = """
                *** Escriba el número de la opción deseada ***
                1 - Consultar saldo
                2 - Retirar efectivo
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoDisponible + " $");
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if(valorARetirar > saldoDisponible){
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldoDisponible = saldoDisponible - valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldoDisponible + " $");
                    }
                    break;
                case 3:
                    System.out.println("¿Ingrese el valor a depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldoDisponible = saldoDisponible + valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldoDisponible + " $");
                    break;
                case 9:
                    System.out.println("Saliendo del programa, muchas gracias " + nombreDelCliente + " por usuar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
        teclado.close();
    }
}
