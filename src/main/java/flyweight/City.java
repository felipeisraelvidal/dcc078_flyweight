package flyweight;

public class City {

    private String name;
    private String state;

    public City(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getNome() {
        return name;
    }

    public String getUf() {
        return state;
    }

}
