import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Пример текста: Чай - всему ЧАЙ. Если не Чай, то что?";

        // Удаляем знаки препинания и приводим к нижнему регистру
        text = text.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").toLowerCase();

        // Разделяем текст на слова
        String[] words = text.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        Set<String> uniqueWords = new TreeSet<>(wordCount.keySet());

        System.out.println("Список уникальных слов (по алфавиту): " + uniqueWords);

        System.out.println("Количество уникальных слов: " + uniqueWords.size());

        System.out.println("Частота появления слов:");
        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}