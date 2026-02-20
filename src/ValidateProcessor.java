public class ValidateProcessor {

    public static void process(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Validate.class)) {
            Validate validate = clazz.getAnnotation(Validate.class);

            System.out.println("Классы, указанные в @Validate для " + clazz.getSimpleName() + ":");
            for (Class<?> c : validate.value()) {
                System.out.println(" - " + c.getName());
            }
        } else {
            System.out.println("Аннотация @Validate отсутствует");
        }
    }
}