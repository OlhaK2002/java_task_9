package memento;

public class Character {
    public String name;
    public String dndclass;
    public Stats attributes;

    public Character(String name, String dndclass) {
        this.name = name;
        this.dndclass = dndclass;
    }

    public String getName() {
        return name;
    }

    public String getDndclass() {
        return dndclass;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }
    public void printSheet(){
        System.out.println("Name: " + name + ", class: " + "dndclass \n");
        attributes.printStats();
    }


}

