import java.lang.reflect.Method;

public class InvokeProcessor {

    public static void process(Object obj) {
        //Получаем класс объекта
        Class<?> clazz = obj.getClass();

        //Получаем ВСЕ методы класса
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(Invoke.class)) {

                try {
                    method.setAccessible(true);

                    method.invoke(obj);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}