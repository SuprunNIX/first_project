package TheReflectionAPI;

import java.lang.reflect.Field;

public class Program {
    public static void setName(Object object) throws IllegalAccessException {
        Class myClass = object.getClass();
        Field[] myField = myClass.getDeclaredFields();
        for (Field field : myField) {
            field.setAccessible(true);
            field.set(object, "Field");
            field.setAccessible(false);
        }
    }
}
