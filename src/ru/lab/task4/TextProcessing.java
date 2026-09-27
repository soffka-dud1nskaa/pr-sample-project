package ru.lab.task4;
public class TextProcessing {
    public void run() {
        System.out.println("\n=== Задание №4: Обработка текста ===");

        checkPalindrome();
        reverseWords();
        countCharacters();
        caesarCipher();
        findLongestWord();
    }

    // 1. Проверка строки на палиндром
    private void checkPalindrome() {
        System.out.println("\n1. Проверка на палиндром:");

        String text = "А роза упала на лапу Азора";

        String normalized = text.toLowerCase();

        char[] chars = normalized.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        boolean palindrome = true;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(chars[left])) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(chars[right])) {
                right--;
            }

            if (chars[left] != chars[right]) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println("Строка: " + text);
        System.out.println("Палиндром: " + palindrome);


    }

    // 2. Разворот порядка слов
    private void reverseWords() {
        System.out.println("\n2. Разворот порядка слов:");

        String text = "кот съел мышь";

        String[] words = text.split(" ");

        System.out.print("Исходная строка: " + text);
        System.out.print("\nРезультат: ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);

            if (i > 0) {
                System.out.print(" ");
            }
        }

        System.out.println();


    }

    // 3. Подсчет гласных, согласных, цифр и пробелов
    private void countCharacters() {
        System.out.println("\n3. Подсчет символов:");

        String text = "Hello Java 123";

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        char[] chars = text.toCharArray();

        for (char ch : chars) {

            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else if (isVowel(ch)) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        System.out.println("Строка: " + text);
        System.out.println("Гласных: " + vowels);
        System.out.println("Согласных: " + consonants);
        System.out.println("Цифр: " + digits);
        System.out.println("Пробелов: " + spaces);


    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a'
                || ch == 'e'
                || ch == 'i'
                || ch == 'o'
                || ch == 'u'
                || ch == 'y';
    }

    // 4. Шифр Цезаря
    private void caesarCipher() {
        System.out.println("\n4. Шифр Цезаря:");

        String text = "Hello Java";
        int k = 3;

        String encrypted = caesar(text, k);
        String decrypted = caesar(encrypted, -k);

        System.out.println("Исходная строка: " + text);
        System.out.println("Сдвиг: " + k);
        System.out.println("Зашифрованная строка: " + encrypted);
        System.out.println("Расшифрованная строка: " + decrypted);


    }

    private String caesar(String text, int k) {
        char[] chars = text.toCharArray();

        k = k % 26;

        for (int i = 0; i < chars.length; i++) {

            char ch = chars[i];

            if (ch >= 'A' && ch <= 'Z') {
                chars[i] = (char) ('A' + (ch - 'A' + k + 26) % 26);
            } else if (ch >= 'a' && ch <= 'z') {
                chars[i] = (char) ('a' + (ch - 'a' + k + 26) % 26);
            }
        }

        return new String(chars);
    }

    // 5. Поиск самого длинного слова
    private void findLongestWord() {
        System.out.
                println("\n5. Самое длинное слово:");

        String text = "Java программирование очень интересно";

        String[] words = text.split(" ");

        String longest = "";

        for (String word : words) {

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Строка: " + text);
        System.out.println("Самое длинное слово: " + longest);


    }

    }