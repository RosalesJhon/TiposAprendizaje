import java.util.Random;

public class AprendizajeNoSupervisado{

    public static void main(String[] args) {

        double[][] datos = generarDatosMuestra(5);

        double[][] componentesPrincipales = aplicarPCA(datos);

        for (int i = 0; i < componentesPrincipales.length; i++) {
            System.out.println("Componente Principal " + (i + 1) + ":");
            for (int j = 0; j < componentesPrincipales[i].length; j++) {
                System.out.print(componentesPrincipales[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] generarDatosMuestra(int numDatos) {
        Random rand = new Random();
        double[][] datos = new double[numDatos][2];
        for (int i = 0; i < numDatos; i++) {
            datos[i][0] = rand.nextDouble() * 10;
            datos[i][1] = datos[i][0] * 2 + rand.nextDouble() * 2;
        }
        return datos;
    }

    public static double[][] aplicarPCA(double[][] datos) {

        return datos;
    }
}
