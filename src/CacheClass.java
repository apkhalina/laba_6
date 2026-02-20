@Cache({"users", "age", "number"})
public class CacheClass {

    public String getUser(int id) {
        return "User" + id;
    }

    public String getAge(int id) {
        return "Age" + id;
    }

    public int number() {
        return 42;
    }
}