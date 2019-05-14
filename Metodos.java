package arg.com.Calculadora;

class Metodos {

    Metodos() {
        colorRojo = "\u001B[31m";
        reiniciarColor = "\u001B[0m";
        colorCeleste = "\u001B[36m";
        colorVerde = "\u001B[32m";
    }

    double getResultadoSuma (double nur1, double nur2) {
        double resultado;
        resultado = nur1 + nur2;
        return resultado;
    }
    double getResultadoResta (double nur1, double nur2) {
        double resultadores;
        resultadores = nur1 - nur2;
        return resultadores;
    }
    double getResultadoMultiplicacion (double nur1, double nur2) {
        double resultado;
        resultado = nur1 * nur2;
        return resultado;
    }
    double getResultadoDivision (double nur1, double nur2) {
        double resultado;
        resultado = nur1 / nur2;
        return resultado;
    }
    double getResultadoPotencia (double nur1, double nur2) {
        double resultado;
        resultado = Math.pow(nur1,nur2);
        return resultado;
    }
    double getResultadoRaizCuadrada (double nur1) {
        double resultado;
        resultado = Math.sqrt(nur1);
        return resultado;
    }
    double getResultadoPerimetroCirculo (double nur1) {
        double resultado;
        resultado = 2 * Math.PI * nur1;
        return resultado;
    }
    double getResultadoPorcentaje (double nur1, double nur2) {
        double resultado;
        resultado = nur1 * nur2 / 100;
        return resultado;
    }
    double getResultadoRaizIndice (double nur1, double nur2) {
        double resultado;
        resultado = Math.pow(nur1, 1 / nur2);
        return resultado;
    }
    double getResultadoFactorial (double nur1){
        double factorial = 1;
        for (double i = nur1; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
        final String reiniciarColor;

        final String colorRojo;

        final String colorCeleste;

        final String colorVerde;

}
