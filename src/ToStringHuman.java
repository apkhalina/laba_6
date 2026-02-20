@ToString
public class ToStringHuman {
    private String name;

    @ToString(ToString.Mode.NO)
    private int height;

    public ToStringHuman(String name, int height) {
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

    @Override
    public String toString() {
        return name + " с ростом " + height;
    }
}