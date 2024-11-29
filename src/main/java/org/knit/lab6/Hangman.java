package org.knit.lab6;

import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList(
                "море", "гора", "зима", "лето", "дверь", "рыба", "снег", "рука", "книга", "огонь",
                "дождь", "ночь", "река", "путь", "луна", "день", "ветер", "лиса", "гусь", "гром",
                "камень", "поле", "лист", "сосна", "гриб", "трава", "пруд", "озеро", "волна", "зверь",
                "кошка", "берег", "туман", "краб", "лодка", "птица", "звено", "скала", "остов", "пчела",
                "земля", "лодка", "пауза", "ключ", "краб", "песок", "шаг", "пламя", "коса", "осень",
                "весна", "зима", "солнце", "цвет", "маска", "праздник", "ветка", "свеча", "шуба", "улыбка",
                "хлеб", "зерно", "чайка", "шишка", "ракета", "сено", "дочь", "луковица", "конь", "гусь",
                "улыбка", "тень", "град", "птица", "луг", "шахта", "чайка", "свеча", "чашка", "баня",
                "трава", "шляпа", "вода", "поле", "окно", "яблоко", "взгляд", "душа", "пруд", "луна"
        );

        Random random = new Random();
        String wordToGuess = dictionary.get(random.nextInt(dictionary.size()));

        // Инициализация переменных игры
        List<Character> guessedWord = new ArrayList<>(Collections.nCopies(wordToGuess.length(), '_'));
        Set<Character> guessedLetters = new HashSet<>();
        int attemptsLeft = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру 'Виселица'!");

        // Основной игровой цикл
        while (attemptsLeft > 0) {
            // Печать текущего состояния слова
            System.out.println("\nЗагаданное слово: " + getWordDisplay(guessedWord));
            System.out.print("Введите букву: ");
            char letter = scanner.next().toLowerCase().charAt(0);

            // Проверка на повторный ввод буквы
            if (guessedLetters.contains(letter)) {
                System.out.println("Вы уже вводили эту букву. Попробуйте другую.");
                continue;
            }

            guessedLetters.add(letter);

            // Проверка наличия буквы в слове
            if (wordToGuess.indexOf(letter) != -1) {
                System.out.println("Верно!");
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == letter) {
                        guessedWord.set(i, letter);
                    }
                }
            } else {
                attemptsLeft--;
                System.out.println("Неверно! Осталось попыток: " + attemptsLeft);
            }

            // Проверка на победу
            if (!guessedWord.contains('_')) {
                System.out.println("\nПоздравляем! Вы угадали слово: " + wordToGuess);
                return;
            }
        }

        // Если попытки закончились, выводим сообщение о поражении
        System.out.println("\nВы проиграли! Загаданное слово было: " + wordToGuess);
    }

    private static String getWordDisplay(List<Character> guessedWord) {
        StringBuilder display = new StringBuilder();
        for (Character c : guessedWord) {
            display.append(c).append(' ');
        }
        return display.toString().trim();
    }
}
