//Для этого класса тип по умолчанию - String
@Default(String.class)
public class DefaultHuman {

    private String name;
    private int height;

    public DefaultHuman(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return getName() + " с ростом " + getHeight();
    }

}