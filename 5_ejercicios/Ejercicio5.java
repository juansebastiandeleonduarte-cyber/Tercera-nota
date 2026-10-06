public class Ejercicio5 {
    public static void main(String[] args) {
        int menor = encontrarMenor(15, 8, 23);
        System.out.println("El número menor es: " + menor);
        
        System.out.println("Prueba 2: " + encontrarMenor(4, 2, 9));
    }

    public static int encontrarMenor(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}

