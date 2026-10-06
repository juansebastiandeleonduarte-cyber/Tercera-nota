public class Ejercicio3 {
    public static void main(String[] args) {
        boolean esPar1 = esNumeroPar(14);
        System.out.println("¿El 14 es par?: " + esPar1);
        
      
        System.out.println("¿El 7 es par?: " + esNumeroPar(7));
    }

    public static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }
}
