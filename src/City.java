public class City {
    private int id;
    private String name;

    public City() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public City setId(int id) {
        this.id = id;
        return this;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }

    public City build() {
        City c = new City();
        c.id = this.id;
        c.name = this.name;
        return c;
    }
}