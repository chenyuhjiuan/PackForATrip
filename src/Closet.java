public abstract class Closet {

   String name;
   String materials;
    String color;

    public Closet() {
    }

    public Closet(String name, String materials, String color) {
        this.name = name;
        this.materials = materials;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


//abstract public void addItems();

    //abstract public String suitcaseName();

}
