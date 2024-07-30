import java.util.Scanner;

public class TemperatureConverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();
        
        System.out.println("Enter the original unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char unit = scanner.next().charAt(0);
        
        switch (unit) {
            case 'C':
            case 'c':
                convertFromCelsius(temperature);
                break;
            case 'F':
            case 'f':
                convertFromFahrenheit(temperature);
                break;
            case 'K':
            case 'k':
                convertFromKelvin(temperature);
                break;
            default:
                System.out.println("Invalid unit of measurement entered.");
        }
        
        scanner.close();
    }
    
    public static void convertFromCelsius(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperature in Kelvin: %.2fK%n", kelvin);
    }
    
    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = celsius + 273.15;
        
        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
        System.out.printf("Temperature in Kelvin: %.2fK%n", kelvin);
    }
    
    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
    }
}