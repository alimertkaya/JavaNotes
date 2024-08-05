public class Main extends TempConverterBase {

    public static void main(String[] args) {
        TempConverterBase converter = new TempConverterBase();

        System.out.println("25°C to Fahrenheit: " + converter.convert(25, "Celsius", "Fahrenheit"));
        System.out.println("77°F to Celsius: " + converter.convert(77, "Fahrenheit", "Celsius"));
        System.out.println("0°C to Kelvin: " + converter.convert(0, "Celsius", "Kelvin"));
        System.out.println("300K to Celsius: " + converter.convert(300, "Kelvin", "Celsius"));
        System.out.println("100°F to Kelvin: " + converter.convert(100, "Fahrenheit", "Kelvin"));
        System.out.println("373.15K to Fahrenheit: " + converter.convert(373.15, "Kelvin", "Fahrenheit"));

    }
}