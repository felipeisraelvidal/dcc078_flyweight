package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Gym {

    private List<Person> people = new ArrayList<Person>();

    public void enroll(String personName, String cityName, String state) {
        City city = CityFactory.getCidade(cityName, state);
        Person person = new Person(personName, city);
        people.add(person);
    }

    public List<String> getPeople() {
        List<String> result = new ArrayList<String>();
        for (Person person : this.people) {
            result.add(person.getPerson());
        }
        return result;
    }

}
