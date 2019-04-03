public class Evento {
    private int id;
    private String name;
    private int location;

    public Evento(int id, String name, int location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + " - Nombre: " + this.getName() + " - Locacion: " + this.getLocation();
    }
}