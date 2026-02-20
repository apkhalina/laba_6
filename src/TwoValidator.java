public class TwoValidator {

    public static void validate(Class<?> clazz) {
        if (!clazz.isAnnotationPresent(Two.class)) {
            throw new IllegalArgumentException("Аннотация @Two отсутствует");
        }

        Two annotation = clazz.getAnnotation(Two.class);

        if (annotation.first().isEmpty()) {
            throw new IllegalArgumentException("Свойство 'first' пустое!");
        }

        if (annotation.second() < 0) {
            throw new IllegalArgumentException("Свойство 'second' отрицательное!");
        }
    }
}