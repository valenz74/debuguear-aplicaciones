public class DebuguearAplicaciones {
    public static void main(String[] args) {
        contador();
    }
        static void contador() {
        int contador = 0;
        while (true) {
            System.out.println("Mi contador es igual a: " + contador);
            if (contador == 3) {
                break;
            }
        contador++;
        }
        System.out.println("Fin de la aplicacion");
    }
}
