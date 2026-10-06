public class Ejercicio4 {
    
    public static void main(String[] args) {
        int suma = sumarTresNumeros(12, 25, 10);
        System.out.println("La suma total es: " + suma);
        
    
        System.out.println("Prueba 2: " + sumarTresNumeros(-5, 5, 20));
    }

    public static int sumarTresNumeros(int a, int b, int c) {
        return a + b + c;
    }
}

