package arg.com.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double nro1, nro2, nro3;
        int cases;
        String preguntaMenu; String preguntaNro3;
        Scanner sg = new Scanner(System.in);
        Metodos operacion = new Metodos();
        MetodosSecundarios colores = new MetodosSecundarios();
        MetodosSecundarios opSecundaria = new MetodosSecundarios();
        MetodosSecundarios consola = new MetodosSecundarios();
    do {
        try { //Anti letras o simbolos en lugares numericos (InputMismatchException)
        System.out.println("Eliga la opcion correspondiente: ");
        System.out.println(colores.colorVerde + "1 - " + colores.reiniciarColor + "Suma");
        System.out.println(colores.colorVerde + "2 - " + colores.reiniciarColor + "Resta");
        System.out.println(colores.colorVerde + "3 - " + colores.reiniciarColor + "Division");
        System.out.println(colores.colorVerde + "4 - " + colores.reiniciarColor + "Multiplicacion");
        System.out.println(colores.colorVerde + "5 - " + colores.reiniciarColor + "Potencia");
        System.out.println(colores.colorVerde + "6 - " + colores.reiniciarColor + "Factorial");
        System.out.println(colores.colorVerde + "7 - " + colores.reiniciarColor + "Raiz cuadrada");
        System.out.println(colores.colorVerde + "8 - " + colores.reiniciarColor + "Perimetro de un circulo");
        System.out.println(colores.colorVerde + "9 - " + colores.reiniciarColor + "Porcentaje");
        System.out.println(colores.colorVerde + "10 - " + colores.reiniciarColor + "Raices cubicas, cualquier indice n");
        System.out.println(colores.colorVerde + "11 - " + colores.colorRojo + "Finalizar programa");
        System.out.print(colores.reiniciarColor + "Opcion: ");
        cases = sg.nextInt();
        switch (cases){
        case 1:
            consola.limpiar();
            System.out.print("Ingrese el primer valor de la suma: ");
            nro1 = sg.nextDouble();
            System.out.print("Ingrese el segundo valor de la suma: ");
            nro2 = sg.nextDouble();
            System.out.println("Desea ingresar un tercer numero?: " + colores.colorVerde + "Y/N");
            sg.nextLine();
            preguntaNro3 = sg.nextLine();
            if (preguntaNro3.equals("Y") || preguntaNro3.equals("y")){
                System.out.println( colores.reiniciarColor + "Ingrese el tercer valor de la suma: ");
                nro3 = sg.nextDouble();
                System.out.println("El resultado de la suma es: " + colores.colorVerde  + opSecundaria.resultadoSumaS(nro1,nro2,nro3));
            }
            else
            System.out.println("El resultado de la suma es: " + colores.colorVerde + operacion.resultadoSuma(nro1, nro2));
            opSecundaria.esperar();
            break;
        case 2:
            consola.limpiar();
            System.out.print("Ingrese el primer valor de la resta: ");
            nro1 = sg.nextDouble();
            System.out.print("Ingrese el segundo valor de la resta: ");
            nro2 = sg.nextDouble();
            System.out.println("Desea ingresar un tercer numero?: " + colores.colorVerde + "Y/N");
            sg.nextLine();
            preguntaNro3 = sg.nextLine();
            if (preguntaNro3.equals("Y") || preguntaNro3.equals("y")){
                System.out.println( colores.reiniciarColor + "Ingrese el tercer valor de la resta: ");
                nro3 = sg.nextDouble();
                System.out.println("El resultado de la resta es: " + colores.colorVerde  + opSecundaria.resultadoRestaS(nro1,nro2,nro3));
            }
            else
                System.out.println("El resultado de la resta es: " + colores.colorVerde + operacion.resultadoResta(nro1, nro2));
            opSecundaria.esperar();
            break;
        case 3:
            consola.limpiar();
            System.out.print("Ingrese el primer valor de la division: ");
            nro1 = sg.nextDouble();
            System.out.print("Ingrese el segundo valor de la division: ");
            nro2 = sg.nextDouble();
            System.out.println("Desea ingresar un tercer numero?: " + colores.colorVerde + "Y/N");
            sg.nextLine();
            preguntaNro3 = sg.nextLine();
            if (preguntaNro3.equals("Y") || preguntaNro3.equals("y")){
                System.out.println( colores.reiniciarColor + "Ingrese el tercer valor de la division: ");
                nro3 = sg.nextDouble();
                System.out.println("El resultado de la division es: " + colores.colorVerde  + opSecundaria.resultadoDivisionS(nro1,nro2,nro3));
            }
            else
            System.out.println("El resultado de la division es: " + colores.colorVerde + operacion.resultadoDivision(nro1, nro2));
            opSecundaria.esperar();
            break;
        case 4:
            consola.limpiar();
            System.out.print("Ingrese el primer valor de la multiplicacion: ");
            nro1 = sg.nextDouble();
            System.out.print("Ingrese el segundo valor de la multiplicacion: ");
            nro2 = sg.nextDouble();
            System.out.println("Desea ingresar un tercer numero?: " + colores.colorVerde + "Y/N");
            sg.nextLine();
            preguntaNro3 = sg.nextLine();
            if (preguntaNro3.equals("Y") || preguntaNro3.equals("y")){
                System.out.println( colores.reiniciarColor + "Ingrese el tercer valor de la multiplicacion: ");
                nro3 = sg.nextDouble();
                System.out.println("El resultado de la multiplicacion es: " + colores.colorVerde  + opSecundaria.resultadoMultiplicacionS(nro1,nro2,nro3));
            }
            else
            System.out.println("El resultado de la multiplicacion es: " + colores.colorVerde + operacion.resultadoMultiplicacion(nro1, nro2));
            opSecundaria.esperar();
            break;
        case 5:
            consola.limpiar();
            System.out.print("Ingrese el numero de la base: ");
            nro1 = sg.nextDouble();
            System.out.print("Ingrese el numero del exponente: ");
            nro2 = sg.nextDouble();
            System.out.println("El numero " + nro1 + " elevado a " + nro2 +" es igual a: " + colores.colorVerde  + operacion.resultadoPotencia(nro1, nro2));
            opSecundaria.esperar();
            break;
         case 6:
             consola.limpiar();
             System.out.print("Ingresa el numero a realizar el factorial: ");
             nro1 = sg.nextDouble();
             System.out.println("El factorial de " + nro1 + " es: " + colores.colorVerde  + operacion.resultadoFactorial(nro1));
             opSecundaria.esperar();
             break;
         case 7:
             consola.limpiar();
             System.out.print("Numero a sacar raiz: ");
             nro1 = sg.nextDouble();
             System.out.println("La raiz cuadrada de " + nro1 + " es: " + colores.colorVerde  + operacion.resultadoRaizCuadrada(nro1));
             opSecundaria.esperar();
             break;
         case 8:
             consola.limpiar();
             System.out.print("Radio del circulo: ");
             nro1 = sg.nextDouble();
             System.out.println("El perimetro del circulo con radio " + nro1 + " es: " + colores.colorVerde  + operacion.resultadoPerimetroCirculo(nro1));
             opSecundaria.esperar();
             break;
         case 9:
             consola.limpiar();
             System.out.print("Numero a sacar porcentaje: ");
             nro1 = sg.nextDouble();
             System.out.print("Porcentaje deseado: ");
             nro2 = sg.nextDouble();
             System.out.println("El " + nro2 + " porciento de " + nro1 + " es: " + colores.colorVerde + operacion.resultadoPorcentaje(nro1, nro2));
             opSecundaria.esperar();
             break;
         case 10:
             consola.limpiar();
             System.out.print("Ingrese el radicando: ");
             nro1 = sg.nextDouble();
             System.out.print("Ingrese el indice: ");
             nro2 = sg.nextDouble();
             System.out.println("La raiz " + nro2 + " de " + nro1 + " es: " + colores.colorVerde + operacion.resultadoRaizIndice(nro1, nro2));
             opSecundaria.esperar();
             break;
        case 11:
            consola.limpiar();
            System.out.println(colores.colorRojo + "Programa finalizado correctamente.");
            System.exit(0);
        default:
            consola.limpiar();
            System.out.println(colores.colorRojo + "Opcion desconocida");
            System.out.println(colores.colorRojo + "Valor ingresado: " + colores.colorVerde  + cases);
            System.out.println(colores.colorRojo + "Posibles opciones: " + colores.colorVerde + "1 - 11" );
            opSecundaria.esperar();
    }
      } catch (InputMismatchException ex) { //Catch del try
            consola.limpiar();
            System.out.println("Solo numeros enteros!");
            System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
            opSecundaria.esperar();
        }
    System.out.println(colores.reiniciarColor + "Desea volver al menu?: " + colores.colorVerde + "Y/N" + colores.reiniciarColor);
    sg.nextLine(); //Limpia variable
    preguntaMenu = sg.nextLine(); //Ingreso de datos para la variable que lleva al menu
    }
    while (preguntaMenu.equals("Y") || (preguntaMenu.equals("y")));
    if (preguntaMenu.equals("N") || (preguntaMenu.equals("n"))) {
        consola.limpiar();
        System.out.println(colores.colorRojo + "Programa finalizado correctamente.");
        System.exit(0);
    }
    else
        consola.limpiar();
        System.out.println("Valor desconocido.");
        System.out.println("Calculadora finalizada de manera" + colores.colorRojo + " incorrecta.");
        System.exit(2); //Valor numerico designado al cierre de manera incorrecta del programa
    }
}