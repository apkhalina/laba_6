import java.lang.reflect.Field;

public class ToStringLine {

    public static String toAnnotatedString(Object obj) {
        Class<?> clazz = obj.getClass();

        if (!clazz.isAnnotationPresent(ToString.class)) {
            return obj.toString();
        }

        //Начинаем собирать строку
        StringBuilder result = new StringBuilder(clazz.getSimpleName())
                .append("{");

        Field[] fields = clazz.getDeclaredFields();
        boolean first = true;  // Флаг для первого поля (не ставим запятую)

        //Перебираем все поля
        for (Field field : fields) {

            ToString annotation = field.getAnnotation(ToString.class);

            if (annotation != null && annotation.value() == ToString.Mode.NO) {
                continue;
            }

            try {
                field.setAccessible(true);

                // Добавляем запятую, если это не первое поле
                if (!first) {
                    result.append(", ");
                }

                result.append(field.getName())
                        .append("=")
                        .append(field.get(obj));

                first = false;

            } catch (IllegalAccessException e) {
            }
        }

        return result.append("}").toString();
    }
}