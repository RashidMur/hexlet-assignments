package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.equals("")) {
            return new HashMap<>();
        }
        String[] sentences = sentence.split(" ");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : sentences) {
            int quantity = 1;
            if (wordsCount.containsKey(word)) {
                quantity = wordsCount.get(word);
                quantity++;
            }
            wordsCount.put(word, quantity);
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount){
        String result = "{\n";
        if (wordsCount.isEmpty()) {
            return "{}";
        }
        for (Map.Entry<String, Integer> word: wordsCount.entrySet()) {
            result = result + "  " + word.getKey() + ": " + word.getValue() + "\n";
        }
        return result += "}";
    }
}
//END
