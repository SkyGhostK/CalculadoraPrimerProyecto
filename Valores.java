package arg.com.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
            Scanner sg = new Scanner(System.in);
            Metodos colores = new Metodos(), operacion = new Metodos();
            MetodosSecundarios opSecundaria = new MetodosSecundarios(), consola = new MetodosSecundarios();
        do {
            try {
                System.out.println(colores.colorCeleste + "**************Menu**************");
                System.out.println(colores.reiniciarColor + "Ingresa 1 para realizar una suma");
                System.out.println("Ingresa 2 para realizar una resta");
                System.out.println("Ingresa 3 para realizar una division");
                System.out.println("Ingresa 4 para realizar una multiplicacion");
                System.out.println("Ingresa 5 para realizar el factorial de un valor");
                System.out.println("Ingresa 6 para realizar una potencia");
                System.out.println("Ingresa 7 para sacar raiz cuadrada de un valor");
                System.out.println("Ingresa 8 para sacar el porcentaje de un valor");
                System.out.println("Ingresa 9 para operar raices cubicas, cualquier indice n");
                System.out.println("Ingresa 10 para obtener el perimetro de un circulo");
                System.out.println("Ingresa 11 para finalizar el programa");
                System.out.println(colores.colorCeleste + "********************************");
                System.out.print(colores.colorVerde + "Numero: " + colores.reiniciarColor);
                int cases = sg.nextInt();
                switch (cases) {
                    case 1:
                        try {
                            consola.limpiar();
                            System.out.print("Ingresa el primer numero para la operacion suma: ");
                            double nur1 = sg.nextDouble();
                            System.out.print("Ingresa el segundo numero para la operacion suma: ");
                            double nur2 = sg.nextDouble();
                            System.out.print("Desea ingresar otro numero? - Y/N: ");
                            sg.nextLine(); //Salto de linea en el escaner (internamente) asi puede tomar string
                            String pregunta1 = sg.nextLine();
                            if (pregunta1.equals("Y") || (pregunta1.equals("y"))) {
                                System.out.print("Ingrese el tercer numero: ");
                                double nur3 = sg.nextDouble();
                                System.out.println("La suma es: " + colores.colorRojo + opSecundaria.getResultadoSumaSecundario(nur1, nur2, nur3));
                            } else
                                System.out.println("La suma es: " + colores.colorRojo + operacion.getResultadoSuma(nur1, nur2));
                        } catch (InputMismatchException ex) {
                            consola.limpiar();
                            System.out.println("Solo numeros enteros!");
                            System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
                        }
                        break;
                    case 2:
                        try {
                            consola.limpiar();
                            System.out.print("Ingresa el primer numero para la operacion resta: ");
                            double nur1 = sg.nextDouble();
                            System.out.print("Ingresa el segundo numero para la operacion resta: ");
                            double nur2 = sg.nextDouble();
                            System.out.print("Desea ingresar otro numero? - Y/N: ");
                            sg.nextLine();
                            String pregunta1 = sg.nextLine();
                            if (pregunta1.equals("Y") || (pregunta1.equals("y"))) {
                                System.out.print("Ingrese el tercer numero: ");
                                double nur3 = sg.nextDouble();
                                System.out.println("La resta es: " + colores.colorRojo + opSecundaria.getResultadoRestaSecundario(nur1, nur2, nur3));
                            } else
                                System.out.println("La resta es: " + colores.colorRojo + operacion.getResultadoResta(nur1, nur2));
                        } catch (InputMismatchException ex) {
                            consola.limpiar();
                            System.out.println("Solo numeros enteros!");
                            System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
                        }
                        break;
                    case 3:
                        try {
                            consola.limpiar();
                            System.out.print("Ingresa el primer numero para la operacion division: ");
                            double nur1 = sg.nextDouble();
                            System.out.print("Ingresa el segundo numero para la operacion division: ");
                            double nur2 = sg.nextDouble();
                            if (nur2 == 0) System.out.println(colores.colorRojo + "No se puede dividir por 0");
                            System.out.print("Desea ingresar otro numero? - Y/N: ");
                            sg.nextLine();
                            String pregunta1 = sg.nextLine();
                            if (pregunta1.equals("Y") || (pregunta1.equals("y"))) {
                                System.out.print("Ingrese el tercer numero: ");
                                double nur3 = sg.nextDouble();
                                if (nur3 == 0) System.out.println(colores.colorRojo + "No se puede dividir por 0");
                                System.out.println("La division es: " + colores.colorRojo + opSecundaria.getResultadoDivisionSecundario(nur1, nur2, nur3));
                            } else
                                System.out.println("La division es: " + colores.colorRojo + operacion.getResultadoDivision(nur1, nur2));
                        } catch (InputMismatchException ex) {
                            consola.limpiar();
                            System.out.println("Solo numeros enteros!");
                            System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
                        }
                        break;
                    case 4:
                        try {
                            consola.limpiar();
                            System.out.print("Ingresa el primer numero para la operacion multiplicacion: ");
                            double nur1 = sg.nextDouble();
                            System.out.print("Ingresa el segundo numero para la operacion multiplicacion: ");
                            double nur2 = sg.nextDouble();
                            System.out.println("La multiplicacion es: " + colores.colorRojo + operacion.getResultadoMultiplicacion(nur1, nur2));
                        } catch (InputMismatchException ex) {
                            consola.limpiar();
                            System.out.println("Solo numeros enteros!");
                            System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
                        }
                        break;
                    case 5:
                        try {
                            consola.limpiar();
                            System.out.print("Ingresa el numero a realizar el factorial: ");
                            double nur1 = sg.nextLong();
                            System.out.println("El factorial de " + nur1 + " es: " + colores.colorRojo + operacion.getResultadoFactorial(nur1));
                        } catch (InputMismatchException ex) {
                            consola.limpiar();
                            System.out.println("Solo numeros enteros!");
                            System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
                        }
                        break;
                    case 6:
                        try {
                            consola.limpiar();
                            System.out.print("Numero de la base: ");
                            double nur1 = sg.nextDouble();
                            System.out.print("Numero del exponente: ");
                            double nur2 = sg.nextDouble();
                            System.out.println("El numero " + " elevado a " + "es igual a: " + colores.colorRojo + operacion.getResultadoPotencia(nur1, nur2));
                        } catch (InputMismatchException ex) {
                            consola.limpiar();
                            System.out.println("Solo numeros enteros!");
                            System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
                        }
                        break;
                    case 7:
                        try {
                            consola.limpiar();
                            System.out.print("Numero para sacar raiz: ");
                            double nur1 = sg.nextDouble();
                            System.out.println("La raiz cuadrada de " + nur1 + " es " + colores.colorRojo + operacion.getResultadoRaizCuadrada(nur1));
                        } catch (InputMismatchException ex) {
                            consola.limpiar();
                            System.out.println("Solo numeros enteros!");
                            System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
                        }
                        break;
                    case 8:
                        try {
                            consola.limpiar();
                            System.out.print("Numero a sacar porcentaje: ");
                            double nur1 = sg.nextDouble();
                            System.out.print("Numero del porcentaje deseado: ");
                            double nur2 = sg.nextDouble();
                            System.out.println("El " + nur2 + "%" + " de " + nur1 + " es " + colores.colorRojo + operacion.getResultadoPorcentaje(nur1, nur2));
                        } catch (InputMismatchException ex) {
                            consola.limpiar();
                            System.out.println("Solo numeros enteros!");
                            System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
                        }
                        break;
                    case 9:
                        try {
                            consola.limpiar();
                            System.out.print("Ingrese el radicando: ");
                            double nur1 = sg.nextDouble();
                            System.out.print("Ingrese el indice: ");
                            double nur2 = sg.nextDouble();
                            System.out.println("La raiz " + nur2 + " de " + nur1 + " es " + colores.colorRojo + operacion.getResultadoRaizIndice(nur1, nur2));
                        } catch (InputMismatchException ex) {
                            consola.limpiar();
                            System.out.println("Solo numeros enteros!");
                            System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
                        }
                        break;
                    case 10:
                        try {
                            consola.limpiar();
                            System.out.print("Ingrese el radio del circulo: ");
                            double nur1 = sg.nextDouble();
                            System.out.println("El circulo de radio " + nur1 + " tiene un perimetro de " + colores.colorRojo + operacion.getResultadoPerimetroCirculo(nur1));
                        } catch (InputMismatchException ex) {
                            consola.limpiar();
                            System.out.println("Solo numeros enteros!");
                            System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
                        }
                        break;
                    case 11:
                        consola.limpiar();
                        System.out.println(colores.colorRojo + "Programa finalizado.");
                        break;
                    default:
                        consola.limpiar();
                        System.out.println("Opcion no valida. Verifique el numero ingresado");
                        System.out.println("Numeros admitidos: 1 - 11");
                        System.out.println("Numero ingresado: " + colores.colorRojo + cases);
                        break;
                } //Cierra el switch
            } //Cierra el try que va en conjunto con el catch debajo (Detallado en el mismo)
            catch (InputMismatchException ex) {
                consola.limpiar();
                System.out.println("Solo numeros enteros!");
                System.out.println("Codigo de error: " + colores.colorRojo + "InputMismatchException");
            } //Cierre del catch que detecta la excepcion InputMismatchException en el menu
            String preguntamenu = sg.nextLine();
        }while (preguntamenu.equals("Si"));
        } //Cierra metodo main
    } //Cierra la clase arg.com.Calculadora.Valores