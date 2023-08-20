public class AprendizajeSupervisado {
    public static void main(String[] args) {

        double[][] datos = {{180, 1}, {150, 0}, {175, 1}, {160, 0}};

        double nuevaAltura = 170;

        double umbral = 170;
        int resultadoPredicho = (nuevaAltura >= umbral) ? 1 : 0;

        System.out.println("\nResultado predicho: " + resultadoPredicho);
    }
}
