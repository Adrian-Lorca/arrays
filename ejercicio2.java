public class ejercicio2 {
    public static void main(String[] args) {
        String cadena [] = {"Hola", "mundo", "bienvenido"};
        int mayor = 0;
        for (int i = 0; i < cadena.length; i++) {
           int longitud = cadena[i].length();
           if(longitud > mayor) {
               mayor = cadena[i].length();
               int posicion_Mayor = i;
               System.out.println("La cadena mas larga es: ");
            }
        }
    }
}
