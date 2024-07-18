package javaapplication65;

public class JavaApplication65 {

    public static void main(String[] args) {
        int notas[][] = {{110, 20, 30},
        {40, 50, 60},
        {70, 80, 90}};

    }

    public static String diagonal(int matriz[][]) {
        String resultado = "";
        for (int i = 0; i < matriz.length; i++) {
            resultado = resultado + String.valueOf(matriz[i][i] + "|");

        }
        return resultado;

    }
}
