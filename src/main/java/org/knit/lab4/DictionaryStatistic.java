package org.knit.lab4;
import java.util.*;

class DictionaryStatistic {
    private String[] words;          // Список слов из словаря
    private int dictionarySize;      // Количество слов
    private int polindrom;           // Количество слов-палиндромов
    private int maxWordLength;       // Максимальная длина слова
    private int minWordLength;       // Минимальная длина слова
    private char[] alphabet;         // Алфавит
    private int[] frequency;         // Частота букв в словаре

    public DictionaryStatistic(String[] words, char[] alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        this.frequency = new int[alphabet.length];
        calculateStatistics();
    }


    private void calculateStatistics() {
        this.dictionarySize = words.length;
        this.minWordLength = Integer.MAX_VALUE;
        this.maxWordLength = 0;
        this.polindrom = 0;

        for (String word : words) {
            int wordLength = word.length();

            // Обновляем максимальную и минимальную длину слова
            if (wordLength > maxWordLength) maxWordLength = wordLength;
            if (wordLength < minWordLength) minWordLength = wordLength;

            // Проверяем на палиндром
            if (isPalindrome(word)) polindrom++;

            // Считаем частоту букв
            countLetters(word);
        }
    }

    // Проверяет, является ли слово палиндромом
    private boolean isPalindrome(String word) {
        int len = word.length();
        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Увеличивает частоту букв в слове
    private void countLetters(String word) {
        for (char ch : word.toCharArray()) {
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] == ch) {
                    frequency[i]++;
                    break;
                }
            }
        }
    }

    // Возвращает случайное слово из словаря
    public String getRandomWord() {
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }

    // Выводит статистику символов
    public void printSymbolsStat() {
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + " - " + frequency[i]);
        }
    }

    // Выводит общую статистику
    public void printStatistics() {
        System.out.println("Количество слов в словаре: " + dictionarySize);
        System.out.println("Количество палиндромов: " + polindrom);
        System.out.println("Максимальная длина слова: " + maxWordLength);
        System.out.println("Минимальная длина слова: " + minWordLength);
    }
}

