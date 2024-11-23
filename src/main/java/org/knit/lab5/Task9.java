package org.knit.lab5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task9 {

    public static final int TIME = 60000;
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Users\\User\\GitHub\\jv\\src\\main\\java\\org\\knit\\lab4\\dictionary";
        List<String> words;

        words = getWords(filePath);

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // Счетчики
        int totalWords = 0;
        int correctWords = 0;
        int totalChars = 0;

        long startTime = System.currentTimeMillis();
        long endTime = startTime + TIME;
        System.out.println("Старт! В течение минуты вводите предложенные слова:");

        while (System.currentTimeMillis() < endTime) {
            String randomWord = words.get(random.nextInt(words.size()));
            System.out.println("Введите слово: " + randomWord);
            String userInput = scanner.nextLine();
            if (System.currentTimeMillis() >= endTime) {
                break;
            }
            totalWords++;
            totalChars += userInput.length();
            if (userInput.equals(randomWord)) {
                correctWords++;
            }
        }
        scanner.close();

        // Итоговые результаты
        System.out.println("\nИгра окончена!");
        System.out.println("Количество слов всего: " + totalWords);
        System.out.println("Количество правильных слов: " + correctWords);
        System.out.println("Количество введенных символов: " + totalChars);
        double speed = totalChars / 60.0; // Скорость в символах в секунду
        System.out.printf("Скорость (символов в секунду): %.2f\n", speed);
    }

    // Метод для чтения списка слов из файла
    public static List<String> getWords(String path) throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNextLine()) {
            words.add(scanner.nextLine().trim());
            }
        return words;
    }
}
