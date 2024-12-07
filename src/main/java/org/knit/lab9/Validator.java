package org.knit.lab9;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            Object value = field.get(obj);

            if (field.isAnnotationPresent(NotNull.class) && value == null) {
                System.out.println("Поле " + field.getName() + " не должно быть null.");
            }

            if (field.isAnnotationPresent(MaxLength.class) && value instanceof String) {
                int maxLength = field.getAnnotation(MaxLength.class).value();
                if (((String) value).length() > maxLength) {
                    System.out.println("Поле " + field.getName() + " превышает максимальную длину " + maxLength + ".");
                }
            }

            if (field.isAnnotationPresent(Min.class) && value instanceof Integer) {
                int minValue = field.getAnnotation(Min.class).value();
                if ((Integer) value < minValue) {
                    System.out.println("Поле " + field.getName() + " должно быть не меньше " + minValue + ".");
                }
            }
        }
    }
}
