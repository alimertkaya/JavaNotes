public class Main {
    public static void main(String[] args) {
        Converter c1 = (v,f,u) -> {

            if (f.equalsIgnoreCase("celsius")) {
                if (u.equalsIgnoreCase("fahrenheit"))
                    System.out.println(v + " Celsius to Fahrenheit: " + (v * 9/5 + 32));
                else if (u.equalsIgnoreCase("kelvin"))
                    System.out.println(v + " Celsius to Kelvin: " + (v + 273.15));
            } else if (f.equalsIgnoreCase("fahrenheit")) {
                if (u.equalsIgnoreCase("celsius"))
                    System.out.println(v + " Fahrenheit to Celsius: " + ((v - 32) * 5/9));
                else if (u.equalsIgnoreCase("kelvin")) {
                    System.out.println(v + " Fahrenheit to Kelvin: " + ((v - 32) * 5 / 9 + 273.15));
                }
            } else if (f.equalsIgnoreCase("kelvin")) {
                if (u.equalsIgnoreCase("celsius"))
                    System.out.println(v + " Kelvin to Celsius: " + (v - 273.15));
                else if (u.equalsIgnoreCase("fahrenheit")) {
                    System.out.println(v + " Kelvin to Fahrenheit: " + ((v - 273.15) * 9 / 5 + 32));
                }
            }
        };

        c1.convert(25, "Celsius", "Fahrenheit");
        c1.convert(77, "Fahrenheit", "Celsius");
        c1.convert(0, "Celsius", "Kelvin");
        c1.convert(300, "Kelvin", "Celsius");
        c1.convert(100, "Fahrenheit", "Kelvin");
        c1.convert(373.15, "Kelvin", "Fahrenheit");
    }
}