package flyweight;

public class Person {

    private String name;
    private City city;

    public  Person(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getPerson() {
        return "Person { " +
                "name: '" + this.name + "\', " +
                "city: \'" + city.getNome() + "\', " +
                "state: '" + city.getUf() + "\' " +
                '}';
    }

}
