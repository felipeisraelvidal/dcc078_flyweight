package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CityFactory {

    private static Map<String, City> cities = new HashMap<>();

    public static City getCidade(String nome, String uf) {
        City city = cities.get(nome);
        if (city == null) {
            city = new City(nome, uf);
            cities.put(nome, city);
        }
        return city;
    }

    public static int getTotalCidades() {
        return cities.size();
    }

}
