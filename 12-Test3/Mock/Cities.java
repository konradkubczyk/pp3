import java.util.ArrayList;

public class Cities {
    String[] cities;

    public Cities(String[] cities) {
        this.cities = cities;
    }

    public Cities filter(char firstLetter) {
        ArrayList<String> filteredCities = new ArrayList<String>();

        for (String city : cities) {
            if (city.charAt(0) == firstLetter) {
                filteredCities.add(city);
            }
        }

        return new Cities(filteredCities.toArray(new String[] {}));
    }

    public String cities() {
        return String.join("", cities);
    }
}
