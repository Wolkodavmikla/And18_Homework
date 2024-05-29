package example2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] words) {
            Map<String, Integer> wordCount = new HashMap<>();
            Map<String, Boolean> result = new HashMap<>();

            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                result.put(entry.getKey(), entry.getValue() >= 2);
            }

            return result;

    }

}

