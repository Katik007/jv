package org.knit;

import org.knit.lab1.SimpleUrl;
import org.knit.lab1.Task1;
import org.knit.lab2.Task3;
import org.knit.lab2.Task4;
import org.knit.lab3.Priest;
import org.knit.lab3.Task6;
import org.knit.lab3.Warrior;
import org.knit.lab3.Mage;

public class Main {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        task1.execute();
//
//        String url = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";
//        SimpleUrl simpleUrl = new SimpleUrl(url);
//        System.out.println(simpleUrl);

//        Task3 task3 = new Task3();
//        task3.main(new String[]{});

//        Task4 task4 = new Task4();
//        task4.main(new String[]{});
          Warrior warrior = new Warrior(100, "Воин", 5,5);
          Priest priest = new Priest(100, "Свят",3, 2);
          Mage mage = new Mage(100, "Маг", 1, 4);
          warrior.attak(priest);
          priest.heal(warrior);
          mage.castSpell(warrior);


    }
}
