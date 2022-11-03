class TemperatureUnitConverter {

    public double CelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double CelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double KelivnToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double KelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double FahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static void main(String[] args) {

        TemperatureUnitConverter temperatureUnitConverter = new TemperatureUnitConverter();

        System.out.println("25 °C = " + temperatureUnitConverter.CelsiusToKelvin(25) + " K");
        System.out.println("25 °C = " + temperatureUnitConverter.CelsiusToFahrenheit(25) + " °F");
        System.out.println("100 °F = " + temperatureUnitConverter.FahrenheitToKelvin(100) + " K");
        System.out.println("100 °F = " + temperatureUnitConverter.FahrenheitToCelsius(100) + " °C");
        System.out.println("0 K = " + temperatureUnitConverter.KelivnToCelsius(0) + " °C");
        System.out.println("0 K = " + temperatureUnitConverter.KelvinToFahrenheit(0) + " °F");

    }

}