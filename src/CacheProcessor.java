public class CacheProcessor {

    public static void process(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Cache.class)) {

            Cache cache = clazz.getAnnotation(Cache.class);
            String[] areas = cache.value();

            if (areas.length == 0) {
                System.out.println("Список кешируемых областей пуст.");
            } else {
                System.out.println("Кешируемые области:");
                for (String area : areas) {
                    System.out.println(" - " + area);
                }
            }

        } else {
            System.out.println("Аннотация @Cache отсутствует.");
        }
    }

}