package org.knit.lab4;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Task7 {
    public static void main(String[] args) throws IOException {
        File dictionaryFile = new File("C:\\Users\\User\\GitHub\\jv\\src\\main\\java\\org\\knit\\lab4\\dictionary");

        List<String> wordsList = new ArrayList<>();
        Scanner scanner = new Scanner(dictionaryFile);
        while (scanner.hasNextLine()) {
            wordsList.add(scanner.nextLine().toLowerCase()); // Приводим к нижнему регистру
            }
        // Преобразуем список в массив
        String[] words = wordsList.toArray(new String[0]);
        char[] alphabet = "абвгдежзийклмнопрстуфхцчшщъыьэюя".toCharArray();
        DictionaryStatistic stats = new DictionaryStatistic(words, alphabet);
        stats.printStatistics();
        System.out.println("\nЧастота букв в словаре:");
        stats.printSymbolsStat();

        System.out.println("\nСлучайное слово из словаря: " + stats.getRandomWord());
    }
}
