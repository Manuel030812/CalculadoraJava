import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while(true){
            System.out.println("**** Aplicacion Calculadora ****");
            System.out.println("""
                    1.Suma
                    2.Resta
                    3.Multiplicacion
                    4.Divicion
                    5.salir
                    """);
            System.out.println("Operacion a realizar es?");
            var operacion = Integer.parseInt(consola.nextLine());
            //revisar que este dentro de las opeciones
            if (operacion >= 1 && operacion <= 4) {
                System.out.println("proporcina valor 1");
                var operando1 = Integer.parseInt(consola.nextLine());
                System.out.println("porporciona valor 2");
                var operando2 = Integer.parseInt(consola.nextLine());
                int resultado;

                switch (operacion) {
                    case 1 -> {//suma
                        resultado = operando1 + operando2;
                        System.out.println("Resultado de la suma es: " + resultado);
                    }
                    case 2 -> { //resta
                        resultado = operando1 - operando2;
                        System.out.println("Resultado de la resta es: " + resultado);
                    }
                    case 3 -> {//multiplicacion
                        resultado = operando1 * operando2;
                        System.out.println("Resultado de la multiplicacion es: " + resultado);
                    }
                    case 4 -> {//divicion
                        resultado = operando1 / operando2;
                        System.out.println("Resultado de la divicion es: " + resultado);
                    }
                    default -> System.out.println("Opcion erronea:" + operacion);
                }
            } else if (operacion == 5) {//salir
                System.out.println(" Hasta pronto");
                break;

            } else {
                System.out.println("opcion erronea" + operacion);
            }
            //imprimimos un salto de linea
            System.out.println(5);

        }//fin de while

    }
}
