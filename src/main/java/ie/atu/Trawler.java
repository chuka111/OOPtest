package ie.atu;

public class Trawler {
    String name;
    String id;
    String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Trawler{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
