package org.knit;

import org.knit.lab1.SimpleUrl;
import org.knit.lab1.Task1;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.execute();

        String url = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";
        SimpleUrl simpleUrl = new SimpleUrl(url);
        System.out.println(simpleUrl);
    }
}
