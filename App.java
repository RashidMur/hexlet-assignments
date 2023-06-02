package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String setOfLetters, String word) {
        var anyWordLower = word.toLowerCase();
        char[] letters = setOfLetters.toCharArray();
        char[] anyWord = anyWordLower.toCharArray();
        List<Character> setOfLettersList = new ArrayList<>();
        List<Character> wordList = new ArrayList<>();
        for (char w : anyWord) {
            wordList.add(w);
        }
        for (char l : letters) {
            if (wordList.contains(l)) {
                setOfLettersList.add(l);
            }
        }
        for (Character s : wordList) {
            if (setOfLettersList.contains(s)) {
                setOfLettersList.remove(s);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
