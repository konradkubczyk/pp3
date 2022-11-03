class TemperatureUnitConverter {

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double kelivnToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static void main(String[] args) {

        TemperatureUnitConverter temperatureUnitConverter = new TemperatureUnitConverter();

        System.out.println("25 °C = " + temperatureUnitConverter.celsiusToKelvin(25) + " K");
        System.out.println("25 °C = " + temperatureUnitConverter.celsiusToFahrenheit(25) + " °F");
        System.out.println("100 °F = " + temperatureUnitConverter.fahrenheitToKelvin(100) + " K");
        System.out.println("100 °F = " + temperatureUnitConverter.fahrenheitToCelsius(100) + " °C");
        System.out.println("0 K = " + temperatureUnitConverter.kelivnToCelsius(0) + " °C");
        System.out.println("0 K = " + temperatureUnitConverter.kelvinToFahrenheit(0) + " °F");

    }

}