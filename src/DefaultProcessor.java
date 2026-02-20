public class DefaultProcessor {
    public static void printDefaultClass(Class<?> cls) {
        if (cls.isAnnotationPresent(Default.class)) {
            Default d = cls.getAnnotation(Default.class);
            System.out.println("Указанный класс по умолчанию: " + d.value().getName());
        } else {
            System.out.println("Аннотация @Default не найдена.");
        }
    }
}