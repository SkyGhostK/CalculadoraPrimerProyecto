package arg.com.Calculadora;

class MetodosSecundarios {

    double resultadoSumaS(double nro1, double nro2, double nro3) {
        double resultado;
        resultado = nro1 + nro2 + nro3;
        return resultado;
    }

    double resultadoRestaS(double nro1, double nro2, double nro3) {
        double resultado;
        resultado = nro1 - nro2 - nro3;
        return resultado;
    }

    double resultadoDivisionS(double nro1, double nro2, double nro3) {
        double resultado;
        resultado = (nro1 / nro2) / nro3;
        return resultado;
    }

    double resultadoMultiplicacionS (double nro1, double nro2, double nro3) {
        double resultado;
        resultado = (nro1 * nro2) * nro3;
        return resultado;
    }

    void limpiar() {
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
    }
    void esperar(){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println();
        }

    }
    final String reiniciarColor = "\u001B[0m";

    final String colorRojo = "\u001B[31m";

    final String colorVerde = "\u001B[32m";

}