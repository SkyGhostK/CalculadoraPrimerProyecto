package arg.com.Calculadora;

class MetodosSecundarios {

    double getResultadoSumaSecundario (double nur1, double nur2, double nur3) {
        double resultado;
        resultado = nur1 + nur2 + nur3;
        return resultado;
    }

    double getResultadoRestaSecundario (double nur1, double nur2, double nur3) {
        double resultado;
        resultado = nur1 - nur2 - nur3;
        return resultado;
    }

    double getResultadoDivisionSecundario (double nur1, double nur2, double nur3) {
        double resultado;
        resultado = (nur1 / nur2) / nur3;
        return resultado;
    }
    void limpiar()
    {
        for (int i=0; i < 15; i++)
        {
            System.out.println();
        }
    }
}
