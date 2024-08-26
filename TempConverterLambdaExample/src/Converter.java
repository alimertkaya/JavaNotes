@FunctionalInterface
public interface Converter {

    public void convert(double value, String fromUnit, String toUnit);
}
