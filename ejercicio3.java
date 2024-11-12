public class ejercicio3 {
    public static void main(String[] args) {
        String[] palabras = {"Hola", "mundo", "bienvenido", "a", "Java"}; 
        char caracter = 'b';
        for(String resultado : palabras ) {
            if(resultado.length() > 0 && resultado.charAt(0) == caracter) {
                System.out.println(resultado);
            }
        }
    }
}
