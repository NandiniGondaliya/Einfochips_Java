public class Employee {
 
    private String name;
    private String location;
    private String id;

public Employee(String name, String location, String id) {
        this.name = name;
        this.location = location;
        this.id = id;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", location='" + getLocation() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }


}   
