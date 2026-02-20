public class InvokeTestClass {
    public boolean flag = false;
    public int counter = 0;

    @Invoke
    public void setFlag() {
        flag = true;
    }

    @Invoke
    public void increment() {
        counter++;
    }

    public void notAnnotated() {
        counter += 10;
    }
}