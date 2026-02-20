public class Main {
    public static void main(String[] args) {

        System.out.println("1 Задание. Задача 1");
        InvokeClass demo = new InvokeClass();
        InvokeProcessor.process(demo);

        System.out.println("1 Задание. Задача 2");
        DefaultProcessor.printDefaultClass(DefaultHuman.class);

        System.out.println("1 Задание. Задача 3");
        ToStringHuman h = new ToStringHuman("Арсения", 170);
        System.out.println(ToStringLine.toAnnotatedString(h));

        System.out.println("1 Задание. Задача 4");
        ValidateProcessor.process(ValidateClass.class);

        System.out.println("1 Задание. Задача 5");
        TwoProcessor.process(TwoClass.class);

        System.out.println("1 Задание. Задача 6");
        CacheProcessor.process(CacheClass.class);




    }
}