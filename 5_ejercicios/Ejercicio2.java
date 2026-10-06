public class Ejercicio2 {
    public static void main(String[] args) {
        String resultado = evaluarNumero(-8);
        System.out.println("El resultado es: " + resultado);
        
     
        System.out.println("Prueba con 0: " + evaluarNumero(0));
        System.out.println("Prueba con 15: " + evaluarNumero(15));
    }

    public static String evaluarNumero(int numero) {
        if (numero > 0) {
            return "Positivo";
        } else if (numero < 0) {
            return "Negativo";
        } else {
            return "Cero";
        }
    }
}

