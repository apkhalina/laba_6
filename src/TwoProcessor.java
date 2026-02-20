public class TwoProcessor {
    public static void process(Class<?> clazz) {

        if (clazz.isAnnotationPresent(Two.class)) {
            Two annotation = clazz.getAnnotation(Two.class);

            System.out.println("first = " + annotation.first());
            System.out.println("second = " + annotation.second());
        } else {
            System.out.println("Аннотация @Two не найдена.");
        }
    }
}