package arg.com.Calculadora;

class Metodos {

    double resultadoSuma (double nur1, double nur2) {
        double resultado;
        resultado = nur1 + nur2;
        return resultado;
    }
    double resultadoResta (double nur1, double nur2) {
        double resultadores;
        resultadores = nur1 - nur2;
        return resultadores;
    }
    double resultadoMultiplicacion (double nur1, double nur2) {
        double resultado;
        resultado = nur1 * nur2;
        return resultado;
    }
    double resultadoDivision (double nur1, double nur2) {
        double resultado;
        resultado = nur1 / nur2;
        return resultado;
    }
    double resultadoPotencia (double nur1, double nur2) {
        double resultado;
        resultado = Math.pow(nur1,nur2);
        return resultado;
    }
    double resultadoRaizCuadrada (double nur1) {
        double resultado;
        resultado = Math.sqrt(nur1);
        return resultado;
    }
    double resultadoPerimetroCirculo (double nur1) {
        double resultado;
        resultado = 2 * Math.PI * nur1;
        return resultado;
    }
    double resultadoPorcentaje (double nur1, double nur2) {
        double resultado;
        resultado = nur1 * nur2 / 100;
        return resultado;
    }
    double resultadoRaizIndice (double nur1, double nur2) {
        double resultado;
        resultado = Math.pow(nur1, 1 / nur2);
        return resultado;
    }
    double resultadoFactorial (double nur1){
        double factorial = 1;
        for (double i = nur1; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
