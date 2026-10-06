public class Ejercicio1 {
    public static void main(String[] args) {
        double promedio = calcularPromedio(4.5, 3.2, 5.0);
        System.out.println("El promedio es: " + promedio);
        
    
        System.out.println("Prueba 2: " + calcularPromedio(10.0, 20.0, 30.0));
    }

    public static double calcularPromedio(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
}