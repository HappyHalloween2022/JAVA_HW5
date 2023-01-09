import java.util.HashMap;
import java.util.Map;

/**
 * count
 */
public class count {

    public static void main(String[] args) {
    }
    /**
     * @param words1
     * @param words2
     * @return
     */
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> cnt = new HashMap<>();
        for (String w1 : words1) {
        cnt.put(w1, cnt.getOrDefault(w1, 0) + 1);
        }
        Map<String, Integer> cnt1 = cnt;
        final Map<String, Integer> cnt = new HashMap<>();
        for (String w2 : words2) {
        cnt.put(w2, cnt.getOrDefault(w2, 0) + 1);
        }
        Map<String, Integer> cnt2 = cnt;
        int ans = 0;
        for (String w : words1) {
        if (cnt1.getOrDefault(w, 0) == 1 && cnt2.getOrDefault(w, 0) == 1) {
        ++ans;
        }
        }
        return ans;
        }
       }