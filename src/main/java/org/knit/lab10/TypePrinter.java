package org.knit.lab10;

public class TypePrinter {

    public static <T> void printType(T object) {
        if (object == null) {
            System.out.println("null");
        } else {
            System.out.println(object.getClass().getName());
        }
    }

}
