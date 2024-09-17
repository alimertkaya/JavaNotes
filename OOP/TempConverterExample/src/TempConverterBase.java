public class TempConverterBase implements TempConverter {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("Celsius")) {
            if (toUnit.equalsIgnoreCase("Fahrenheit"))
                return celsiusToFahrenheit(value);
            else if (toUnit.equalsIgnoreCase("Kelvin"))
                return celsiusToKelvin(value);
        }
        else if (fromUnit.equalsIgnoreCase("Fahrenheit")) {
            if (toUnit.equalsIgnoreCase("Celsius"))
                return fahrenheitToCelsius(value);
            else if (toUnit.equalsIgnoreCase("Kelvin"))
                return fahrenheitToKelvin(value);
        }
        else if (fromUnit.equalsIgnoreCase("Kelvin")) {
            if (toUnit.equalsIgnoreCase("Celsius"))
                return kelvinToCelsius(value);
            else if (toUnit.equalsIgnoreCase("Fahrenheit"))
                kelvinToFahrenheit(value);
        }
        return 0;
    }

    private double celsiusToFahrenheit(double value) {
        return value * 9/5 + 32;
    }

    private double celsiusToKelvin(double value) {
        return value + 273.15;
    }

    private double fahrenheitToCelsius(double value) {
        return (value - 32) * 5/9;
    }

    private double fahrenheitToKelvin(double value) {
        double newValue = fahrenheitToCelsius(value);
        return celsiusToKelvin(newValue);
    }

    private double kelvinToCelsius(double value) {
        return value - 273.15;
    }

    private double kelvinToFahrenheit(double value) {
        double newValue = kelvinToCelsius(value);
        return celsiusToFahrenheit(newValue);
    }
}