import java.util.Scanner;
public class Conversion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1. Kilómetros a Millas");
        System.out.println("2. Litros a Galones");
        System.out.println("3. Gramos a Onzas");
        System.out.println("4. Centímetros a Pulgadas");
        int opcion = scanner.nextInt();
        switch (opcion) {


            case 1:
                System.out.println("Ingrese la distancia en kilometros:");
                double kilometers = scanner.nextDouble();
                double miles = kilometers * 0.621371;
                System.out.printf("%.2f kilometros son %.2f millas%n", kilometers, miles);
                break;
            case 2: 
                System.out.println("Ingrese la cantidad de litros:");
                double liters = scanner.nextDouble();       
                double gallons = liters * 0.264172;
                System.out.printf("%.2f litros son %.2f galones%n", liters, gallons);
                
                break;
            case 3:
                System.out.println("Ingrese la cantidad de gramos:");
                double grams = scanner.nextDouble();
                double ounces = grams * 0.035274;
                System.out.printf("%.2f gramos son %.2f onzas%n", grams, ounces);
                break;
            case 4:
                System.out.println("Ingrese la medida en centimetros:");
                double centimeters = scanner.nextDouble();
                double inches = centimeters * 0.393701;
                System.out.printf("%.2f centimetros son %.2f pulgadas%n", centimeters, inches);
                break;
        
            default:
                System.out.println("Opción no válida. Por favor, elija una opción entre 1 y 4.");
                break;
        }
    }
}